package EXERCICE;

import java.util.Scanner;

public class SOLUTION {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	int 	x=2;
	int	xx=30;
	Scanner Lire=new Scanner(System.in);
	System.out .println("entrer deux nombre;'");
	
	x=Lire.nextInt();
	xx=Lire.nextInt();
	if (xx<x || x==xx)
	System.out .println("entrer un nombre sup a"+" "+ x);
	xx=Lire.nextInt();
	
	
	

	 display(x,xx);
	
	}
	public static void display(int pIMin ,int pIMax)
	{
		int	i = pIMin;
		for (i=pIMin ;i <pIMax;i++)
		{	if (i % 3==0 )
				{System.out .println('H');}
		else if (i % 5==0 )
		{System.out .println('S');}
		else 
		{System.out .println(i);}
		}
		
	}
}
