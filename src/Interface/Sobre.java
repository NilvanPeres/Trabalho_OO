package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Sobre extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Sobre() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUnb = new JLabel("UnB - Universidade de Brasilia");
		lblUnb.setBounds(35, 7, 415, 15);
		contentPane.add(lblUnb);
		
		JLabel lblFga = new JLabel("FGA - Faculdade do Gama");
		lblFga.setBounds(35, 29, 415, 15);
		contentPane.add(lblFga);
		
		JLabel lblOO = new JLabel("OO - Orientacao por objetos");
		lblOO.setBounds(35, 51, 415, 15);
		contentPane.add(lblOO);
		
		JTextArea txtrComponetesDoGrupo = new JTextArea();
		txtrComponetesDoGrupo.setBounds(35, 73, 385, 185);
		txtrComponetesDoGrupo.setText("Componentes do Grupo:\n-----------------------------------------\n180097504 - Ana Julia\n190042419 - Davi\n190046848 - Lais Portela\n180125974 - Lucas Rodrigues\n170122468 - Nilvan Junior");
		contentPane.add(txtrComponetesDoGrupo);
	}

}
