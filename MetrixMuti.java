//Ploypilin Bunprasoet 60050212
import java.util.*;
class MetrixMuti
{public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		System.out.print("A = row ");		int a1 = sc.nextInt();
		System.out.print("A = column ");	int a2 = sc.nextInt();
		System.out.print("B = row ");		int b1 = sc.nextInt();
		System.out.print("B = column ");	int b2 = sc.nextInt();

	if(a2==b1)
	{	int[][] A = new int[a1][a2];
		int[][] B = new int[b1][b2];
		int[][] C = new int[a1][b2];
		
		for(int i=0;i<a1;i++)
		{ System.out.print("A"+i+" :: ");
		  for(int ii=0;ii<a2;ii++)
		  {  A[i][ii] = sc.nextInt(); }
		}
		System.out.println();

		for(int i=0;i<b1;i++)
		{ System.out.print("A"+i+" :: ");
		  for(int ii=0;ii<b2;ii++)
		  { B[i][ii] = sc.nextInt(); }
		}
		System.out.println();

		for(int i=0;i<a1;i++)
		{   for(int j=0;j<b2;j++)
			{   for(int x=0;x<a2;x++)
				{	C[i][j] += (A[i][x]*B[x][j]);  }
			}
		}
		for(int i=0;i<a1;i++)
		{ System.out.print("C"+i+" :: ");
			for(int ii=0;ii<b2 ;ii++)
			{ System.out.print(C[i][ii]+" "); }
		  System.out.println();
		}	
	}
	else  System.out.println("Error");
	}
}/*
A = row 3
A = column 3
B = row 3
B = column 2
A0 :: 1 1 1
A1 :: 1 0 1
A2 :: 1 1 1

A0 :: 1 2
A1 :: 2 1
A2 :: 0 3

C0 :: 3 6
C1 :: 1 5
C2 :: 3 6
Press any key to continue . . .*/