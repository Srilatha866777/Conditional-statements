package conditionalstatements;
    import java.util.Scanner;

public class OnlinetestNavi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String questionType = sc.next();

        switch (questionType) {
            case "MCQ":
                boolean selectedOption = sc.nextBoolean();
                if (selectedOption) {
                    System.out.println("Submitted");
                } else {
                    System.out.println("Choose an option");
                }
                break;

            case "Code":
                int testCasesPassed = sc.nextInt();
                int totalTestCases = sc.nextInt();
                if (testCasesPassed == totalTestCases) {
                    System.out.println("Auto-submitted");
                } else {
                    System.out.println("Show feedback");
                }
                break;

            case "Essay":
                int wordCount = sc.nextInt();
                int minLimit = sc.nextInt();
                if (wordCount >= minLimit) {
                    System.out.println("Submit allowed");
                } else {
                    System.out.println("Write more");
                }
                break;

            default:
                System.out.println("Invalid question type");
        }
    }
}

