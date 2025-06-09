import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame {
    private JComboBox<String> figuraCombo;
    private JComboBox<String> colorCombo;
    private JButton dibujarBtn;
    private JPanel dibujoPanel;
    private JLabel infoLabel;

    public Main() {
        setTitle("Figuras Coloreadas");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        JPanel controlPanel = new JPanel();
        figuraCombo = new JComboBox<>(new String[]{"Cuadrado", "Círculo"});
        colorCombo = new JComboBox<>(new String[]{"#FF0000", "#00FF00", "#0000FF"});
        dibujarBtn = new JButton("Dibujar");
        controlPanel.add(new JLabel("Figura:"));
        controlPanel.add(figuraCombo);
        controlPanel.add(new JLabel("Color:"));
        controlPanel.add(colorCombo);
        controlPanel.add(dibujarBtn);
        add(controlPanel, BorderLayout.NORTH);
        dibujoPanel = new JPanel() {
            Figura figura = null;

            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (figura != null) {
                    figura.dibujar(g, 100, 50);
                }
            }

            public void setFigura (Figura f){
                figura = f;
                repaint();
            }
        };
        add(dibujoPanel, BorderLayout.CENTER);
        infoLabel = new JLabel("Información:");
        add(infoLabel, BorderLayout.SOUTH);
        dibujarBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String tipo = (String) figuraCombo.getSelectedItem();
                String color = (String) colorCombo.getSelectedItem();
                Figura figura;
                if (tipo.equals("Cuadrado")) {
                    figura = new Cuadrado(100, color);
                } else {
                    figura = new Circulo(50, color);
                }
                dibujoPanel.setFigura(figura);
                String info = String.format("Área: %.2f, Perímetro: %.2f", figura.area(), figura.perimetro());
                if (figura instanceof Coloreado) {
                    info += ", " + ((Coloreado)figura).comoColorear();
                }
                infoLabel.setText(info);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FigurasColoreadasGUI().setVisible(true);
        });
    }
}