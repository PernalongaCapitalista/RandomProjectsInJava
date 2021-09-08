import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUIteste extends JFrame{
    private static final long serialVersionUID = 1L;

    private JTextField txt;

    public static void main(String[] args){
        GUIteste field = new GUIteste();
        field.testaJTextField();
    }

    private void testaJTextField() {
            this.setTitle("Titulo");
        this.setSize(200, 200);

        txt = new JTextField(10);
        this.getContentPane().add(txt, "North");
        setVisible(true);
    }


}
