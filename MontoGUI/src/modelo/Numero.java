package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Numero extends Persistencia
{

	private String mont;
	private String[] montop;
	private String[] montod;
	
	public Numero()
	{
		this.mont="";
		montop = new String[3];
		montod = new String[3];
	}
	
	
	public String getMont() {
		return mont;
	}


	public void setMont(String mont) {
		this.mont = mont;
	}
	

	public String[] getMontop() {
		return montop;
	}


	public void setMontop(String[] montop) {
		this.montop = montop;
	}


	public String[] getMontod() {
		return montod;
	}


	public void setMontod(String[] montod) {
		this.montod = montod;
	}


	public String ConvertirPrim(int pMonto)
	{
		for (int i = 0; i < super.prim.length; i++) {
			if(pMonto==i) {
				setMont(super.prim[pMonto]+" Euros");
				break;
		}
	}
		return getMont();
		
	}	
	
	public String ConvertirDec(int pMont)
	{	
		for (int i = 0; i < super.dec.length; i++)
		{
			if(pMont >15 && pMont<= 19)
			{
				int monto1 = pMont - 10;
				setMont(super.dec[0] +" y " +super.prim[monto1]+" Euros");
				break;
				
			}
			else if(pMont >= 21 && pMont <= 29)
			{
				int monto2 = pMont - 20;
				setMont(super.dec[1] + ""+super.prim[monto2]+" Euros");
				break;
			}
			else if(pMont == 20)
			{
				setMont( "Veinte"+ " Euros");
				break;
			}
			else if(pMont >= 31 && pMont<=39)
			{
				int monto3 = pMont - 30;
				setMont(super.dec[2]+" y "+super.prim[monto3]+" Euros");
				break;
			}
			else if(pMont==30)
			{
				setMont(super.dec[2]+ " Euros");
				break;
			}
			else if(pMont >= 41 && pMont<=49)
			{
				int monto4 = pMont - 40;
				setMont( super.dec[3]+" y "+super.prim[monto4]+" Euros");
				break;
			}
			else if(pMont==40)
			{
				setMont(super.dec[3]+ " Euros");
				break;
			}
			else if(pMont >= 51 && pMont<=59)
			{
				int monto5 = pMont - 50;
				setMont(super.dec[4]+" y "+super.prim[monto5]+" Euros");
				break;
			}
			else if(pMont==50)
			{
				setMont(super.dec[4]+ " Euros");
				break;
			}
			else if(pMont >= 61 && pMont<=69)
			{
				int monto6 = pMont - 60;
				setMont(super.dec[5]+" y "+super.prim[monto6]+" Euros");
				break;
			}
			else if(pMont==60)
			{
				setMont(super.dec[5]+ " Euros");
				break;
			}
			else if(pMont >= 71 && pMont<=79)
			{
				int monto7 = pMont - 70;
				setMont( super.dec[6]+" y "+super.prim[monto7]+" Euros");
				break;
			}
			else if(pMont==70)
			{
				setMont(super.dec[6]+ " Euros");
				break;
			}
			else if(pMont >= 81 && pMont<=89)
			{
				int monto8 = pMont - 80;
				setMont(super.dec[7]+" y "+super.prim[monto8]+" Euros");
				break;
			}
			else if(pMont==80)
			{
				setMont(super.dec[7]+ " Euros");
				break;
			}
			else if(pMont >= 91 && pMont<=99)
			{
				int monto9 = pMont - 90;
				setMont(super.dec[8]+" y "+super.prim[monto9]+" Euros");
				break;
			}
			else if(pMont==90)
			{
				setMont(super.dec[8]+ " Euros");
				break;
			}
			
		}
		
		return getMont();
	}

	
	
	         

}
