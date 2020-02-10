package Task3;

import java.util.Scanner;
class Calculator
{
    int a;
    int b;
    Calculator(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    int add()
    {
        return a+b;
    }
    int subract()
    {
        return a-b;
    }
    int multiply()
    {
        return a*b;
    }
    int divide()
    {
        return a/b;
    }
}
public class Calci
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=s.nextInt();
        System.out.println("Enter number 2");
        int b=s.nextInt();
        System.out.println("For Addition press 1");
        System.out.println("For Subraction press 2");
        System.out.println("For Multiplication press 3");
        System.out.println("For Division press 4");
        System.out.println("Enter your choice");
        int c=s.nextInt();
        Calculator calculator=new Calculator(a,b);
        int ans=0;
        if(c==1)
            ans=calculator.add();
        else if (c==2)
            ans=calculator.subract();
        else if (c==3)
            ans=calculator.multiply();
        else if (c==4)
            ans=calculator.divide();
        else
            System.out.println("Invalid choice");
        System.out.println("OUTPUT="+ans);
    }
}
