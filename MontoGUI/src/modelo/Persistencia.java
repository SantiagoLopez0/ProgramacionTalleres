package modelo;

public abstract class Persistencia 
{
	protected String[] prim;
	protected String[] dec;
	
	
	
	public Persistencia()
	{
		prim = new String[16];
		dec = new String[9];
		
		prim[0] = "Cero";
		prim[1] = "Uno";
		prim[2] = "Dos";
		prim[3] = "Tres";
		prim[4] = "Cuatro";
		prim[5] = "Cinco";
		prim[6] = "Seis";
		prim[7] = "Siete";
		prim[8] = "Ocho";
		prim[9] = "Nueve";
		prim[10] = "Diez";
		prim[11] = "Once";
		prim[12] = "Doce";
		prim[13] = "Trece";
		prim[14] = "Catorce";
		prim[15] = "Quince";
		
		
		dec[0]="Diez";
		dec[1]="Veinti";
		dec[2]="Treinta";
		dec[3]="Cuarenta";
		dec[4]="Cincuenta";
		dec[5]="Sesenta";
		dec[6]="Setenta";
		dec[7]="Ochenta";
		dec[8]="Noventa";
	}
		
}
 