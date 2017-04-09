package base;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class InMemoryEventRepository implements EventRepository {
  
  private final ConcurrentMap<String, Event> events = new ConcurrentHashMap<String, Event>();

  @Override
  public Iterable<Event> findAll() {
    return this.events.values();
  }

  @Override
  public Event save(Event event) {
    String name = event.getEventName();
    this.events.put(name, event);
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
  public Event findEvent(String name) {
    return this.events.get(name);
  }

  @Override
  public Event deleteEvent(String name) {
    return this.events.remove(name);
  }

}
