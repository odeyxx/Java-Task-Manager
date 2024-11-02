import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nTask Manager");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Remove a task");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            // Check for valid integer input
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Consume the invalid input and continue
                continue;
            }

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (option) {
                case 1:
                    System.out.print("Enter the task description: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.println("\nYour tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the task number to remove: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.next(); // Consume the invalid input
                        continue;
                    }

                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                        System.out.println("Task removed successfully!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting Task Manager. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

