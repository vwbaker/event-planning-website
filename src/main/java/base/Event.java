package base;


public class Event {
  
  private String eventName;
  private String guests;
  private String date;
  private String location;
  private String description;
  private String theme;
  
  public Event(String eventName, String guests, String date, String location, String description, String theme) {
    this.eventName = eventName;
    this.guests = guests;
    this.date = date;
    this.location = location;
    this.description = description;
    this.theme = theme;
  }
  
  public String getEventName() {
    return eventName;
  }
  
  public String getGuests() {
    return guests;
  }
  
  public String getDate() {
    return date;
  }
  
  public String getLocation() {
    return location;
  }
  
  public String getDescription() {
    return description;
  }
  
  public String getTheme() {
    return theme;
  }
  
}
