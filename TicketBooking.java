package conditionalstatements;

import java.util.Scanner;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticketprice=0;
        String day=sc.nextLine().toLowerCase();
        String seatType=sc.nextLine().toLowerCase();
        if(day.equals("weekday")){
            if(seatType.equals("vip")){
                ticketprice=500;
            }
            else if(seatType.equals("normal")){
                ticketprice=300;
            }
            else{
                System.out.println("invalid seattype");
            }
        }
        else if(day.equals("weekend")){
            if(seatType.equals("vip")){
                ticketprice=400;
            }
            else if(seatType.equals("normal")){
                ticketprice=300;
            }
            else{
                System.out.println("invalid seatType");
            }

        }
        else{
            System.out.println("invalid day");
        }
        System.out.println("ticketprice is"+ticketprice);
    }
    
}
