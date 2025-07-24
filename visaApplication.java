package conditionalstatements;

import java.util.Scanner;

public class visaApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean passport=false;
        if(age>=18 && passport){
            System.out.println("visa applictation is accepted");
        }
        else if(age>=18){
            System.out.println("visa application is rejected");
        }
        else{
            System.out.println("visa is not allowed");
        }
    }
}
