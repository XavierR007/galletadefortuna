import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class galletitadefortuna extends JFrame {
    private JButton btnObtenerMensaje;
    private JLabel lblMensaje;

    private String[] mensajes = {
            "Messi es campeon del mundo",
            "Riquelmeee",
            "solo kalusha",
            "Montiel al Arco",
            "Esta muy lejos - DjMario"
    };

    public galletitadefortuna() {
        setTitle("Galleta de la fortuna");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnObtenerMensaje = new JButton("Presiona para saber tu Suerte");
        lblMensaje = new JLabel();

        setLayout(new java.awt.FlowLayout());

        add(btnObtenerMensaje);
        add(lblMensaje);

        btnObtenerMensaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMensajeAleatorio();
            }
        });
    }

    private void mostrarMensajeAleatorio() {
        Random random = new Random();
        int indiceMensaje = random.nextInt(mensajes.length);
        String mensaje = mensajes[indiceMensaje];
        lblMensaje.setText(mensaje);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new galletitadefortuna().setVisible(true);
            }
        });
    }
}