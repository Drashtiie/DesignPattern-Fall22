import javax.swing.*;
import java.awt.*;

abstract class Person {

    private ProductMenu theProductMenu;
    abstract void showMenu();
    abstract ProductMenu CreateProductMenu();

    public void showAddButton() {
        JButton b1;
        JPanel newPanel;
        b1 = new JButton("ADD"); //set label to button

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(b1);           //set button to panel
        System.out.println("c");
        //set border to panel
//        add(newPanel, BorderLayout.CENTER);

        //perform action on button click
//        b1.addActionListener(this);     //add action listener to button


    }

    public void showViewButton() {
        JButton b1;
        JPanel newPanel;


        b1 = new JButton("View"); //set label to button

        //create panel to put form elements
        newPanel = new JPanel(new GridLayout(3, 1));
        newPanel.add(b1);           //set button to panel


    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

}
