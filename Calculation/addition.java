package Calculation;
import java.util.Scanner;

public class addition extends display {
    
    
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = sum.nextInt();
        
        System.out.print("Second Num: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("The total is " + add);
    }
}


