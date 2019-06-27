package com.sgandi.patterns.behavioral.observer.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUIDemo1 extends JPanel {
  JButton button1;
  JTextArea textArea1;

  public GUIDemo1() {
    button1 = new JButton("Button1");
    add(button1);
    textArea1 = new JTextArea("TextArea1", 5, 15);
    add(textArea1);
    // Creating an ActionListener object and registering it on button1
    // (for being notified when an action event occurs).
    button1.addActionListener(new ActionListener() {
      // Anonymous inner class.
      // Implementing the ActionListener interface.
      @Override
      public void actionPerformed(ActionEvent e) {
        textArea1.append("\nNotification from Button1:\n  " + "User clicked the Button1.");
      }
    });
  }

  private static void createAndShowGUI() {
    // Creating the GUI.
    JFrame frame = new JFrame("GUIDemo1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JComponent contentPane = new GUIDemo1();
    frame.setContentPane(contentPane);
    // Showing the GUI.
    frame.pack();
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    // For thread safety, invoked from event-dispatching thread.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        createAndShowGUI();
      }
    });
  }
}
