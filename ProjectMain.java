package projectmain;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ProjectMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();
        Queue queue = new Queue();
        int choice;

        do {
            // Main menu
            System.out.println("\nMain Menu:");
            System.out.println("1. Stack Operations");
            System.out.println("2. Queue Operations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:// Stack Operations
                    int sChoice;
                    do {
                        System.out.println("\nStack Operations:");
                        System.out.println("1. Fill Stack with sample data");
                        System.out.println("2. Transfer entire Stack into a Queue");
                        System.out.println("3. Transfer only elements with even Age into a Queue");
                        System.out.println("4. Print the Stack");
                        System.out.println("5. Print the resulting Queue");
                        System.out.println("6. Delete All Queue Contents");
                        System.out.println("7. Return to Main Menu");
                        System.out.print("Enter your choice: ");
                        sChoice = input.nextInt();

                        switch (sChoice) {
                            case 1:
                                stack.push(new Student("Zain", "F", 202211177, 20));
                                stack.push(new Student("Najla", "F", 202123244, 21));
                                stack.push(new Student("Yousef", "M", 201811234, 23));
                                stack.push(new Student("Malak", "F", 202301123, 19));
                                stack.push(new Student("Asmaa", "F", 202311081, 19));
                                System.out.println("Stack filled.");
                                break;
                            case 2:
                                if (stack.isEmpty()) {
                                    System.out.println("Fill the Stack first.");
                                } else {
                                    queue = stack.StoQ(stack);
                                    System.out.println("Transferred entire Stack to Queue.");
                                }
                                break;
                            case 3:
                                if (stack.isEmpty()) {
                                    System.out.println("Fill the Stack first.");
                                } else {
                                    queue = stack.EvenStoQ(stack);
                                    System.out.println("Transferred even-Age elements from Stack to Queue.");
                                }
                                break;
                            case 4:
                                if (stack.isEmpty()) {
                                    System.out.println("Fill the Stack first.");
                                } else {
                                    System.out.println("Stack contents:");
                                    stack.display();
                                }
                                break;
                            case 5:
                                if(queue.isEmpty()){
                                    System.out.println("Queue is empty");
                                }else {
                                    System.out.println("Queue contents:");
                                    queue.display_Queue();
                                }
                                break;
                            case 6:
                                queue = stack.DeleteQ(queue);
                                break;
                            case 7:
                                queue = stack.DeleteQ(queue);
                                stack = queue.DeleteS(stack);
                                break;
                            default:
                                System.out.println("Invalid choice.");
                        }
                    } while (sChoice != 7);
                    break;
                case 2:
                    int qChoice;
                    do {
                        System.out.println("\nQueue Operations:");
                        System.out.println("1. Fill Queue with sample data");
                        System.out.println("2. Transfer entire Queue into a Stack");
                        System.out.println("3. Transfer only elements with even Age into a Stack");
                        System.out.println("4. Print the Queue");
                        System.out.println("5. Print the resulting Stack");
                        System.out.println("6. Delete All Stack Contents");
                        System.out.println("7. Return to Main Menu");
                        System.out.print("Enter your choice: ");
                        qChoice = input.nextInt();
                        switch(qChoice){
                            case 1:
                                queue.enqueue(new Student("Eyad", "M", 201913123, 23));
                                queue.enqueue(new Student("Bashar", "M", 202221137, 20));
                                queue.enqueue(new Student("Yasmen", "F", 201413176, 29));
                                queue.enqueue(new Student("Mohammed", "M", 202514157, 17));
                                queue.enqueue(new Student("Kamel", "M", 201713176, 24));
                                System.out.println("Queue is Filled");
                                break;
                            case 2:
                                if(queue.isEmpty()){
                                    System.out.println("Fill the Queue first");
                                }else{
                                stack = queue.QtoS(queue);
                                System.out.println("Transferred entire Queue to Stack.");}
                                break;
                            case 3:
                                if(queue.isEmpty()){
                                    System.out.println("Fill the Queue first");
                                }else{
                                stack = queue.EvenQtoS(queue);
                                System.out.println("Transferred even-Age elements from Queue to Stack.");}
                                break;
                            case 4:
                                if(queue.isEmpty()){
                                    System.out.println("Queue is empty");
                                }else{
                                    System.out.println("Queue contents:");
                                    queue.display_Queue();
                                }
                                break;
                            case 5:
                                if(stack.isEmpty()){
                                    System.out.println("Stack is empty");
                                }else{
                                    System.out.println("Stack contents");
                                    stack.display();
                                }
                            case 6:
                                stack = queue.DeleteS(stack);
                                break;
                            case 7:
                                stack = queue.DeleteS(stack);
                                queue = stack.DeleteQ(queue);
                                break;
                            default:
                                System.out.println("Invalid Choice");
                        }
                    }while(qChoice != 7);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
}