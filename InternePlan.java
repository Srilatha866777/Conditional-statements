package conditionalstatements;

import java.util.Scanner;

public class InternePlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currplan=sc.nextLine().toLowerCase();
        int usag=sc.nextInt();
        if(currplan.equals("basic")){
            if(usag>500){
                System.out.println("Premium");
            }
            else {
                System.out.println("continue with the same plan");
            }
        }
        else if(currplan.equals("standard")){
            if(usag>1000){
                System.out.println("ultra");
            }
            else{
                 System.out.println("continue with the same plan");
            }
        }
        else{
            System.out.println(("invalid current plan"));
        }
    }
}
