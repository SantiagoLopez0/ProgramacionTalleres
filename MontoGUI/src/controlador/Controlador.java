package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JTextField;

import modelo.Mundo;
import vista.InterfazGUI;

public class Controlador {

	
	private Mundo programa;
	private InterfazGUI gui;
	
	
	public Controlador()
	{
		programa = new Mundo();
		
		
		gui = new InterfazGUI(this);
		
		gui.setVisible(true);
	
		
	}


	public Mundo getPrograma() {
		return programa;
	}


	public void setPrograma(Mundo programa) {
		this.programa = programa;
	}


	public InterfazGUI getGui() {
		return gui;
	}


	public void setGui(InterfazGUI gui) {
		this.gui = gui;
	}
	
	public void darMontos(int p)
	{
		for (int i = 0; i < 1; i++) {
			programa.getN().getMontop()[i] = programa.getN().ConvertirPrim(p);  
			programa.getN().getMontod()[i] = programa.getN().ConvertirDec(p);
		}
		leerAr();
	}
	
	public void leerAr() 
	{
		
		File in = new File("./data/Monto.txt");
		File out = new File("./data/Monto.txt");
		
			try {
				in.createNewFile();

				FileReader fr = new FileReader(in);
				FileWriter fw = new FileWriter(out, true);
				
				BufferedReader br = new BufferedReader(fr);
				PrintWriter pw = new PrintWriter(fw); 
				
				
				String linea = br.readLine();
				for (int i = 0; i <1; i++) {
					pw.print(programa.getN().getMont()+"\n" );
				}
				linea = br.readLine();
				
				fr.close();
				fw.close();
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Error");
		}
				
	}

}
