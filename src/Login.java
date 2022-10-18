import java.util.Scanner;

public class Login {
    int userType;

    Login() {
        userType = 0;
    }

    public int login() {

        System.out.println("Enter User ID ");
        Scanner s = new Scanner(System.in);
        String username = s.next();
        System.out.println("Enter Password ");
        String password = s.next();
        if(username=="tutu" && password == "1111" || username=="mimi" && password == "2222"){
        userType =0;
        }
        else{
            userType =1;
        }
        return userType;
    }

//        } else {
//            System.out.println("Bad User ");
//            System.exit(-1);
//        }
//
//        return userType;
//
//    }

}