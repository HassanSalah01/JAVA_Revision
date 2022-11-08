import java.util.Scanner;

public class GUI {

    public static int guiInterface(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To Company");
        System.out.println("If You Are Current Employee Please Press 1");
        System.out.println("If You Are A New Employee Please Press 2 ");
        int choice = scan.nextInt();
        scan.close();
        return choice;
    }
    public static void createEmployee(int empType){
        if(empType==1){
            //login Page
        }else{
            //Create New User Page
        }

    }
    
}
