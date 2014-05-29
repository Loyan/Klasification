import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.Math;

import javax.swing.JOptionPane;


public class MyFileClass
{
    static double[] m = new double[1255];
    protected static int N;
    static Scanner scn;

    public static void main(String args[])
    {

	openFile("res/UX.txt");
	readFile();
	out();
	writeFile("res/UX_classif.txt");
	
    }
public static void out() 
    {
       for(int col=0;col<N;col++){
            System.out.print(m[col]+ "   ");
            System.out.println();
        }
   }
 
    public static double [] getData()
    {
        return m;
    }

    public static void setData(double []newM)
    {
        m = newM;
        N=m.length;
    }

    public static void readFile() 
    {
        int col=0;
        while(scn.hasNext() && (col<m.length)){
            m[col] = Double.parseDouble(scn.next());
            col++;
        }
        N=col;
    }

    public static void writeFile(String fileName) 
    {
	File file = new File(fileName);
	try {
		//проверяем, что если файл не существует то создаем его
		if(!file.exists()){
			file.createNewFile();
		}
		//PrintWriter обеспечит возможности записи в файл
		PrintWriter out = new PrintWriter(file.getAbsoluteFile());
		try {
 			for(int col=0;col<N;col++){
				out.print(m[col]);
				out.println();
			}
		}
		 finally {
		            //После чего мы должны закрыть файл
		            //Иначе файл не запишется
		            out.close();
		}
	}
	catch(IOException e) {
	        throw new RuntimeException(e);
	}
    }

    public static void openFile(String s) 
    {
        try {
            scn = new Scanner(new File(s));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}
