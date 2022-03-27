package com.java;
import java.util.Scanner;

public class ShowRoom {
		
		String name;
		long Mobno;
		double cost, dis, amount;
	
	ShowRoom()
	{
		name="";
		Mobno=0l;
	}
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		name=sc.next();
		
		System.out.println("Enter Mobno");
		Mobno=sc.nextLong();
		
		System.out.println("Enter the cost");
		cost=sc.nextDouble();
	}
	
	void calculate()
	{
		if(cost<=10000) 
		{
			dis=(cost*5)/100;
			}
		else if(cost>=10000 && cost<=20000)
		{
			dis=(cost*10)/100;
			}
		else if(cost>20000 && cost<=35000) 
		{
			dis=(cost*15)/100;
		}
		else
		{
			dis=(cost*20)/100;
		}
	}
		
	void display() 
	{
		amount=cost-dis;
		System.out.println("name="+name);
		System.out.println("Mobno="+Mobno);
		System.out.println("amount="+amount);
	}
	public static void main(String[] args)
	{
		ShowRoom ob=new ShowRoom();
		ob.input();
		ob.calculate();
		ob.display();
	}
}