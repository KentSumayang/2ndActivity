package Calculation;
import java.util.*;
public class multiplication extends display {
    void result(){
        Scanner product = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = product.nextInt();
        
        System.out.print("Second Num: ");
        int y = product.nextInt();
        
        int mul = x + y;
        System.out.println("The total is " + mul);
    }
}
