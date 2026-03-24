import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazParticipante extends JFrame {
    private JTextField tfMatricula, tfNombres, tfApellidos, tfCuatrimestre;
    private JButton btnCapturar, btnPresentar;
    private ProcesarDatos procesarDatos;

    public InterfazParticipante() {
        // Crear una instancia de la clase ProcesarDatos
        procesarDatos = new ProcesarDatos();

        // Configuración de la ventana
        setTitle("Formulario de Captura de Datos");
        setLayout(new GridLayout(5, 2));

        // Inicializar los componentes
        JLabel lblMatricula = new JLabel("Matrícula:");
        JLabel lblNombres = new JLabel("Nombres:");
        JLabel lblApellidos = new JLabel("Apellidos:");
        JLabel lblCuatrimestre = new JLabel("Cuatrimestre:");

        tfMatricula = new JTextField();
        tfNombres = new JTextField();
        tfApellidos = new JTextField();
        tfCuatrimestre = new JTextField();

        btnCapturar = new JButton("Capturar");
        btnPresentar = new JButton("Presentar");

        // Agregar los componentes al formulario
        add(lblMatricula);
        add(tfMatricula);
        add(lblNombres);
        add(tfNombres);
        add(lblApellidos);
        add(tfApellidos);
        add(lblCuatrimestre);
        add(tfCuatrimestre);
        add(btnCapturar);
        add(btnPresentar);

        // Configurar los botones
        btnCapturar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                capturarDatos();
            }
        });

        btnPresentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presentarDatos();
            }
        });

        // Configuración de la ventana
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Método para capturar los datos
   private void capturarDatos() {
    String matricula = tfMatricula.getText();  // Capturar los datos de los campos
    String nombres = tfNombres.getText();
    String apellidos = tfApellidos.getText();
    String cuatrimestre = tfCuatrimestre.getText();

    // Verificar que los campos no estén vacíos (opcional)
    if (matricula.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || cuatrimestre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos deben ser completados.");
    } else {
        // Llamar al método de la clase ProcesarDatos para capturar los datos
        procesarDatos.capturarDatos(matricula, nombres, apellidos, cuatrimestre);
    }
}

    // Método para presentar los datos
    private void presentarDatos() {
        // Obtener los datos procesados
        String datos = procesarDatos.presentarDatos();

        // Mostrar los datos en un JOptionPane
        JOptionPane.showMessageDialog(this, datos, "Datos Capturados", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        // Crear una nueva instancia de la clase InterfazParticipante
        new InterfazParticipante();
    }
}
