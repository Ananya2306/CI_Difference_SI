/*
Write a program to input principal, rate and time.
Calculate and Display the difference between Simple Interest (SI) and Compound Interest (CI) by using function argument.
 */

public class CI_Difference_SI
{
    public static void main(int p, int r, int t)
    {
        //Declaring variables 
        double si = 0;
        double ci = 0;
        double amt = 0;
        double differ = 0;
        //Calculations 
        si = p*r*t/100.0;
        amt = p*(Math.pow(1+r/100.0,t));
        ci = amt-p;
        differ = ci-si;
        // Displaying Outputs 
        System.out.println("The Compound Interest :- Rs " + (float)ci);
        System.out.println("The Simple Interest :- Rs " + si);
        System.out.println("The Difference Between CI and SI :- Rs " + (float)differ);
    }
}