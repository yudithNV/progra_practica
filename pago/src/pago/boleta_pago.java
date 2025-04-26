package pago;

import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class boleta_pago extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTrabajador;
	private JTextField txtSueldoBasico;
	private JTextField txtHorasExtras;
	private JTextField txtPagoHExtra;
	private JTextField txtRenta;
	private JTextField txtFonavi;
	private JTextField txtAFP;
	private JTextField txtSueldoNeto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boleta_pago frame = new boleta_pago();
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
	public boleta_pago() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Trabajador: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(33, 27, 81, 13);
		contentPane.add(lblNewLabel);
		
		txtTrabajador = new JTextField();
		txtTrabajador.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTrabajador.setBounds(164, 25, 227, 19);
		contentPane.add(txtTrabajador);
		txtTrabajador.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Sueldo basico BS/.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(33, 65, 126, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horas extras: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(33, 107, 96, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Pago hora extra BS/.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 149, 126, 13);
		contentPane.add(lblNewLabel_3);
		
		txtSueldoBasico = new JTextField();
		txtSueldoBasico.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSueldoBasico.setBounds(164, 63, 96, 19);
		contentPane.add(txtSueldoBasico);
		txtSueldoBasico.setColumns(10);
		
		txtHorasExtras = new JTextField();
		txtHorasExtras.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtHorasExtras.setBounds(164, 105, 96, 19);
		contentPane.add(txtHorasExtras);
		txtHorasExtras.setColumns(10);
		
		txtPagoHExtra = new JTextField();
		txtPagoHExtra.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtPagoHExtra.setBounds(164, 147, 96, 19);
		contentPane.add(txtPagoHExtra);
		txtPagoHExtra.setColumns(10);
		
		JPanel panelTurno = new JPanel();
		panelTurno.setBounds(270, 65, 126, 81);
		contentPane.add(panelTurno);
		//para añadir el borde:
		javax.swing.border.TitledBorder titledBorder = javax.swing.BorderFactory.createTitledBorder("Turno");
		panelTurno.setBorder(titledBorder);
		
		
		JRadioButton buttonDiurno = new JRadioButton("Diurno");
		buttonDiurno.setFont(new Font("Tahoma", Font.BOLD, 12));
		panelTurno.add(buttonDiurno);
		
		JRadioButton buttonNocturno = new JRadioButton("Nocturno");
		panelTurno.add(buttonNocturno);
		buttonNocturno.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JPanel panelDescuentos = new JPanel();
		panelDescuentos.setBounds(33, 184, 227, 110);
		contentPane.add(panelDescuentos);
		panelDescuentos.setLayout(null);
		//testing aa
		javax.swing.border.TitledBorder titledBorder1 = javax.swing.BorderFactory.createTitledBorder("Descuentos");
		panelDescuentos.setBorder(titledBorder1);
		//test
		JCheckBox chckbxNewCheckBox = new JCheckBox("Renta");
		chckbxNewCheckBox.setBounds(16, 18, 93, 21);
		panelDescuentos.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Fonavi");
		chckbxNewCheckBox_1.setBounds(16, 41, 93, 21);
		panelDescuentos.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("AFP");
		chckbxNewCheckBox_2.setBounds(16, 64, 93, 21);
		panelDescuentos.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		txtRenta = new JTextField();
		txtRenta.setBounds(121, 19, 96, 19);
		panelDescuentos.add(txtRenta);
		txtRenta.setColumns(10);
		
		txtFonavi = new JTextField();
		txtFonavi.setBounds(121, 42, 96, 19);
		panelDescuentos.add(txtFonavi);
		txtFonavi.setColumns(10);
		
		txtAFP = new JTextField();
		txtAFP.setBounds(121, 65, 96, 19);
		panelDescuentos.add(txtAFP);
		txtAFP.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sueldo neto BS/.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(33, 306, 121, 13);
		contentPane.add(lblNewLabel_4);
		
		txtSueldoNeto = new JTextField();
		txtSueldoNeto.setBounds(164, 303, 96, 19);
		contentPane.add(txtSueldoNeto);
		txtSueldoNeto.setColumns(10);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				    // 1. Obtener los datos de entrada
				    String nombreTrabajador = txtTrabajador.getText();
				    String turno = "";
				    // Reemplaza radioButton y radioButton_1 con los nombres reales de tus JRadioButton
				    // dentro de panelTurno
				    // Ejemplo (podrían ser otros nombres):
				    if (buttonDiurno.isSelected()) {
				        turno = "Diurno";
				    } else if (buttonNocturno.isSelected()) {
				        turno = "Nocturno";
				    }

				    String sueldoBasicoStr = txtSueldoBasico.getText();
				    String horasExtrasStr = txtHorasExtras.getText();
				    String pagoHoraExtraStr = txtPagoHExtra.getText(); // Usando tu nombre

				    // Convertir a números
				    double sueldoBasico = Double.parseDouble(sueldoBasicoStr);
				    int horasExtras = Integer.parseInt(horasExtrasStr);
				    double pagoHoraExtra = Double.parseDouble(pagoHoraExtraStr);

				    // 2. Calcular el sueldo bruto
				    double ingresos = sueldoBasico + (horasExtras * pagoHoraExtra);

				    // Por ahora, vamos a mostrar el sueldo bruto en el campo de sueldo neto
				    txtSueldoNeto.setText(String.format("%.2f", ingresos)); // Formatear a 2 decimales

				} catch (NumberFormatException ex) {
				    JOptionPane.showMessageDialog(null, "Por favor, ingrese valores numéricos válidos para el sueldo básico, horas extras y pago por hora extra.", "Error de formato", JOptionPane.ERROR_MESSAGE);
				    // Opcionalmente, podrías limpiar los campos de resultado aquí
				    // Reemplaza textField, textField_1, textField_2 con los nombres reales de tus JTextField de descuento
				    // Ejemplo (podrían ser otros nombres):
				    // textField.setText("");
				    // textField_1.setText("");
				    // textField_2.setText("");
				    txtSueldoNeto.setText("");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(300, 180, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTrabajador.setText(" ");
				txtSueldoBasico.setText(" ");
				txtHorasExtras.setText(" ");
				txtPagoHExtra.setText(" ");
				txtSueldoNeto.setText(" ");
				txtRenta.setText(" ");
				txtFonavi.setText(" ");
				txtAFP.setText(" ");
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(300, 231, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_2.setBounds(300, 279, 85, 21);
		contentPane.add(btnNewButton_2);
	}
}
