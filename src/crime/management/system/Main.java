package crime.management.system;
import GUI.CaseManagementForm;
import GUI.CriminalManagementForm;
import GUI.DepartmentManagementForm;
import GUI.LoginForm;
import GUI.OfficerManagementForm;
import javax.swing.*;
public class Main
{
    public static void main(String[] args)
    {
        //this is a sample build for the design
        //run and notify me that the repo is working
        System.out.println("3albaraka");
        JFrame mainFrame = new LoginForm();
        JFrame caseFrame = new CaseManagementForm();
        JFrame criminalFrame = new CriminalManagementForm();
        JFrame officerFrame = new OfficerManagementForm();
        JFrame departmentFrame = new DepartmentManagementForm();
        
        caseFrame.show();
        mainFrame.show();
        criminalFrame.show();
        officerFrame.show();
        departmentFrame.show();
    }
}
