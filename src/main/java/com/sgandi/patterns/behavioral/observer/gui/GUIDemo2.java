package com.sgandi.patterns.behavioral.observer.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUIDemo2 extends JPanel implements ActionListener {
  JButton button1;
  JTextArea textArea1;

  public GUIDemo2() {
    button1 = new JButton("Button1");
    add(button1);
    textArea1 = new JTextArea("TextArea1", 10, 50);
    add(textArea1);
    // Creating an ActionListener object and registering it on button1
    // (for being notified when an action event occurs).
    button1.addActionListener(this);

  }

  private static void createAndShowGUI() {
    // Creating the GUI.
    JFrame frame = new JFrame("GUIDemo2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JComponent contentPane = new GUIDemo2();
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

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button1) {
      textArea1.append("\nNotification from Button1:\n  " + "User clicked the Button1.");
    } else {
      textArea1
          .append("\nNotification from container:\n  " + "Some other action performed on source: "
              + e.getSource() + "\n and action is :" + e.getActionCommand());
    }
  }

}

