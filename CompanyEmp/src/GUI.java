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
    public static void signIn(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please Enter Your UserName ");
        String userName = scan.nextLine();
        System.out.println("Pleas Enter Your PassWord");
        String password = scan.nextLine();
    }
    public static void createNewUser(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please Enter Name");
        String userName = scan.nextLine();
        System.out.println("Pleas Departmet ");
        String password = scan.nextLine();
    }
    public static void createEmployee(int empType){
        if(empType==1){
            signIn();
            //login Page
        }else{
            createNewUser();
        }

    }
    
}
