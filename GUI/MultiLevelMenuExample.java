import java.awt.*;
import java.awt.event.*;

public class MultiLevelMenuExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Multi-Level Menu Example");

        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // exitItem.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent e) {
        //         frame.dispose();
        //     }
        // });

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        frame.setMenuBar(menuBar);

        // frame.addWindowListener(new WindowAdapter() {
        //     public void windowClosing(WindowEvent e) {
        //         frame.dispose();
        //     }
        // });

        frame.setSize(400, 300);
        frame.setVisible(true);
        // frame.validate();
    }
}
