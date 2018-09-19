package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Write number-value for 'n' in 2^n:");
        int n=2;
        double e=c.nextDouble();
            int v=1;
            for (int i=0; i<e; ++i) {
                    v = v*n;
                }System.out.println("Result is: "+v);

        System.out.println("Put first number:");
        double num = c.nextDouble();
        System.out.println("Put second number:");
        double num_2 = c.nextDouble();
        double res = num + num_2;
        System.out.println("Sum:\t"+ res);
        double res_2 = num - num_2;
        System.out.println("Dif:\t"+ res_2);
        double res_3 = num * num_2;
        System.out.println("Mul:\t"+ res_3);

        System.out.println("Input number to count factorial n < 10:");
        int f=c.nextInt();
        int m=1;
        for (int i=1; i<=f; i++)
            {
                m=m*i;
            }
            if(f<10) {
                System.out.print(f+"! = "+m);
            }
            else if (f>=11){
                System.out.print(f+"!=\t "+m);
                System.out.print("\tNumber is more then 10, but that's Ok");
            }

        System.out.print("\nPut some height of falling for some object (meters):");
        double fall=c.nextDouble();
        double half=(2*fall)/9.81;
        double time=Math.pow(half, 0.5);
        System.out.println("Height is:\t"+fall+"(m)");
        System.out.print("Acceleration of gravity = 9.81(m/sec^2)\n");
        System.out.print("Formula of falling time for object is: sqrt(2*h/9.81)\n");
        System.out.print("Time of falling is:\t"+time+"(sec)\n");

        System.out.println("Build a triangle:");
        System.out.println("Hypotenuse:");
        double h=c.nextDouble();
        System.out.println("Side 1:");
        double a=c.nextDouble();
        System.out.println("Pythagorean theorem is: C^2 = A^2 + B^2");
        double hinsq=Math.pow(h,2);
        System.out.println("Hypotenuse^2 = "+hinsq);
        double ainsq=Math.pow(a,2);
        System.out.println("A^2 = "+ainsq);
        double binsq=hinsq-ainsq;
        System.out.println("B^2 = "+binsq);
        double b=Math.sqrt(hinsq-ainsq);
        System.out.println("Side 2 = "+b);
        System.out.print("TO BE CONTINUED...");
    }
}
