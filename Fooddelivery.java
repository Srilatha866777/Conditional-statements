package conditionalstatements;
  import java.util.Scanner;
public class Fooddelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();
        switch (mode) {
            case 1: 
                boolean storeOpen = sc.nextBoolean();
                if (storeOpen) {
                    System.out.println("Pickup allowed");
                } else {
                    System.out.println("Store is closed");
                }
                break;

            case 2: 
                int distance = sc.nextInt();
                boolean deliveryAvailable = sc.nextBoolean();
                if (distance <= 10 && deliveryAvailable) {
                    System.out.println("Delivery allowed");
                } else {
                    System.out.println("Not Deliverable");
                }
                break;

            case 3: 
                boolean tableAvailable = sc.nextBoolean();
                if (tableAvailable) {
                    System.out.println("Table booked");
                } else {
                    System.out.println("No table available");
                }
                break;

            default:
                System.out.println("Invalid mode selected");
        }
    }
}

