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
        scan.close();
    }
    public static String EmpType(int emp){
        if(emp==1){
            retrun "Part Time Employee";
        }else{
            return "Full Time Employee";
        }
    }
    public static void createNewUser(){
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please Enter Name");
        String Name = scan.nextLine();
        System.out.println("Pleas Departmet ");
        String Department = scan.nextLine();
        scan.close();
    }
    public static void createEmployee(int empType){
        if(empType==1){
            signIn();
        }else{
            createNewUser();
        }

    }
    
}
