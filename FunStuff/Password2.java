import javax.swing.*;

public class Password2

{

    public static void main(String[] args)
    {

    String password = "";

    String passwordRepeat = "";

    //char charBeingChecked;

    boolean letterPresent = false;

    boolean digitPressent = false;

    char charChecked;

    int len = password.length();
    password = JOptionPane.showInputDialog("Enter your password: \n Must be 6 to 10 characters long \n Must contain at least one letter and one number");
        while((len < 6 || len > 10) || !(password.isletterordigit(password)))

        {

            password = JOptionPane.showInputDialog("Invalid password \n Please re-enter password");

        }

    if((len >= 6 || len <= 10) || password.isletterordigit(password))

    do

        {

            passwordRepeat = JOptionPane.showInputDialog("Please enter password again to confirm.");

        }

        while (!(password.equals(passwordRepeat)));

    if(password.equals(passwordRepeat))

        {

        JOptionPane.showMessageDialog(null, "Thank you, now your password is secret.");

        }

    }

}
