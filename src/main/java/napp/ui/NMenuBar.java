package napp.ui;

import javax.swing.*;

public class NMenuBar extends JPanel {
    private JToolBar toolBar;

    public NMenuBar() {
        toolBar = new JToolBar("toolbar");
        toolBar.setFloatable(false);

        addButton("new");
        addButton("exit");

        setVisible(true);
        add(toolBar);
    }

    private void addButton(String id) {
        JButton button = new JButton(id);
        toolBar.add(button);
    }
}
