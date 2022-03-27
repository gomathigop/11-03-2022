package com.java;
import java.util.Scanner;

public class BookFair {
	String BookName;
	double price, dis, amount;
	
	BookFair()
	{
		BookName="";
		price=0.0;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BookName");
		BookName=sc.next();
		
		System.out.println("Enter the price");
		price=sc.nextDouble();
	}	
	
	void calculate()
	{
		if(price<=1000) 
		{
			dis=(price*2)/100;
			}
		else if(price>1000 && price<=3000)
		{
			dis=(price*10)/100;
			}
		else
		{
			dis=(price*15)/100;
		}
		}

	void display() 
	{
		amount=price-dis;
		System.out.println("BookName="+BookName);
		System.out.println("price="+price);
		System.out.println("amount="+amount);
		
	}
	
	public static void main(String[] args)
	{
		BookFair ob=new BookFair();
		ob.input();
		ob.calculate();
		ob.display();
	}
}



