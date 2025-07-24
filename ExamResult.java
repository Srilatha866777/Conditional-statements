package conditionalstatements;

import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
        if(sub1>=35 && sub2>=35 && sub3>=35 && sub4>=35 && sub5>=35){
        int avgmarks=(sub1+sub2+sub3+sub4+sub5)/5;
        if(avgmarks>=90){
            System.out.println("outstanding");
        }
        else if(avgmarks>=75){
            System.out.println("Distinction");
        }
        else if(avgmarks>=60){
            System.out.println("First class");
        }
        else{
            System.out.println("pass");
        }
    }
        else{
            System.out.println("fails");
        }
    }
}
