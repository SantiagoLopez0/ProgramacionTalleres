package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelSur extends JPanel
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String DIRECCION ="./data/2018-chevrolet-beat-carro-sedan-miniatura-653x226.jpg";
	private ImageIcon img;
	private JLabel jl;
	public PanelSur()
	{
		
		setLayout(new BorderLayout());
		setBounds(getVisibleRect());
		TitledBorder border = new TitledBorder("Imagenes");
		setBorder(border);
		
		img = new ImageIcon(DIRECCION);
		jl = new JLabel();
		jl.setIcon(img);
		
		add(jl, BorderLayout.WEST);
	}
}
