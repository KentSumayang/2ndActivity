package Calculation;
import java.util.*;
public class multiplication extends display {
    void result(){
        Scanner product = new Scanner(System.in);
        
        System.out.print("Enter the 1st number of your choice: ");
        int x = product.nextInt();
        
        System.out.print("Enter the 2nd number of your choice: ");
        int y = product.nextInt();
        
        int mul = x + y;
        System.out.println("The total is " + mul);
    }
}
