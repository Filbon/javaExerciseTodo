package se.kth.filkle.todo;


public class Main{


    public static void main(String[] args) {
        Todo list = new Todo("Programmera","Gör klart alla övningar (1-8) denna vecka", Todo.Priority.HIGH);
        System.out.println(list.toString());
        list.taskFinish();
        System.out.println(list.toString());
        Todo todo = new Todo("Lunch", "Laga och ät lunch");
        System.out.println(todo.toString());
    }
}