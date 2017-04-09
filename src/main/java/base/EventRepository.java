package base;

import java.util.List;

public interface EventRepository {
  
  Iterable<Event> findAll();

  Event save(Event event);

  List<Event> save(List<Event> events);

  Event findEvent(String name);

  Event deleteEvent(String name);
  
}
