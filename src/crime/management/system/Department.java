/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime.management.system;
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
    public static Vector<Department> DepartmentsList = new Vector<>();

    public Department(int id,String name,String ActivationDate)
    {
        this.id=id;
        this.name=name;
        this.ActivationDate=ActivationDate;
        Add_department(this);
    }
    
    public static Department get_department_by_id(int id)
    { 
        for (int i = 0; i < DepartmentsList.size(); i++)
        {
            if (DepartmentsList.get(i).getId() == id)
            {
                return DepartmentsList.get(i);
            }
        }
        return null;
    }

    private static void Add_department(Department Depart)
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
    
    public void add_officer(Police_Officer officer)
    {
        this.officerList.add(officer);
    }

    private void Update_department(Department Depart,int id,String name,String ActivationDate)
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

    public Vector<Department> getDepartmentsList() {
        return DepartmentsList;
    }

    public void setDepartmentsList(Vector<Department> departmentsList) {
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
