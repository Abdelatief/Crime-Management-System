package crime.management.system;
import GUI.AdminForm;
import GUI.CaseManagement;
import GUI.LoginForm;
import GUI.OfficerForm;
import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {
        //this is a sample build for the design
        //run and notify me that the repo is working
        System.out.println("3albaraka");
        JFrame mainFrame = new LoginForm();
        JFrame caseFrame = new CaseManagement();
        JFrame adminFrame = new AdminForm();
        JFrame officerFrame = new OfficerForm();
        
        officerFrame.show();
        adminFrame.show();
        caseFrame.show();
        mainFrame.show();
    }
}
