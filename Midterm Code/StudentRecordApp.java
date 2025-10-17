import java.util.Scanner;
import javax.swing.JOptionPane;

public class StudentRecordApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = "0000001";
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String suffix = "";
        int age = 0;
        String yearLevel = "";
        String phoneNumber = "";
        String email = "";
        String department = "College of Computer Studies Department (CCSD)";
        String course = "Bachelor of Science in Information Technology";
        String courseCode = "BSIT";

        int choice;

        do {
            System.out.println("\n=====================================");
            System.out.println("Student Record Management App v1");
            System.out.println("Selection Menu:");
            System.out.println("-------------------------------------");
            System.out.println("1. Create Student Record");
            System.out.println("0. Exit");
            System.out.println("-------------------------------------");
            System.out.print("Enter Selection: ");
            choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.println("\n=====================================");
                System.out.println("Student Record Management App v1");
                System.out.println("Enter Student Details:");
                System.out.println("-------------------------------------");
                System.out.println("Student ID No. " + id);
                System.out.print("Enter Student First Name: ");
                firstName = input.nextLine();
                System.out.print("Enter Student Middle Name: ");
                middleName = input.nextLine();
                System.out.print("Enter Student Last Name: ");
                lastName = input.nextLine();
                System.out.print("Enter Suffix (if none, press Enter): ");
                suffix = input.nextLine();
                System.out.print("Enter Age: ");
                age = input.nextInt();
                input.nextLine();
                System.out.print("Enter Year Level: ");
                yearLevel = input.nextLine();
                System.out.print("Enter Phone Number: ");
                phoneNumber = input.nextLine();
                System.out.print("Enter Email: ");
                email = input.nextLine();

                int recordChoice;
                do {
                    System.out.println("\n=====================================");
                    System.out.println("Student Record Management App v1");
                    System.out.println("Student Record Selection Menu:");
                    System.out.println("-------------------------------------");
                    System.out.println("1. Update Student Profile Details");
                    System.out.println("2. Update Student Course Details");
                    System.out.println("3. Display Student Record");
                    System.out.println("0. Exit");
                    System.out.println("-------------------------------------");
                    System.out.print("Enter Selection: ");
                    recordChoice = input.nextInt();
                    input.nextLine();

                    switch (recordChoice) {
                        case 1:
                            int updateChoice;
                            do {
                                System.out.println("\n=====================================");
                                System.out.println("Student Record Management App v1");
                                System.out.println("Student Profile Details Update Selection Menu:");
                                System.out.println("-------------------------------------");
                                System.out.println("1. Update Student ID");
                                System.out.println("2. Update First Name");
                                System.out.println("3. Update Middle Name");
                                System.out.println("4. Update Last Name");
                                System.out.println("5. Update Suffix");
                                System.out.println("6. Update Age");
                                System.out.println("7. Update Year Level");
                                System.out.println("8. Update Phone Number");
                                System.out.println("9. Update Email");
                                System.out.println("0. Return");
                                System.out.println("-------------------------------------");
                                System.out.print("Enter Selection: ");
                                updateChoice = input.nextInt();
                                input.nextLine();

                                switch (updateChoice) {
                                    case 1:
                                        System.out.print("Enter New Student ID: ");
                                        id = input.nextLine();
                                        break;
                                    case 2:
                                        System.out.print("Enter First Name: ");
                                        firstName = input.nextLine();
                                        break;
                                    case 3:
                                        System.out.print("Enter Middle Name: ");
                                        middleName = input.nextLine();
                                        break;
                                    case 4:
                                        System.out.print("Enter Last Name: ");
                                        lastName = input.nextLine();
                                        break;
                                    case 5:
                                        System.out.print("Enter Suffix: ");
                                        suffix = input.nextLine();
                                        break;
                                    case 6:
                                        System.out.print("Enter Age: ");
                                        age = input.nextInt();
                                        input.nextLine();
                                        break;
                                    case 7:
                                        System.out.print("Enter Year Level: ");
                                        yearLevel = input.nextLine();
                                        break;
                                    case 8:
                                        System.out.print("Enter Phone Number: ");
                                        phoneNumber = input.nextLine();
                                        break;
                                    case 9:
                                        System.out.print("Enter Email: ");
                                        email = input.nextLine();
                                        break;
                                    case 0:
                                        break;
                                    default:
                                        System.out.println("Invalid selection!");
                                }
                            } while (updateChoice != 0);
                            break;

                        case 2:
                            System.out.println("\n=====================================");
                            System.out.println("Student Record Management App v1");
                            System.out.println("Select Student Course Details: (Update)");
                            System.out.println("-------------------------------------");
                            System.out.println("1. Bachelor of Science in Information Technology (BSIT)");
                            System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
                            System.out.println("3. Associate of Computer Technology (ACT)");
                            System.out.println("4. Bachelor of Science in Mechanical Engineering (BSME)");
                            System.out.println("5. Bachelor of Science in Civil Engineering (BSCE)");
                            System.out.println("-------------------------------------");
                            System.out.print("Enter Selection: ");
                            int courseChoice = input.nextInt();
                            input.nextLine();

                            switch (courseChoice) {
                                case 1:
                                    course = "Bachelor of Science in Information Technology";
                                    courseCode = "BSIT";
                                    break;
                                case 2:
                                    course = "Bachelor of Science in Computer Science";
                                    courseCode = "BSCS";
                                    break;
                                case 3:
                                    course = "Associate of Computer Technology";
                                    courseCode = "ACT";
                                    break;
                                case 4:
                                    course = "Bachelor of Science in Mechanical Engineering";
                                    courseCode = "BSME";
                                    break;
                                case 5:
                                    course = "Bachelor of Science in Civil Engineering";
                                    courseCode = "BSCE";
                                    break;
                                default:
                                    System.out.println("Invalid selection!");
                            }
                            break;

                        case 3:
                            String recordDisplay =
                                    "=====================================\n" +
                                    " Student Record Management App v1\n" +
                                    "=====================================\n" +
                                    "Student ID: " + id + "\n" +
                                    "First Name: " + firstName + "\n" +
                                    "Middle Name: " + middleName + "\n" +
                                    "Last Name: " + lastName + "\n" +
                                    "Suffix: " + suffix + "\n" +
                                    "Age: " + age + "\n" +
                                    "Year Level: " + yearLevel + "\n" +
                                    "Phone Number: " + phoneNumber + "\n" +
                                    "Email: " + email + "\n" +
                                    "Course Name: " + course + "\n" +
                                    "Course Code: " + courseCode + "\n" +                                    
                                    "Department: " + department + "\n" +
                                    "=====================================";

                            JOptionPane.showMessageDialog(null, recordDisplay, 
                                    "Student Record", JOptionPane.INFORMATION_MESSAGE);
                            break;

                        case 0:
                            break;

                        default:
                            System.out.println("Invalid selection!");
                    }
                } while (recordChoice != 0);
            }
        } while (choice != 0);

        input.close();
        System.out.println("Exiting program...");
    }
}
