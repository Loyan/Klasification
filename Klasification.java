import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Klasification extends Frame {
    public static void main (String [] argv){
	Klasification h = new Klasification();
    }

    public Klasification(){
	setTitle("Klasification!");		
	setSize(500, 350);
    GridLayout grid1= new GridLayout(3,2);// кількість стовбців, кількість рядків
    setLayout(grid1);

    Button OpenFile = new Button("Загрузити вхідний файл");
    add(OpenFile);
    
add(new Label("Імя ряду"));
    
    Button Klasification = new Button("Розрахунок класифікації ряду  ");
    add(Klasification);

add(new Label(""));
   
    Button OutFile = new Button("Записуємо результат у файл ");
    add(OutFile);

add(new Label("Імя вихідного файлу"));

    Button button = new Button("OK");
    add(button);
    button.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
		//surname.setText("com");
		//System.exit(0);
	    }
	});
	setVisible(true);
	grid1.setRows(7);
	grid1.setColumns(4);

	addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e){ 
		System.exit(0);
	    }
	});
    }
}
