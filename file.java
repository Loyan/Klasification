//програма зчитує дані з файлу та записує ці дані в масив
import java.util.Scanner;
import java.io.File;


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

    public static void openFile(String s) 
    {
        try {
            scn = new Scanner(new File(s));
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Файл не найден");
        }
    }
}
