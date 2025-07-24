package conditionalstatements;
import java.util.Scanner;
public class collegecourse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semester = sc.nextInt();
        switch (semester) {
            case 1:
            case 2:
                System.out.println("Basic Science Subjects");
                break;

            case 3:
            case 4:
                System.out.println("Enter department (CS/ME): ");
                String department = sc.next();
                if (department.equalsIgnoreCase("CS")) {
                    System.out.println("Subjects: DS, DBMS");
                } else if (department.equalsIgnoreCase("ME")) {
                    System.out.println("Subjects: Thermo, Fluids");
                } else {
                    System.out.println("Unknown department");
                }
                break;

            case 5:
            case 6:
                System.out.println("Enter earned credits: ");
                int credits = sc.nextInt();
                if (credits > 20) {
                    System.out.println("Include electives");
                } else {
                    System.out.println("Core subjects only");
                }
                break;

            case 7:
            case 8:
                System.out.println("Has internship been completed? (true/false): ");
                boolean internshipDone = sc.nextBoolean();
                if (internshipDone) {
                    System.out.println("Project Options available");
                } else {
                    System.out.println("Internship Reminder");
                }
                break;

            default:
                System.out.println("Invalid semester");
        }
    }
}

