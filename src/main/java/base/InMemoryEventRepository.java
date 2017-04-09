package base;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryEventRepository implements EventRepository {
  
  private static AtomicLong counter = new AtomicLong();
  
  private final ConcurrentMap<Long, Event> events = new ConcurrentHashMap<Long, Event>();

  @Override
  public Iterable<Event> findAll() {
    return this.events.values();
  }

  @Override
  public Event save(Event event) {
    if (event.getId() == null) {
      Long id = counter.incrementAndGet();
      event.setId(id);
      this.events.put(id, event);
    } else {
      this.events.put(event.getId(), event);
    }
    return event;
  }

  @Override
  public List<Event> save(List<Event> events) {
    for (Event e : events) {
      save(e);
    }
    return events;
  }

  @Override
  public Event findEvent(Long id) {
    return this.events.get(id);
  }

  @Override
  public Event deleteEvent(Long id) {
    return this.events.remove(id);
  }

}
