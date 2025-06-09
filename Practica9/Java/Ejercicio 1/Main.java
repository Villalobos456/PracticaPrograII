import javax.swing.*;
import java.awt.event.*;
public class Main {
    public static void main(String[] args) {
        JFrame v = new JFrame("Teatro Municipal");
        v.setSize(400, 300);
        v.setLayout(null);

        JLabel titulo = new JLabel("TEATRO MUNICIPAL");
        titulo.setBounds(110, 10, 200, 20);
        v.add(titulo);

        JRadioButton b1 = new JRadioButton("Palco");
        JRadioButton b2 = new JRadioButton("Platea");
        JRadioButton b3 = new JRadioButton("Galeria");

        ButtonGroup grupo = new ButtonGroup();
        grupo.add(b1); grupo.add(b2); grupo.add(b3);

        b1.setBounds(30, 40, 80, 20);
        b2.setBounds(120, 40, 80, 20);
        b3.setBounds(210, 40, 80, 20);
        v.add(b1); v.add(b2); v.add(b3);

        JLabel lnum = new JLabel("Número:");
        lnum.setBounds(30, 70, 80, 20);
        v.add(lnum);

        JTextField fnum = new JTextField();
        fnum.setBounds(110, 70, 80, 20);
        v.add(fnum);

        JLabel ldia = new JLabel("Días antes:");
        ldia.setBounds(30, 100, 80, 20);
        v.add(ldia);

        JTextField fdia = new JTextField();
        fdia.setBounds(110, 100, 80, 20);
        v.add(fdia);

        JLabel resultado = new JLabel();
        resultado.setBounds(30, 180, 300, 40);
        resultado.setBorder(BorderFactory.createEtchedBorder());
        v.add(resultado);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fdia.setEnabled(false);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fdia.setEnabled(true);
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fdia.setEnabled(true);
            }
        });

        JButton vender = new JButton("Vender");
        vender.setBounds(30, 140, 100, 25);
        v.add(vender);

        vender.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int n = Integer.parseInt(fnum.getText());
                    int d = fdia.isEnabled() ? Integer.parseInt(fdia.getText()) : 0;
                    Boleto b = null;
                    if (b1.isSelected()) b = new Palco(n);
                    if (b2.isSelected()) b = new Platea(n, d);
                    if (b3.isSelected()) b = new Galeria(n, d);
                    resultado.setText(b.mostrar());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos");
                }
            }
        });

        JButton salir = new JButton("Salir");
        salir.setBounds(140, 140, 100, 25);
        v.add(salir);
        salir.addActionListener(e -> v.dispose());

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setVisible(true);
    }
}