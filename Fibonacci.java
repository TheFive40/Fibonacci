package Secuencia_Fibonacci;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Fibonacci {
	int a = 0, b = 1,  c, n;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fibonacci window = new Fibonacci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Fibonacci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FIBONACCI");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblNewLabel.setBounds(129, 11, 176, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JButton Iniciar = new JButton("COMENZAR");
		Iniciar.setBounds(158, 144, 112, 22);
		frame.getContentPane().add(Iniciar);
		
		textField = new JTextField();
		textField.setBounds(158, 94, 112, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Secuencia");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(168, 62, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel Fondo = new JLabel("");
		Fondo.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\wp4394884.jpg"));
		Fondo.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(Fondo);
		class Fivonacci implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				String Numero = textField.getText();
				n =  Integer.parseInt(Numero);
				
				for(int i = 0;i<n;i++) {
					System.out.println(a);
					c = a + b;
					a = b;
					b = c;
				
					
					
				}
			}
		}
		Fivonacci Objeto = new Fivonacci();
		Iniciar.addActionListener(Objeto);
	}
}
