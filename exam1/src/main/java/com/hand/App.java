package com.hand;



/**
 * Hello world!
 *
 */
public class App 
{

	public static void main( String[] args )
	{

		int count=0;
		int num=0;

		int a[]=new int[200];
		for(int i=101;i<=200;i++)
		{for(int j=2;j<=200;j++)
		 {
			if(i%j==0)
				count++;
		 }
		if(count<=1)
		 {a[num]=i;
		  num++;}

		count=0;}
		System.out.print( "101-200间总共有"+num+"个素数，分别是：" );
		for(int i=0;i<num;i++){
			System.out.print(a[i]+",");
		}
	}
}
