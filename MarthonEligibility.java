package conditionalstatements;

import java.util.Scanner;

public class MarthonEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean medicalcerti=false;
        if(age>=18 && age<=45 && medicalcerti){
            System.out.println("participation");
        }
        else if(age<18 || age>45){
            System.out.println("participation is not allowed");
        }
        else{
            System.out.println(("participation denied"));
        }
    }
}
