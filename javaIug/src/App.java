import java.util.Scanner;

public class App {
    public static int[] test (){
        int[] arr = {3,3};
        int[] arr2 = new int[2];
        int target = 6;
        for(int i = 0 ; i < arr.length;i++){
            int rem = target-arr[i];
            for (int j = 0 ; j < arr.length;j++){
                if(arr[j]==rem && i!=j){
                    System.out.println(i+" -- "+j);
                    arr2[0]= i ;
                    arr2[1]=j;
                    return arr2;
                }
            }
        }
        return arr2;
    }
    
    public static void main(String[] args) throws Exception {
        test();
        

    }
}
