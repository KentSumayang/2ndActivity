package Calculation;
import java.util.*;
public class display {
    public static void main(String[] args){
        Scanner calcu = new Scanner(System.in);

        System.out.println("This is a simple calculation using inheritance!");
        System.out.println("first num: ");
        int fnum = calcu.nextInt();
        System.out.println("second num: ");
        int snum = calcu.nextInt();



        addition add = new addition();
        subtraction sub = new subtraction();
        multiplication mul = new multiplication();
        division div = new division();
        add.result(fnum, snum);
        sub.result(fnum, snum);
        mul.result(fnum, snum);
        div.result(fnum, snum);

    }
    
}