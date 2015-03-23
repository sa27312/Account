Import javax.swing.JOptionPane;
public class Account{
        public static void main(String [] args){
        String[] choices = {"Admin", "Student", "Staff", "Faculty", "Guest"};
        String input = (String) JOptionPane.showInputDialog(null, "what is your
        role ","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices[1]);
        System.out.println("welcome " + input);
}
}