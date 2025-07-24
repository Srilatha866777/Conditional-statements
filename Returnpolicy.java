package conditionalstatements;

import java.util.Scanner;

public class Returnpolicy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int category=sc.nextInt();
        switch (category) {
            case 1:
             int dayspur=sc.nextInt();
             if(dayspur<=7){
                System.out.println(("return allowed"));
             }else{
                System.out.println("not allowed");
             }
                 break;
            case 2:
            boolean istagAttached=true;
            if(istagAttached){
                System.out.println("return allowed");
            } else{
                  System.out.println("not allowed");
            } 
            break;
            case 3:
            System.out.println("books are return not allowed");
            System.out.println("Denied");
            break;
            default:
            System.out.println("invalid category");
                break;
        }
    }
    
}
