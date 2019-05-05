/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Vector;
/**
 *
 * @author zi789
 */
public class Department
{
    private int id;
    private String name;
    private String ActivationDate;
    private Vector<Police_Officer> officerList = new Vector<>();
    private Vector<Case> casesList = new Vector<>();
    private Vector<String> DepartmentsList = new Vector<>();

    public Department(int id,String name,String ActivationDate)
    {
        this.id=id;
        this.name=name;
        this.ActivationDate=ActivationDate;
    }

    private void Add_department(String Depart)
    {
        if(DepartmentsList.contains(Depart))
        {
            System.out.print("This Department already exists");
        }
        else
        {
            DepartmentsList.add(Depart);
        }
    }

    private void Update_department(String Depart,int id,String name,String ActivationDate)
    {
        if(DepartmentsList.contains(Depart))
        {
            DepartmentsList.remove(Depart);
            
            this.id=id;
            this.name=name;
            this.ActivationDate=ActivationDate;
            DepartmentsList.add(Depart);
        }
        else
        {
            System.out.print("This Department Don't exist in our records");
        }
    }

    private Department Display_departmet()
    {
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivationDate() {
        return ActivationDate;
    }

    public void setActivationDate(String activationDate) {
        ActivationDate = activationDate;
    }

    public Vector<Police_Officer> getOfficerList() {
        return officerList;
    }

    public void setOfficerList(Vector<Police_Officer> officerList) {
        this.officerList = officerList;
    }

    public Vector<Case> getCasesList() {
        return casesList;
    }

    public void setCasesList(Vector<Case> casesList) {
        this.casesList = casesList;
    }

    public Vector<String> getDepartmentsList() {
        return DepartmentsList;
    }

    public void setDepartmentsList(Vector<String> departmentsList) {
        DepartmentsList = departmentsList;
    }

    public void add_case(Case c)
    {
        casesList.add(c);
    }

    public void edit_case()
    {
        casesList.get(0).setId(11111);
    }
}
