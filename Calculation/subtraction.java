package Calculation;
import java.util.*;
public class subtraction extends display {
    void result(){
        Scanner deduct = new Scanner(System.in);
        
        System.out.print("Enter the 1st number of your choice: ");
        int x = deduct.nextInt();
        
        System.out.print("Enter the 2nd number of your choice: ");
        int y = deduct.nextInt();
        
        int sub = x - y;
        System.out.println("The total is " + sub);
    }
}
