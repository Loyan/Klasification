import java.lang.Math;
import java.lang.*;
import java.io.*;
import javax.swing.*;

public class normalization extends MyFileClass 
{
	
   static double[] g = new double[1254];
   static double h;
   static double [] j= new double [1254];
   static double k;
   static int col;
   static double average;
   static double S;
   static double[] NP = new double[1254]; 
   static int C;
   static double [] Klassific=new double [1254];

public static void main(String args[])
   {
	openFile("res/UX.txt");
	readFile();
	//out();
	//writeFile("res/UX_classif.txt");
	prubytkovosti();
	averag();
	standotkl();
	interval();
	klassif();
	
    }

public static void prubytkovosti() 
{
     for (int col=0;col<N-1;col++)
	{
     g[col]=Math.log(m[col+1])-Math.log(m[col]);	
   // System.out.print(g[col]);
     }
 
}

public static void averag() 
	{
     for (int col=0;col<N-2;col++)
{
     h = g[col]+g[col+1];
     average=(h/(N));
//System.out.print(average);
}

	}

public static void standotkl() 
	{
     for (int col=0;col<N-2;col++)
{
     j[col] = (m[col]-average)+(m[col+1]-average);
     k = (Math.pow(j[col],2))/(N);
     S=Math.sqrt(k);
//System.out.print(S);
}

	}

public static void normalizPrub() 
	{
     for (int col=0;col<N-2;col++)
{
     NP[col] = (g[col]-average)/S;
}
System.out.print(NP[col]);
	}

public static void interval()
	{
C = Integer.parseInt(JOptionPane.showInputDialog("Введіть кількість інтервалів поділу"));
//System.out.print(name);
	}

public static void klassif() 
	{
     for (int col=0;col<N-2;col++)
{
     Klassific[col] =(int) Math.floor((C-1)*(NP[col]+3)/6);
     System.out.print(Klassific[col]);
}
	}

public static double[] getResultData()
{
    return Klassific;
}
 
}
