import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardEvents extends JFrame implements KeyListener {
    JPanel pnl = new JPanel();
    JTextField txtField = new JTextField(48);
    JTextArea txtArea = new JTextArea(5, 48);

    public KeyboardEvents(){
        super( "Swing Window" );
        setSize( 500,200 );
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        add(pnl);
        pnl.add(txtField);
        pnl.add(txtArea);

        txtField.addKeyListener(this);
        setVisible(true);
    }


    @Override
    public void keyTyped(KeyEvent e) {
        txtArea.append("\nCharacter: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        txtArea.setText("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        txtArea.append("\nKey Code: " + keyCode);
        txtArea.append(("\nKey Text: " + e.getKeyText(keyCode)));
    }

    public static void main(String[] args) {
        KeyboardEvents gui = new KeyboardEvents();
    }
}
