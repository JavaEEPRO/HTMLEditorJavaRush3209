package main.java.si.inspirited.listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

/**
 * Created by Jesus
 */
public class UndoListener implements UndoableEditListener {
    private UndoManager undoManager;

    // Конструктор, получает менеджер изменений как параметр
    public UndoListener(UndoManager undoManager) {
        this.undoManager = undoManager;
    }


    // Получает изменение и передает в менеджер
    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
        undoManager.addEdit(e.getEdit());
    }


}
