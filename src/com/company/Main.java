/*
In high-school geometry, you learned the Pythagorean theorem for the relationship
of the lengths of the three sides of a right triangle:
a2 + b2 = c2
Most of this expression contains simple operators covered in Chapter 3. The one
piece that’s missing is taking square roots, which you can do by calling the standard
function Math.sqrt. For example, the statement
double y = Math.sqrt(x);
sets y to the square root of x.
Write a ConsoleProgram that accepts values for a and b as doubles (you can
assume that a and b will be positive) and then calculates the solution of c as a
double.
 */

package com.company;
import java.math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values to compute the Pythagorean theorem.");
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt( ((a*a)+(b*b)) );
        System.out.println("c = "+c);


    }
}
