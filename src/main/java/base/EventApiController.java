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
@RequestMapping("/event")
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

  @GetMapping("{id}")
  public Event find(@PathVariable Long id) {
      return eventRepository.findEvent(id);
  }

  @PostMapping
  public Event create(@RequestBody Event input) {
      if (input.getId() == null) {
        return eventRepository.save(new Event(input.getEventName(), input.getGuests(), input.getDate(),
          input.getLocation(), input.getDescription(), input.getTheme()));
      } else {
        return update(input.getId(), input);
      }
  }

  @DeleteMapping("{id}")
  public Event delete(@PathVariable Long id) {
      return eventRepository.deleteEvent(id);
  }

  @PutMapping("{id}")
  public Event update(@PathVariable Long id, @RequestBody Event input) {
      Event event = eventRepository.findEvent(id);
      if (event == null) {
        return create(event);
      } else {
        if (input.getEventName() != null) {
          event.setEventName(input.getEventName());
        }
        if (input.getGuests() != null) {
          event.setGuests(input.getGuests());
        }
        if (input.getDate() != null) {
          event.setDate(input.getDate());
        }
        if (input.getLocation() != null) {
          event.setLocation(input.getLocation());
        }
        if (input.getDescription() != null) {
          event.setDescription(input.getDescription());
        }
        if (input.getTheme() != null) {
          event.setTheme(input.getTheme());
        }
        if (input.getBudget() != null) {
          event.setBudget(input.getBudget());
        }
        if (input.getItems() != null) {
          event.setItems(input.getItems());
        }
        return eventRepository.save(event);
      }
  }
  
}
