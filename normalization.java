import java.lang.Math;

public class normalization extends MyFileClass {
	
   static double a;

 public static void main(String args[])
{
	openFile("res/UX.txt");
	readFile();
	//out();
	writeFile("res/UX_classif.txt");
	logar();
	
    }
public static void logar() {
for(int col=1;col<N;col++){
           a=Math.log(m[col]);
}
System.out.print(a);
}
}
