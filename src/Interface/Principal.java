package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmSistemaDaRepublica;
	private Sobre frmSobre;
	private CadastroEstudante frmCadastroEstudante;
	private CadastroCategoria frmCadastroCategoria;
	private CadastroDespesa frmCadastroDespesa;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			Principal window = new Principal();
			window.frmSistemaDaRepublica.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSistemaDaRepublica = new JFrame();
		frmSistemaDaRepublica.setTitle("Sistema da Republica");
		frmSistemaDaRepublica.setBounds(100, 100, 799, 599);
		frmSistemaDaRepublica.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmSistemaDaRepublica.setJMenuBar(menuBar);
		
		JMenu mnCadastro = new JMenu("Cadastro");
		menuBar.add(mnCadastro);
		
		JMenuItem mntmEstudante_1 = new JMenuItem("Estudante");
		mntmEstudante_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmCadastroEstudante = new CadastroEstudante();
				frmCadastroEstudante.setVisible(true);
			}
		});
		
		mnCadastro.add(mntmEstudante_1);
		
		JMenuItem mntmCategoria = new JMenuItem("Categoria");
		mntmCategoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastroCategoria = new CadastroCategoria();
				frmCadastroCategoria.setVisible(true);
			}
		});
		
		mnCadastro.add(mntmCategoria);
		
		JMenuItem mntmSubcategoria = new JMenuItem("Subcategoria");
		mnCadastro.add(mntmSubcategoria);
		
		JMenuItem mntmDespesa = new JMenuItem("Despesa");
		mntmDespesa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCadastroDespesa = new CadastroDespesa();
				frmCadastroDespesa.setVisible(true);
			}
		});
		mnCadastro.add(mntmDespesa);
		
		JSeparator separator = new JSeparator();
		mnCadastro.add(separator);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mnCadastro.add(mntmSair);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		menuBar.add(mnAjuda);
		
		JMenuItem mntmSobre = new JMenuItem("Sobre");
		mntmSobre.addActionListener(new CliqueSobre());
		mnAjuda.add(mntmSobre);
		frmSistemaDaRepublica.getContentPane().setLayout(null);
	}

		class CliqueSobre implements ActionListener{
			public void actionPerformed(ActionEvent arg0) {
				frmSobre = new Sobre();
				frmSobre.setVisible(true);
				
			}
			
		}
}
