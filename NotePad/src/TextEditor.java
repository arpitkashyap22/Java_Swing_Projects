import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame implements ActionListener {
    private static JTextArea area;
    private static JFrame frame;
    private static JMenuBar mainMenu;
    public TextEditor(){
        setFrame();
        setMenu();
        frame.setVisible(true);
    }

    public void setFrame(){
        frame = new JFrame("Text Editor");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.out.println(e);;
        }
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(640,680);
        area = new JTextArea();
        frame.add(area);

    }
    public void setMenu(){
        mainMenu = new JMenuBar();

        JMenu fileMenu =new JMenu("File");

        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen =new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");

        itemNew.addActionListener(this);
        itemOpen.addActionListener(this);
        itemSave.addActionListener(this);
        itemExit.addActionListener(this);

        mainMenu.add(fileMenu);
        fileMenu.add(itemNew);
        fileMenu.add(itemOpen);
        fileMenu.add(itemSave);
        fileMenu.add(itemExit);

        frame.setJMenuBar(mainMenu);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
