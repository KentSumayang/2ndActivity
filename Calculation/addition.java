package Calculation;
import java.util.*;
public class addition extends display {
    void result(){
        Scanner sum = new Scanner(System.in);
        
        System.out.print("Enter the 1st number of your choice: ");
        int x = sum.nextInt();
        
        System.out.print("Enter the 2nd number of your choice: ");
        int y = sum.nextInt();
        
        int add = x + y;
        System.out.println("The total is " + add);
    }
}
