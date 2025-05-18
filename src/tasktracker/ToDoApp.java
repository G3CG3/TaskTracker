package tasktracker;

import java.util.Scanner;

public class ToDoApp {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner in = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the To-Do List Manager!");

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. View tasks");
            System.out.println("2. Add task");
            System.out.println("3. Remove task");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            String input = in.nextLine();

            switch (input) {
                case "1":
                    toDoList.viewTasks();
                    break;
                case "2":
                    System.out.print("Enter a new task: ");
                    String task = in.nextLine();
                    toDoList.addTask(task);
                    break;
                case "3":
                    System.out.print("Enter task number to remove: ");
                    try {
                        int index = in.nextInt();
                        in.nextLine(); // To consume the leftover newline
                        toDoList.removeTask(index);
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                    break;
                case "4":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        in.close();
    }
}
