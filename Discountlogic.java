package conditionalstatements;

import java.util.Scanner;

public class Discountlogic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cartamount=sc.nextInt();
        boolean ismember=true;
        boolean hascoupon=true;
        if(cartamount>5000 && ismember){
            System.out.println("25%discount");
        }
       else if(cartamount>3000 && ismember && hascoupon){
            System.out.println("20% dicount");
        }
        else if(cartamount>3000 && (ismember || hascoupon)){
            System.out.println("10% discount");
        }
        else{
            System.out.println("No discount");
        }
    
    }
}
