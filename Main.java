package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double secondRoot=0;
	double firstRoot=0;
	Scanner keyboard=new Scanner(System.in);
	System.out.println(("Enter the value of a:"));
	double a=keyboard.nextDouble();
	System.out.println(("Enter the value of b:"));
	double b=keyboard.nextDouble();
	System.out.println(("Enter the value of a:"));
	double c=keyboard.nextDouble();
	double determinant=(b*b)-(4*a*c);
	double sqrt=Math.sqrt(determinant);
	if(determinant>0) {
		firstRoot = (-b + sqrt) / (2 * a);
		secondRoot = (-b - sqrt) / (2 * a);
		System.out.println("The root are:" + firstRoot + "and the" + secondRoot);
	}
			else if(determinant==0);{
				System.out.println("Root is:::"+(-b+sqrt)/(2*a));
		}

    }
    }
