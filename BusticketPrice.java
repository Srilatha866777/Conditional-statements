package conditionalstatements;

import java.util.Scanner;

public class BusticketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        int distance = sc.nextInt();        
        int fare = 0;
        if (distance < 50) {
            fare = 50;
        } 
        else if (distance <= 100) {
            fare = 100;
        } 
        else {
            System.out.print("Enter day type (weekday/weekend): ");
        String dayType = sc.nextLine();
        switch (dayType) {
            case "weekday":
                if(distance>100){
                    fare=200;
                }
                break;
            case "weekend":
             if(distance>100){
                fare=300;
             }
        
            default:
            System.out.println("invalid day");
                break;
        }       
        }
        System.out.println("Bus fare is: ₹" + fare);
    }
}
