package fechas;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class fechaLetras extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtDia;
	private JTextField txtMes;
	private JTextField txtAño;
	private JTextField txtEnLetras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fechaLetras frame = new fechaLetras();
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
	public fechaLetras() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Fecha en letras");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 10, 126, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Día: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(69, 70, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Mes: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(69, 113, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Año:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(69, 154, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		txtDia = new JTextField();
		txtDia.setFont(new Font("Tahoma", Font.BOLD, 13));
		txtDia.setBounds(112, 68, 96, 19);
		contentPane.add(txtDia);
		txtDia.setColumns(10);
		
		txtMes = new JTextField();
		txtMes.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMes.setBounds(112, 111, 96, 19);
		contentPane.add(txtMes);
		txtMes.setColumns(10);
		
		txtAño = new JTextField();
		txtAño.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAño.setBounds(112, 152, 96, 19);
		contentPane.add(txtAño);
		txtAño.setColumns(10);
		
		JPanel panelEnLetras = new JPanel();
		panelEnLetras.setBounds(51, 195, 250, 40);
		contentPane.add(panelEnLetras);
		panelEnLetras.setLayout(null);
		
		javax.swing.border.TitledBorder titledBorder = javax.swing.BorderFactory.createTitledBorder("En letras: ");
		panelEnLetras.setBorder(titledBorder);
		
		txtEnLetras = new JTextField();
		txtEnLetras.setBounds(52, 10, 170, 19);
		txtEnLetras.setBackground(new Color(192, 192, 192));
		panelEnLetras.add(txtEnLetras);
		txtEnLetras.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        // 1. Obtener los valores de los campos de texto
			        String diaStr = txtDia.getText();
			        String mesStr = txtMes.getText();
			        String anioStr = txtAño.getText();

			        // 2. Convertir los valores a números enteros
			        int dia = Integer.parseInt(diaStr);
			        int mes = Integer.parseInt(mesStr);
			        int anio = Integer.parseInt(anioStr);

			        // 3. Validar la fecha
			        try {
			            LocalDate fecha = LocalDate.of(anio, mes, dia);
			            // Si LocalDate.of() no lanza excepción, la fecha es válida

			            // 4. Convertir el mes a su nombre en letras
			            Month nombreMes = fecha.getMonth();
			            String fechaEnLetras = String.format("%d de %s de %d", dia, nombreMes.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.getDefault()), anio);

			            // 5. Mostrar la fecha en el campo de "En letras"
			            txtEnLetras.setText(fechaEnLetras);

			        } catch (DateTimeParseException ex) {
			            // La fecha LocalDate.of() lanzó una excepción, por lo tanto no es válida
			            JOptionPane.showMessageDialog(null, "Error de datos...", "Mensaje", JOptionPane.ERROR_MESSAGE);
			            txtEnLetras.setText(""); // Limpiar el campo de resultado
			        }

			    } catch (NumberFormatException ex) {
			        JOptionPane.showMessageDialog(null, "Por favor, ingrese números válidos para día, mes y año.", "Error de formato", JOptionPane.ERROR_MESSAGE);
			        txtEnLetras.setText(""); // Limpiar el campo de resultado
			    }
			

			}
		});
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBounds(283, 67, 85, 21);
		contentPane.add(btnAceptar);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDia.setText("");
				txtMes.setText("");
				txtAño.setText("");
				txtEnLetras.setText("");
			}
		});
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpiar.setBounds(283, 110, 85, 21);
		contentPane.add(btnLimpiar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBounds(283, 151, 85, 21);
		contentPane.add(btnSalir);
	}
}
