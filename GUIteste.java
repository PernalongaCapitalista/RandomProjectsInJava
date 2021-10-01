import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIteste extends JFrame{

    private JTextField txt;

    public static void main(String[] args){
        GUIteste field = new GUIteste();
        field.testaJTextField();
    }

    private void testaJTextField() {
            this.setTitle("Titulo");
        this.setSize(500, 200);

        txt = new JTextField(1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().add(txt, "North");
        setVisible(true);
    }


}
