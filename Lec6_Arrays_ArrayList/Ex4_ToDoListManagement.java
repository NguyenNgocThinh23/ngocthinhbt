package Lec6_Arrays_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex4_ToDoListManagement {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter new task: ");
                    String task = scanner.nextLine();
                    todoList.add(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("--- To-Do List ---");
                    if (todoList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task position to remove: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= todoList.size()) {
                        todoList.remove(index - 1);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        scanner.close();
    }
}
