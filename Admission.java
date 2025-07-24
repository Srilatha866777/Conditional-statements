package conditionalstatements;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int percentage=sc.nextInt();
        boolean sportsCertificate=true;
      int familyincome=sc.nextInt();
      boolean volunteerexperince=true;
      if(percentage>=90 && sportsCertificate && familyincome<=200000){
        System.out.println("full scholrship");
      }
      else if(percentage>=85 && (sportsCertificate || volunteerexperince)){
        System.out.println("partial scholarship");
      }
      else{
        System.out.println("No scholrship");
      }

    }
}
