import java.util.Scanner;

/**
 * Created by parvas on 30.01.2016.
 */
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("First operand");
        int n1 = sc.nextInt();
        System.out.println("Operation");
        String op = sc.next();
        System.out.println("Second operand");
        int n2 = sc.nextInt();
        sc.close();

        System.out.println("Result: " + Calc.metodCalc(n1, op, n2));
    }
}
