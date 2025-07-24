package conditionalstatements;

import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balence=sc.nextInt();
        int options=sc.nextInt();
        switch (options)
         {
            case 1: 
             int withdraamont=sc.nextInt();
            if(balence>=withdraamont && withdraamont>0){
                System.out.println("allowed");
            }
            else{
                System.out.println("insufficient funds");
            }
                
                break;
            case 2:
            int amount=sc.nextInt();
            if(amount>0){
                System.out.println(amount+balence);
            }
            case 3:
            int amou=sc.nextInt();
            String receiveraccount=sc.nextLine();
            if(amou<=balence && receiveraccount!=null){
           System.out.println("transfer");
            }else{
            System.out.println("no transfer");
            } break;
            default:
            System.out.println("choose corect option");
                break;
        }
    }
}
