import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JTextField txt1, txt2, txtResultado;

    public Main() {
        setTitle("Calculadora");
        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        txt1 = new JTextField(); txt1.setBounds(50, 20, 120, 30);
        txt2 = new JTextField(); txt2.setBounds(200, 20, 120, 30);
        txtResultado = new JTextField(); txtResultado.setBounds(100, 60, 200, 30);

        add(txt1); add(txt2); add(txtResultado);

        JButton btnSuma = new JButton("+"); btnSuma.setBounds(50, 100, 60, 30);
        JButton btnResta = new JButton("-"); btnResta.setBounds(120, 100, 60, 30);
        JButton btnMulti = new JButton("*"); btnMulti.setBounds(190, 100, 60, 30);
        JButton btnDiv = new JButton("/"); btnDiv.setBounds(260, 100, 60, 30);

        JButton btnCtoF = new JButton("C -> F"); btnCtoF.setBounds(50, 150, 120, 30);
        JButton btnFtoC = new JButton("F -> C"); btnFtoC.setBounds(200, 150, 120, 30);

        JButton btnRaiz = new JButton("Raiz"); btnRaiz.setBounds(50, 200, 120, 30);
        JButton btnPot = new JButton("Potencia"); btnPot.setBounds(200, 200, 120, 30);

        add(btnSuma); add(btnResta); add(btnMulti); add(btnDiv);
        add(btnCtoF); add(btnFtoC);
        add(btnRaiz); add(btnPot);

        Calculadora calc = new Calculadora();
        ConversorTemperatura conv = new ConversorTemperatura();
        Raizcuadrada_Exponente op = new Raizcuadrada_Exponente();

        btnSuma.addActionListener(e -> {
            double a = Double.parseDouble(txt1.getText());
            double b = Double.parseDouble(txt2.getText());
            txtResultado.setText("" + calc.sumar(a, b));
        });

        btnResta.addActionListener(e -> {
            double a = Double.parseDouble(txt1.getText());
            double b = Double.parseDouble(txt2.getText());
            txtResultado.setText("" + calc.restar(a, b));
        });

        btnMulti.addActionListener(e -> {
            double a = Double.parseDouble(txt1.getText());
            double b = Double.parseDouble(txt2.getText());
            txtResultado.setText("" + calc.multiplicar(a, b));
        });

        btnDiv.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txt1.getText());
                double b = Double.parseDouble(txt2.getText());
                txtResultado.setText("" + calc.dividir(a, b));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error: division entre cero");
            }
        });

        btnCtoF.addActionListener(e -> {
            double c = Double.parseDouble(txt1.getText());
            txtResultado.setText("" + conv.celsiusAFahrenheit(c));
        });

        btnFtoC.addActionListener(e -> {
            double f = Double.parseDouble(txt1.getText());
            txtResultado.setText("" + conv.fahrenheitACelsius(f));
        });

        btnRaiz.addActionListener(e -> {
            double num = Double.parseDouble(txt1.getText());
            txtResultado.setText("" + op.raiz(num));
        });

        btnPot.addActionListener(e -> {
            double base = Double.parseDouble(txt1.getText());
            double exp = Double.parseDouble(txt2.getText());
            txtResultado.setText("" + op.potencia(base, exp));
        });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
