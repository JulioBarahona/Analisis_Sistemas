import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFormattedTextField;

public class SignInGUI {

	private JFrame frame;
	private JTextField nameTF;
	private JTextField lastNameTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignInGUI window = new SignInGUI();
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
	public SignInGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 606);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		nameTF = new JTextField();
		nameTF.setBounds(53, 83, 144, 20);
		frame.getContentPane().add(nameTF);
		nameTF.setColumns(10);
		
		lastNameTF = new JTextField();
		lastNameTF.setColumns(10);
		lastNameTF.setBounds(222, 83, 144, 20);
		frame.getContentPane().add(lastNameTF);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(53, 58, 46, 14);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(222, 58, 46, 14);
		frame.getContentPane().add(lblApellido);
		
		JLabel lblCarne = new JLabel("Carne");
		lblCarne.setBounds(53, 128, 46, 14);
		frame.getContentPane().add(lblCarne);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(53, 153, 144, 20);
		frame.getContentPane().add(formattedTextField);
	}
}
