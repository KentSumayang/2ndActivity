package Calculation;
import java.util.*;
public class division extends display{
    void result(){
        Scanner quotient = new Scanner(System.in);
        
        System.out.print("First Num: ");
        int x = quotient.nextInt();
        
        System.out.print("Second Num: ");
        int y = quotient.nextInt();
        
        int div = x / y;
        System.out.println("The total is " + div);
    }
}
