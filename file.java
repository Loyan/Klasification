//програма зчитує дані з файлу та записує ці дані в масив
import java.util.Scanner;
import java.io.File;

import javax.swing.JOptionPane;


public class file {
	static String [][] m = new String [1][1255];
	static Scanner scn;

public static void main(String args[])
{
	openFile();
	readFile();
	out();
}

private static void out() {
	for(int row=0;row<m.length;row++){
	for(int col=0;col<m[row].length;col++){
	System.out.print(m[row][col]+ "   ");
}
System.out.println();
 }
}
		
private static void readFile() {
	while(scn.hasNext()){
	for(int row=0;row<m.length;row++){
	for(int col=0;col<m[row].length;col++){
	m[row][col] = scn.next();
	
    }
   }
  }
}

private static void openFile() {
	try{
	scn = new Scanner(new File("res//UX.txt"));
	} catch(Exception e){JOptionPane.showMessageDialog(null, "Файл не найден");}
 }
}
