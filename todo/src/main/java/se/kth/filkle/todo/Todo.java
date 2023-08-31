package se.kth.filkle.todo;

import java.time.*;

public class Todo {

    public enum Priority{
        LOW, MEDIUM, HIGH;
    }
    private final String title;

    private String description;

    private LocalDate updateDate;

    private boolean flag;

    private final Priority priority;
    public Todo(String title, String description, Priority priority){
        this.title = title;
        this.description = description;
        this.updateDate = LocalDate.now();
        this.flag = false;
        this.priority = priority;
    }
    public Todo(String title, String description){
        this(title,description,Priority.MEDIUM);
    }

    public Priority getPriority(){
        return priority;
    }
    public String getTitle() {
        return title;
    }
    public String getDescription() {
        return description;
    }

    public LocalDate getUpdateDate(){
        return updateDate;
    }

    public boolean getFlag(){
        return flag;
    }

    public String toString(){
        return title + ": " + description + ", Priority: " + priority + " Finished? " + flag + " (" + updateDate + ")";
    }

    public void addDescription(String text){
        this.description += text;
        this.updateDate = LocalDate.now();
    }

    public void taskFinish(){
        this.flag = true;
    }
}
