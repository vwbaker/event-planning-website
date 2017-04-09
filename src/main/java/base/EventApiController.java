package base;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/newEvent")
public class EventApiController {
  
  private final EventRepository eventRepository;

  public EventApiController(EventRepository eventRepository) {
      this.eventRepository = eventRepository;
  }

  @GetMapping
  public ArrayList<Event> listAll() {
      ArrayList<Event> events = new ArrayList<>();
      eventRepository.findAll().forEach(event -> events.add(event));
      return events;
  }

  @GetMapping("{name}")
  public Event find(@PathVariable String name) {
      return eventRepository.findEvent(name);
  }

  @PostMapping
  public Event create(@RequestBody Event input) {
      return eventRepository.save(new Event(input.getEventName(), input.getGuests(), input.getDate(),
        input.getLocation(), input.getDescription(), input.getTheme()));
  }

  @DeleteMapping("{name}")
  public Event delete(@PathVariable String name) {
      return eventRepository.deleteEvent(name);
  }

  @PutMapping("{name}")
  public Event update(@PathVariable String name, @RequestBody Event input) {
      Event event = eventRepository.findEvent(name);
      if (event == null) {
          return null;
      } else {
          // this isn't correct
          return create(event);
      }
  }
  
}
