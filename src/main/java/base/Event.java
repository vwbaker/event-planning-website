package base;

import java.util.ArrayList;


public class Event {
  
  private Long id;
  private String eventName;
  private ArrayList<String> guests;
  private String date;
  private String location;
  private String description;
  private String theme;
  private ArrayList<String> items;
  private String budget;
  
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
  
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }
  
  public ArrayList<String> getGuests() {
    return guests;
  }
  
  public void setGuests(ArrayList<String> guests) {
    this.guests = guests;
  }
  
  public String getDate() {
    return date;
  }
  
  public void setDate(String date) {
    this.date = date;
  }
  
  public String getLocation() {
    return location;
  }
  
  public void setLocation(String location) {
    this.location = location;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getTheme() {
    return theme;
  }
  
  public void setTheme(String theme) {
    this.theme = theme;
  }
  
  public Long getId() {
    return id;
  }
  
  public void setId(Long id) {
    this.id = id;
  }
  
  public ArrayList<String> getItems() {
    return items;
  }

  public void setItems(ArrayList<String> items) {
    this.items = items;
  }
  
  public String getBudget() {
    return budget;
  }
  
  public void setBudget(String budget) {
    this.budget = budget;
  }
  
}
