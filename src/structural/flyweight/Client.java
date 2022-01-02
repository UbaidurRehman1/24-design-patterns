package structural.flyweight;


public class Client {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 300, 300);
        window.setVisible(true);
        window.setSize(600, 400);

/*
        MyImage i = new MyImage("YOUR IMG PATH");
        JPanel panel = new JPanel();
        JLabel label = new JLabel():
        label.setIcon(new ImageIcon(i.img));
        panel.add(label);
        window.add(panel);
*/
    }
}
