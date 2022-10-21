import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
public class Login {
    int userType;
    HashMap<String,String> map=new HashMap<String,String>();
    HashMap<String,String> maps=new HashMap<String,String>();

    Login() {
        userType = 0;
    }

    public void fileData()  {
        try {
            File myObj = new File("D:\\PTBS\\src\\BuyerInfo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrOfStr = data.split(":");
                map.put(arrOfStr[0], arrOfStr[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj = new File("D:\\PTBS\\src\\SellerInfo.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrOfStr = data.split(":");
                maps.put(arrOfStr[0], arrOfStr[1]);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public int login() {
        System.out.println("Enter User ID ");
        Scanner s = new Scanner(System.in);
        String username = s.next();
        System.out.println("Enter Password ");
        String password = s.next();
        int i;

        fileData();
        if(map.containsKey(username)){
            if (password.equals(map.get(username))){
                userType =0;
                Buyer b1=new Buyer(0,username);
                System.out.println("Logged in as Buyer");
            }else{
                System.out.println("Bad password ");
                System.exit(-1);
            }
        }
        else if(maps.containsKey(username)){
            if (password.equals(maps.get(username))){
                userType =1;
                System.out.println("Logged in as Seller");
            }
            else{
                System.out.println("Bad password ");
                System.exit(-1);
            }
        }
        else{
            System.out.println("Bad User ");
           System.exit(-1);
        }
        return userType;
    }

}