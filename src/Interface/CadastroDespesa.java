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
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class CadastroDespesa extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtMmaa;
	private JButton btncadastrar;
	private JButton btnvoltar;

	/**
	 * Create the frame.
	 */
	public CadastroDespesa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDadosDeDespesa = new JLabel("DADOS DE DESPESA");
		lblDadosDeDespesa.setBounds(205, 12, 405, 50);
		lblDadosDeDespesa.setFont(new Font("DejaVu Serif", Font.BOLD, 33));
		contentPane.add(lblDadosDeDespesa);
		
		JLabel lblDescricao = new JLabel("Descrição:");
		lblDescricao.setBounds(59, 102, 165, 34);
		lblDescricao.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblDescricao);
		
		textField = new JTextField();
		textField.setBounds(228, 102, 420, 37);
		textField.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setBounds(129, 223, 95, 34);
		lblValor.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblValor);
		
		textField_1 = new JTextField();
		textField_1.setBounds(228, 222, 420, 37);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 28));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblData = new JLabel("Data:");
		lblData.setBounds(141, 334, 83, 34);
		lblData.setFont(new Font("DejaVu Serif", Font.BOLD | Font.ITALIC, 28));
		contentPane.add(lblData);
		
		txtMmaa = new JTextField();
		txtMmaa.setBounds(228, 333, 420, 37);
		txtMmaa.setFont(new Font("Dialog", Font.PLAIN, 28));
		txtMmaa.setText("MM/AA");
		contentPane.add(txtMmaa);
		txtMmaa.setColumns(10);
		
		btncadastrar = new JButton("Cadastrar");
		btncadastrar.setBounds(188, 432, 117, 25);
		contentPane.add(btncadastrar);
		
		btnvoltar = new JButton("Voltar");
		btnvoltar.setBounds(476, 432, 117, 25);
		contentPane.add(btnvoltar);
	}

}
