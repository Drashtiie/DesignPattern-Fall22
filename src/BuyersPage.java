//import required classes and packages  

import javax.swing.*;

//create NewPage class to create a new page on which user will navigate  
class BuyersPage extends JFrame
{
    //constructor  
    BuyersPage()
    {
        //create a welcome label and set it to the new page
//        JLabel wel_label = new JLabel("Welcome: ");
//        b.getContentPane().add(wel_label);
        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Welcome");
        setVisible((true));
        setSize(400, 200);
    }
    public static void showp(){

        System.out.println("B");
        Buyer b = new Buyer();

        System.out.println("B");
        b.showAddButton();
        b.showViewButton();

        System.out.println("B");

//        b.setVisible(true);


    }
}  