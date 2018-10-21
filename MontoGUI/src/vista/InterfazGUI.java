package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controlador.Controlador;
import modelo.Mundo;

public class InterfazGUI extends JFrame implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelEntrada pe;
	private PanelResultados pr;
	private PanelSur ps;
	
	private Controlador js;
	
	
	public InterfazGUI(Controlador js)
	{
		this.js=js;
		
		setSize(700,500);
		setResizable(false);
		setTitle("Titulo Vetana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setLayout(new BorderLayout());
		
		pe = new PanelEntrada();
		add(pe, BorderLayout.NORTH);
		
		pr = new PanelResultados();
		add(pr, BorderLayout.CENTER);
		
		ps = new PanelSur();
		add(ps, BorderLayout.SOUTH); 
		pe.getButConvertir().addActionListener(this);
	}

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals(pe.CONVERTIR))
		{
			int i = Integer.parseInt(pe.getTxtNumero().getText());
			if(i<=15)
			{
				pr.setTxtMonto(js.getPrograma().getN().ConvertirPrim(Integer.parseInt(pe.getTxtNumero().getText())));
				js.darMontos(Integer.parseInt(pe.getTxtNumero().getText()));
			}
			else if(i>15 && i<=99)
			{
				pr.setTxtMonto(js.getPrograma().getN().ConvertirDec(Integer.parseInt(pe.getTxtNumero().getText())));
				js.darMontos(Integer.parseInt(pe.getTxtNumero().getText()));

			}
			
			
		}
	}
}
