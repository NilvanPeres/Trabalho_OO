package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import entities.Category;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class CadastroEstudante extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeDoEstudante;
	private JTextField textEmail;
	private JTextField textRenda;

	/**
	 * Create the frame.
	 */
	public CadastroEstudante() {
		setBackground(new Color(128, 128, 128));
		setTitle("Cadastro de Estudantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 599);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoEstudante = new JLabel("Nome do Estudante:");
		lblNomeDoEstudante.setBounds(40, 14, 144, 15);
		contentPane.add(lblNomeDoEstudante);
		
		textNomeDoEstudante = new JTextField();
		textNomeDoEstudante.setBounds(192, 12, 407, 19);
		contentPane.add(textNomeDoEstudante);
		textNomeDoEstudante.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(142, 40, 42, 15);
		contentPane.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(192, 38, 407, 19);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblRenda = new JLabel("Renda:");
		lblRenda.setBounds(134, 66, 50, 15);
		contentPane.add(lblRenda);
		
		textRenda = new JTextField();
		textRenda.setBounds(192, 64, 407, 19);
		contentPane.add(textRenda);
		textRenda.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//chamar a funcao de cadastrar ou a classe estudante?
				//Category c = new Category(nomeCategoria);
				
				
			}
		});
		btnCadastrar.setBounds(192, 95, 117, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnLimpar = new JButton("Apagar");
		btnLimpar.setBackground(Color.YELLOW);
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 textNomeDoEstudante.setText(" ");
				 textEmail.setText(" ");
				 textRenda.setText(" ");
			}
		});
		
		btnLimpar.setBounds(332, 95, 117, 25);
		contentPane.add(btnLimpar);
		
		JButton btnSair = new JButton("Voltar");
		btnSair.setBounds(473, 95, 117, 25);
		contentPane.add(btnSair);
	}
}
