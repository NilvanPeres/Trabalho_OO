package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CadastroCategoria extends JFrame {

	private JPanel contentPane;
	private JTextField textNomedaCategoria;
	private JTextField textRegistrodaCategoria;
	private JTextField textDespesadaCategoria;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Create the frame.
	 */
	public CadastroCategoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 584);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 204, 51));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDaCategoria = new JLabel("Nome da Categoria:");
		lblNomeDaCategoria.setBounds(50, 74, 295, 48);
		lblNomeDaCategoria.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblNomeDaCategoria);
		
		textNomedaCategoria = new JTextField();
		textNomedaCategoria.setBounds(353, 76, 440, 43);
		textNomedaCategoria.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(textNomedaCategoria);
		textNomedaCategoria.setColumns(10);
		
		JLabel lblRegistroDaCategoria = new JLabel("Registro:");
		lblRegistroDaCategoria.setBounds(214, 233, 131, 48);
		lblRegistroDaCategoria.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblRegistroDaCategoria);
		
		textRegistrodaCategoria = new JTextField();
		textRegistrodaCategoria.setBounds(353, 235, 440, 43);
		textRegistrodaCategoria.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(textRegistrodaCategoria);
		textRegistrodaCategoria.setColumns(10);
		
		JLabel lblDespesaDaCategoria = new JLabel("Despesa:");
		lblDespesaDaCategoria.setBounds(216, 392, 129, 48);
		lblDespesaDaCategoria.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblDespesaDaCategoria);
		
		textDespesadaCategoria = new JTextField();
		textDespesadaCategoria.setBounds(353, 394, 440, 43);
		textDespesadaCategoria.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(textDespesadaCategoria);
		textDespesadaCategoria.setColumns(10);
		
		btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(47, 513, 146, 25);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(600, 513, 146, 25);
		contentPane.add(btnNewButton_1);
	}

}