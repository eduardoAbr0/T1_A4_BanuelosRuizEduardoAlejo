import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;

class Interfaz extends JFrame {
	GridBagLayout gbl = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();

	public Interfaz() {
		getContentPane().setLayout(gbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Calculadora");
		setVisible(true);
		
		gbc.ipadx = 50;
		gbc.ipady = 50;
		
		// ESPACIO PARA INGRESO NUMEROS	
		JTextField txtIngresoNumeros = new JTextField();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(txtIngresoNumeros, 0, 0, 4, 1);

		// 2DA FILA
		// MC
		JButton btnMC = new JButton("MC");
		agregarComponente(btnMC, 0, 1, 1, 1);
		// MR
		JButton btnMR = new JButton("MR");
		agregarComponente(btnMR, 1, 1, 1, 1);
		// M+
		JButton btnMPlus = new JButton("M+");
		agregarComponente(btnMPlus, 2, 1, 1, 1);
		// M-
		JButton btnMmin = new JButton("M-");
		agregarComponente(btnMmin, 3, 1, 1, 1);
		// MS
		JButton btnMS = new JButton("MS");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(btnMS, 0, 2, 2, 1);
		// M↓
		JButton btnMSave = new JButton("M↓");
		gbc.fill = GridBagConstraints.HORIZONTAL;
		agregarComponente(btnMSave, 2, 2, 2, 1);

		// 3RA FILA
		// %
		JButton btnResiduo = new JButton("%");
		agregarComponente(btnResiduo, 0, 3, 1, 1);
		// Raiz
		JButton btnRaiz = new JButton("√");
		agregarComponente(btnRaiz, 1, 3, 1, 1);
		// Potencia cuadrada
		JButton btnPotencia = new JButton("x^2");
		agregarComponente(btnPotencia, 2, 3, 1, 1);
		// Division a 1
		JButton btnDivision1 = new JButton("1/x");
		agregarComponente(btnDivision1, 3, 3, 1, 1);

		// 4TA FILA
		// CE
		JButton btnCE = new JButton("CE");
		agregarComponente(btnCE, 0, 4, 1, 1);
		// C
		JButton btnC = new JButton("C");
		agregarComponente(btnC, 1, 4, 1, 1);
		// ELIMINAR
		JButton btnEliminar = new JButton("E");
		agregarComponente(btnEliminar, 2, 4, 1, 1);
		// Division
		JButton btnDivision = new JButton("÷");
		agregarComponente(btnDivision, 3, 4, 1, 1);

		// 5TA FILA
		// 7
		JButton btn7 = new JButton("7");
		agregarComponente(btn7, 0, 5, 1, 1);
		// 8
		JButton btn8 = new JButton("8");
		agregarComponente(btn8, 1, 5, 1, 1);
		// 9
		JButton btn9 = new JButton("9");
		agregarComponente(btn9, 2, 5, 1, 1);
		// Multiplicacion
		JButton btnMultiplicacion = new JButton("×");
		agregarComponente(btnMultiplicacion, 3, 5, 1, 1);
		
		// 6TA FILA
		// 4
		JButton btn4 = new JButton("4");
		agregarComponente(btn4, 0, 6, 1, 1);
		// 5
		JButton btn5 = new JButton("5");
		agregarComponente(btn5, 1, 6, 1, 1);
		// 6
		JButton btn6 = new JButton("6");
		agregarComponente(btn6, 2, 6, 1, 1);
		// Resta
		JButton btnResta = new JButton("-");
		agregarComponente(btnResta, 3, 6, 1, 1);

		// 7MA FILA
		// 1
		JButton btn1 = new JButton("1");
		agregarComponente(btn1, 0, 7, 1, 1);
		// 2
		JButton btn2 = new JButton("2");
		agregarComponente(btn2, 1, 7, 1, 1);
		// 3
		JButton btn3 = new JButton("3");
		agregarComponente(btn3, 2, 7, 1, 1);
		// Suma
		JButton btnSuma = new JButton("+");
		agregarComponente(btnSuma, 3, 7, 1, 1);

		// 8VA FILA
		// +-
		JButton btnCambioSig = new JButton("±");
		agregarComponente(btnCambioSig, 0, 8, 1, 1);
		// 0
		JButton btn0 = new JButton("0");
		agregarComponente(btn0, 1, 8, 1, 1);
		// .
		JButton btnDecimal = new JButton(".");
		agregarComponente(btnDecimal, 2, 8, 1, 1);
		// Resultado
		JButton btnResultado = new JButton("=");
		agregarComponente(btnResultado, 3, 8, 1, 1);
		
		pack();
		setLocationRelativeTo(null);
	}

	public void agregarComponente(JComponent c, int x, int y, int anchura, int altura) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = anchura;
		gbc.gridheight = altura;

		gbl.setConstraints(c, gbc);
		add(c);
	}
}

public class VentanaPrincipal {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Interfaz();
			}
		});
	}

}
