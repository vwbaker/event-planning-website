package base;

import java.util.ArrayList;


public class Event {
  
  private Long id;
  private String eventName;
  private ArrayList<String> guests = new ArrayList<String>();
  private String date;
  private String location;
  private String description;
  private String theme;
  
  public Event(String eventName, ArrayList<String> guests, String date, String location, String description, String theme) {
    this.eventName = eventName;
    this.guests = guests;
    this.date = date;
    this.location = location;
    this.description = description;
    this.theme = theme;
  }
  
  public Event() { }
  
  public String getEventName() {
    return eventName;
  }
  
  public ArrayList<String> getGuests() {
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
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
}