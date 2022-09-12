package Calculation;
import java.util.*;
public class division extends display{
    void result(){
        Scanner quotient = new Scanner(System.in);
        
        System.out.print("Enter the 1st number of your choice: ");
        int x = quotient.nextInt();
        
        System.out.print("Enter the 1st number of your choice: ");
        int y = quotient.nextInt();
        
        int div = x / y;
        System.out.println("The total is " + div);
    }
}
