import javax.swing.JOptionPane;

public class Login {
    
    public static void main(String args[]) {

        // Username
        String Username = JOptionPane.showInputDialog(null,
        "What's you Username:", "Username", JOptionPane.QUESTION_MESSAGE);

        // Create Password
        String Password = JOptionPane.showInputDialog(null, 
        "Password, please:", "Password", JOptionPane.QUESTION_MESSAGE);

        // If correct username and password
        if(Username != "admin" && Password != "1234") {

            JOptionPane.showMessageDialog(null,
            "Your login was successful!", "Login Success", JOptionPane.INFORMATION_MESSAGE);

        }
        
        // If not correct username and password
        else {

            JOptionPane.showMessageDialog(null, 
            "Enter the correct data!!!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }

}
