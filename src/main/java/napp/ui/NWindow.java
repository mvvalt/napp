package napp.ui;

import javax.swing.*;
import java.awt.*;

public class NWindow extends JFrame {
    public NWindow() {
        super("napp");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(new Rectangle(1280, 720));
        setVisible(true);

        add(new NMenuBar());
    }
}
