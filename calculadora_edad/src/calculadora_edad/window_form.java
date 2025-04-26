package calculadora_edad;

import java.awt.EventQueue;

//para lo del "aceptar"
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.Period;
import javax.swing.JOptionPane;
//del boton a

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class window_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFechaNacimiento;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window_form frame = new window_form();
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
	public window_form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha de nacimiento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(87, 55, 140, 13);
		contentPane.add(lblNewLabel);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtFechaNacimiento.setBounds(226, 53, 96, 19);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Su edad es:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(143, 98, 78, 13);
		contentPane.add(lblNewLabel_1);
		
		txtEdad = new JTextField();
		txtEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEdad.setBounds(228, 98, 96, 19);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fechaNacimientoStr = txtFechaNacimiento.getText();
			    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

			    try {
			        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr, dateFormatter);
			        LocalDate fechaActual = LocalDate.now();
			        Period periodo = Period.between(fechaNacimiento, fechaActual);
			        int edad = periodo.getYears();
			        txtEdad.setText(String.valueOf(edad) + " años");

			    } catch (DateTimeParseException ex) {
			    	JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Por favor, use dd/MM/yyyy", "Error de formato", JOptionPane.ERROR_MESSAGE);
			        txtEdad.setText(""); // Limpiar el campo de edad en caso de error
			    }
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(52, 171, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFechaNacimiento.setText("");
				txtEdad.setText("");
			}
		});
		btnNewButton_1.setBounds(170, 171, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(290, 171, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
