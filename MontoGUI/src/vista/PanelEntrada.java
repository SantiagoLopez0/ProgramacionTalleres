package vista;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntrada extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JTextField txtNumero;
	private JButton butConvertir;
	public final static String CONVERTIR ="Convertir";
	
	public PanelEntrada()
	{
		setLayout(new GridLayout(2, 2));
		TitledBorder border = BorderFactory.createTitledBorder("Datos entrada");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labEntrada = new JLabel("Digite un valor");
		txtNumero = new JTextField("");
		txtNumero.setForeground(Color.CYAN);
		txtNumero.setBackground(Color.DARK_GRAY);
		butConvertir = new JButton("Convertir");
		butConvertir.setActionCommand(CONVERTIR);
		add(labEntrada);
		add(txtNumero);
		add(new JLabel(""));
		add(butConvertir);
	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButConvertir() {
		return butConvertir;
	}

	public void setButConvertir(JButton butConvertir) {
		this.butConvertir = butConvertir;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static String getConvertir() {
		return CONVERTIR;
	}
	
}
