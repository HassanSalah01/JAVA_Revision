import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO OUR BANK  ");
        System.out.println("_______________________\n");
        System.out.println("For\n   Log In : Press (1) \n   New User : Press (2)");
        int x = scanner.nextInt();
        if(x==1){
            System.out.println("Please Enter Your Username : ");
            String userName = scanner.nextLine();
            System.out.println("Please Enter Your Password");
            String password =scanner.nextLine(); 
        }else{
            // create acount class 
        }

    }
}
