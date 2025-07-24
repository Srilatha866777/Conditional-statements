package conditionalstatements;

import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        boolean member=false;
        if(amount>=10000 && member){ 
            System.out.println("she gets 30% discount");
        }
        else if(amount>=5000 && member){
            System.out.print("she gets 20% discount");
        }
        else
        {
            System.out.println("she gets 5% discount");
        }
    }
    
}
