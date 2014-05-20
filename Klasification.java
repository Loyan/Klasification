import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Klasification extends Frame {

    protected TextField inFile;
    protected TextField outFile;

    public static void main (String [] argv){
	Klasification h = new Klasification();
    }

    public Klasification(){
	setTitle("Klasification!");		
	setSize(500, 350);
	GridLayout grid1= new GridLayout(4,3);// кількість стовбців, кількість рядків
	setLayout(grid1);

	add(new Label("Імя ряду"));

	inFile = new TextField("res//UX.txt");
                add(inFile);

	Button OpenFile = new Button("Загрузити вхідний файл");
	add(OpenFile);

	add(new Label(""));
    
	Button Klasification = new Button("Розрахунок класифікації ряду  ");
	add(Klasification);
	Klasification.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MyFileClass fc = new MyFileClass();
			fc.openFile(inFile.getText());
			fc.readFile();
			fc.out();
			double [] mas = fc.getData();
			inFile.setText(new Double(mas[3]).toString());
			//System.exit(0);
		}
	});

	add(new Label(""));

	add(new Label("Імя вихідного файлу"));

	outFile = new TextField("res//UX_classif.txt");
                add(outFile);
   
	Button outFileButton = new Button("Записуємо результат у файл ");
	add(outFileButton);

	Button button = new Button("OK");
	add(button);
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//surname.setText("com");
			//System.exit(0);
		}
	});
	setVisible(true);
	//grid1.setRows(12);
	//grid1.setColumns(4);

	addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e){ 
		System.exit(0);
	    }
	});
    }
}
