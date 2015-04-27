package pac;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ibe {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ibe window = new Ibe();
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
	public Ibe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.RED);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblEntrerPrixHt = new JLabel("Entrer prix ht:");
		panel.add(lblEntrerPrixHt);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(15);
		
		JButton btnCalculer = new JButton("Calculer");
panel.add(btnCalculer);
		
		JLabel lblResultat = new JLabel("resultat");
		frame.getContentPane().add(lblResultat, BorderLayout.SOUTH);
		btnCalculer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//recuperer le prix ht (get)
			String prixht_text = textField.getText();
				//convertir la chaine de caractere en nombre (double)
			double prixht = Double.parseDouble(prixht_text);
				//faire le calcul prixtc=prixht*1.2
			double prixtc=prixht*1.2;	
				//ecrire le prixtc dans le label 
			lblResultat.setText("Le prix taxe comprise est "+prixtc+" Dhs");
				
			}
		});
		
	}

}
