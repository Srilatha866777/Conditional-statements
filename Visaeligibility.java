package conditionalstatements;

import java.util.Scanner;

public class Visaeligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean passport=false;
        boolean noCriminalRecord=true;
        if(age>=18 && passport && noCriminalRecord){
            System.out.println("Eligible for visa");
        }
        else if(age>=18 && noCriminalRecord){
            System.out.println("Apply for passport first");
        }
        else{
            System.out.println("not eligible");
        }
        
    }
    
}
