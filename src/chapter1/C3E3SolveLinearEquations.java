package chapter1;

import java.util.Scanner;

public class C3E3SolveLinearEquations {
    public static void main(String[] args) {
        System.out.println("Enter a, b, c, d, e, f: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double check = a*d-b*c;
        if( check == 0) {

            System.out.println("The equation has no solution");

        }
        else{
            double x = (e*d-b*f)/check;
            double y = (a*f-e*c)/check;
            System.out.println("x is" + x + "and y is" + y);
        }

    }
}