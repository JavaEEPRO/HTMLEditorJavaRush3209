package main.java.si.inspirited.actions;

import main.java.si.inspirited.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Jesus
 */
public class UndoAction extends AbstractAction {
    private View view;
    public UndoAction(View view)
    {this.view = view;}

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
