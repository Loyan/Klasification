import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Klasification extends Frame {

    protected TextField inFile;
    protected TextField outFile;
    normalization n;

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
	OpenFile.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			MyFileClass fc = new MyFileClass();
			fc.openFile(inFile.getText());
			fc.readFile();
			fc.out();
			//fc.writeFile(outFile.getText());
			double [] mas = fc.getData();
			inFile.setText(new String("Ux.txt").toString());
			//System.exit(0);
		}
	});

	add(new Label(""));
    
	Button Klasification = new Button("Розрахунок класифікації ряду  ");
	add(Klasification);
	Klasification.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			n = new normalization();
			n.prubytkovosti();
			n.averag();
			n.standotkl();
			n.interval();
			n.klassif();
			//System.exit(0);
		}
	});

	add(new Label(""));

	add(new Label("Імя вихідного файлу"));

	outFile = new TextField("res//UX_classif.txt");
                add(outFile);
   
	Button outFileButton = new Button("Записуємо результат у файл ");
	add(outFileButton);

	outFileButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			double [] data=n.getResultData();
			MyFileClass fc = new MyFileClass();
			fc.setData(data);
			fc.writeFile(outFile.getText());
			
			//System.exit(0);
		}
	});

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
