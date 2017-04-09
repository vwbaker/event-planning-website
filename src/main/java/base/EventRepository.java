package base;

import java.util.List;

public interface EventRepository {
  
  Iterable<Event> findAll();

  Event save(Event event);

  List<Event> save(List<Event> events);

  Event findEvent(Long id);

  Event deleteEvent(Long id);
  
}
