package gui;

import semana_07.ArregloEdades;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_7_1 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JButton btnAdicionar;
	private JButton btnEliminarAlFinal;
	private JButton btnEliminarTodo;
	private JButton btnRemplazarPrimeraEdadAdolescente;
	private JButton btnIntercambiarEdadesAdolescentesExtremas;
	private JButton btnEliminarPrimeraEdadAdolescente;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_7_1 frame = new Problema_7_1();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_7_1() {
		setTitle("Problema_7_1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(10, 10, 46, 23);
		contentPane.add(lblEdad);

		txtEdad = new JTextField();
		txtEdad.setBounds(66, 10, 86, 23);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(230, 40, 291, 23);
		contentPane.add(btnAdicionar);

		btnEliminarAlFinal = new JButton("Eliminar al final");
		btnEliminarAlFinal.addActionListener(this);
		btnEliminarAlFinal.setBounds(230, 70, 291, 23);
		contentPane.add(btnEliminarAlFinal);

		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(230, 100, 291, 23);
		contentPane.add(btnEliminarTodo);
		
		btnRemplazarPrimeraEdadAdolescente = new JButton("Remplazar primera edad adolescente");
		btnRemplazarPrimeraEdadAdolescente.addActionListener(this);
		btnRemplazarPrimeraEdadAdolescente.setBounds(230, 130, 291, 23);
		contentPane.add(btnRemplazarPrimeraEdadAdolescente);

		btnIntercambiarEdadesAdolescentesExtremas = new JButton("Intercambiar edades adolescentes extremas");
		btnIntercambiarEdadesAdolescentesExtremas.addActionListener(this);
		btnIntercambiarEdadesAdolescentesExtremas.setBounds(230, 160, 291, 23);
		contentPane.add(btnIntercambiarEdadesAdolescentesExtremas);
	
		btnEliminarPrimeraEdadAdolescente = new JButton("Eliminar primera edad adolescente");
		btnEliminarPrimeraEdadAdolescente.addActionListener(this);
		btnEliminarPrimeraEdadAdolescente.setBounds(230, 190, 291, 23);
		contentPane.add(btnEliminarPrimeraEdadAdolescente);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 210, 412);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminarPrimeraEdadAdolescente) {
			actionPerformedBtnEliminarPrimeraEdadAdolescente(arg0);
		}
		if (arg0.getSource() == btnIntercambiarEdadesAdolescentesExtremas) {
			actionPerformedBtnIntercambiarEdadesAdolescentesExtremas(arg0);
		}
		if (arg0.getSource() == btnRemplazarPrimeraEdadAdolescente) {
			actionPerformedBtnRemplazarPrimeraEdadAdolescente(arg0);
		}
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(arg0);
		}
		if (arg0.getSource() == btnEliminarAlFinal) {
			actionPerformedBtnEliminarAlFinal(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		limpieza();
	}

	//  Declaraci�n global
	ArregloEdades ae = new ArregloEdades();
	
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
		try {
			ae.adicionar(leerEdad());
			listar();
		}
		catch (Exception e) {
			mensaje("error de ingreso");
		}	
	}
	protected void actionPerformedBtnEliminarAlFinal(ActionEvent arg0) {
		if (ae.tamanio() > 0) {
			ae.eliminarAlFinal();
			listar();
		}
		else
			mensaje("el Arreglo est� vac�o");		
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		if (ae.tamanio() > 0) {
			ae.eliminarTodo();
			listar();
		}
		else
			mensaje("el Arreglo est� vac�o");			
	}
	protected void actionPerformedBtnRemplazarPrimeraEdadAdolescente(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnIntercambiarEdadesAdolescentesExtremas(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnEliminarPrimeraEdadAdolescente(ActionEvent arg0) {
		
	}
	//  M�todos tipo void (sin par�metros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtEdad.setText("");
		txtEdad.requestFocus();
	}
	void listar() {
		txtS.setText("");
		for (int i=0; i<ae.tamanio(); i++)
			imprimir("edad[" + i + "] : " + ae.obtener(i));
	}
	//  M�todos tipo void (con par�metros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  M�todos que retornan valor (sin par�metros)
	int leerEdad()  {
		return Integer.parseInt(txtEdad.getText().trim());
	}
	
}