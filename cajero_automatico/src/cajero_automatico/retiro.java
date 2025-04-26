package cajero_automatico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;//
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class retiro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCantidadRetirar;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					retiro frame = new retiro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public retiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cantidad a retirar: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(29, 46, 114, 13);
		contentPane.add(lblNewLabel);
		
		txtCantidadRetirar = new JTextField();
		txtCantidadRetirar.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtCantidadRetirar.setBounds(153, 43, 96, 19);
		contentPane.add(txtCantidadRetirar);
		txtCantidadRetirar.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Billetes de BS/. 10");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(29, 88, 114, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Billetes de BS/. 20");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(29, 127, 114, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Billetes de BS/. 50");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(29, 163, 114, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Billetes de BS/. 100");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(29, 201, 129, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Billetes de BS/. 200");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(29, 235, 129, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    // 1. Obtener la cantidad a retirar 
				    String cantidadRetirarStr = txtCantidadRetirar.getText();
				    int cantidadRetirar = Integer.parseInt(cantidadRetirarStr);

				    // Validar si la cantidad es mayor que cero
				    if (cantidadRetirar <= 0) {
				        JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad válida mayor que cero.", "Error", JOptionPane.ERROR_MESSAGE);
				        return; 
				    }

				    // 3. Inicializar contadores de billetes
				    int cantidadBilletes200 = 0;
				    int cantidadBilletes100 = 0;
				    int cantidadBilletes50 = 0;
				    int cantidadBilletes20 = 0;
				    int cantidadBilletes10 = 0;

				    int cantidadRestante = cantidadRetirar;

				    // 4. Calcular la cantidad de billetes 
				    cantidadBilletes200 = cantidadRestante / 200;
				    cantidadRestante = cantidadRestante % 200;

				    cantidadBilletes100 = cantidadRestante / 100;
				    cantidadRestante = cantidadRestante % 100;

				    cantidadBilletes50 = cantidadRestante / 50;
				    cantidadRestante = cantidadRestante % 50;

				    cantidadBilletes20 = cantidadRestante / 20;
				    cantidadRestante = cantidadRestante % 20;

				    cantidadBilletes10 = cantidadRestante / 10;
				    cantidadRestante = cantidadRestante % 10;

				   
				    textField_4.setText(String.valueOf(cantidadBilletes200)); // Bs. 200
				    textField_3.setText(String.valueOf(cantidadBilletes100)); // Bs. 100
				    textField_2.setText(String.valueOf(cantidadBilletes50));  // Bs. 50
				    textField_1.setText(String.valueOf(cantidadBilletes20));  // Bs. 20
				    textField.setText(String.valueOf(cantidadBilletes10));   // Bs. 10

				    
				    if (cantidadRestante > 0) {
				    	JOptionPane.showMessageDialog(null, "La cantidad ingresada no se puede dispensar exactamente con los billetes disponibles. Restante: Bs. " + cantidadRestante, "Advertencia", JOptionPane.WARNING_MESSAGE);
				    }

				} catch (NumberFormatException ex) {
				    //error si el usuario no ingresa un número válido
				    JOptionPane.showMessageDialog(null, "Por favor, ingrese una cantidad numérica válida.", "Error", JOptionPane.ERROR_MESSAGE);
				    // 
				    textField.setText("");
				    textField_1.setText("");
				    textField_2.setText("");
				    textField_3.setText("");
				    textField_4.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(255, 104, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCantidadRetirar.setText("");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(255, 135, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(255, 176, 85, 21);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(153, 86, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(153, 121, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(153, 161, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(153, 199, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(153, 233, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

}
