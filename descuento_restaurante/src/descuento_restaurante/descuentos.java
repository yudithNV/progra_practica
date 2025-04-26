package descuento_restaurante;

import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class descuentos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtMontoConsumo;
	private JTextField txtImportePagar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					descuentos frame = new descuentos();
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
	public descuentos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 193, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese monto consumo: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(52, 55, 159, 13);
		contentPane.add(lblNewLabel);
		
		txtMontoConsumo = new JTextField();
		txtMontoConsumo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMontoConsumo.setBounds(221, 52, 96, 19);
		contentPane.add(txtMontoConsumo);
		txtMontoConsumo.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        // 1.obtener el monto
			        String montoConsumoStr = txtMontoConsumo.getText();
			        double montoConsumo = Double.parseDouble(montoConsumoStr);

			        double descuento = 0;

			        // 3.descuento según las condiciones
			        if (montoConsumo >= 30.00 && montoConsumo <= 50.00) {
			            descuento = 0.10; // 10% de descuento
			        } else if (montoConsumo > 50.00) {
			            descuento = 0.20; // 20% de descuento
			        }

			        // 4. Calcular el importe
			        double importeAPagar = montoConsumo - (montoConsumo * descuento);

			        txtImportePagar.setText(String.format("%.2f", importeAPagar));

			    } catch (NumberFormatException ex) {
			       
			        JOptionPane.showMessageDialog(null, "Por favor, ingrese un monto numérico válido.", "Error de formato", JOptionPane.ERROR_MESSAGE);
			        txtImportePagar.setText(""); // Limpiar el campo de importe a pagar en caso de error
			    }
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(52, 144, 85, 21);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel_1 = new JLabel("Importe a pagar:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(52, 96, 159, 13);
		contentPane.add(lblNewLabel_1);
		
		txtImportePagar = new JTextField();
		txtImportePagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtImportePagar.setBounds(221, 93, 96, 19);
		contentPane.add(txtImportePagar);
		txtImportePagar.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Importe a pagar");
		lblNewLabel_2.setFont(new Font("Papyrus", Font.BOLD, 12));
		lblNewLabel_2.setBounds(160, 10, 217, 13);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMontoConsumo.setText("");
				txtImportePagar.setText("0.00");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(168, 145, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(292, 145, 85, 21);
		contentPane.add(btnNewButton_1);
	}

}
