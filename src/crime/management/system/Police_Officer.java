/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crime.management.system;

import java.util.Vector;

/**
 *
 * @author Abdelatief
 */
public class Police_Officer extends person
{
    private String phone ;
    private float salary;
    Department Dep;
    public static Vector <Police_Officer> officers = new Vector<>();
    Vector <Case> Allcases;

    public Police_Officer(int id,String name,String phone,float salary ,Department dep)
    {
        super( id, name);
        this.phone=phone;
        this.salary=salary;
        Dep = dep;

    }

    public Police_Officer(int id,String name,String phone,float salary ,Department dep,Vector<Case> achieved)
    {
        this(id,name,phone,salary,dep);
        Allcases=achieved;
    }

    public Police_Officer get_policeOfficer ()
    {
       return this; 
    }

    public static Police_Officer get_officer_by_id(int id)
    {
        for (int i = 0; i < officers.size(); i++)
        {
            if (officers.get(i).getId() == id)
                return officers.get(i);
        }
        return null;
    }

    public void addofficer(int id,String name,String phone,float salary ,Department dep,Vector<Case> achieved)
    {
        super.addperson(id, name);
        this.phone=phone;
        this.salary=salary;
        Dep = dep;
        Allcases=achieved;
    }

    public void displayOfficer()
    {
        System.out.println("Officer Name:" + super.name);
        System.out.println("Officer Phone: " + phone);
        System.out.println("Officer Salary: " + salary);
        System.out.println("Officer Department: " + Dep.getName());
    }
    
    public String getName()
    {
        return super.name;
    }
    
    public int getId()
    {
        return super.id;
    }

    public void assign_to_case(Case case1)
    {
        this.Allcases.add(case1);
    }

    public void updatephone(String phone)
    {
        this.phone=phone;
    }

    public void updatesalary(float salary)
    {
        this.salary=salary;
    }

    public void updatedepartment(Department Dep)
    {
        this.Dep=Dep;
    }

    public void updatecases(Vector <Case> Allcases)
    {
        this.Allcases.clear();
        this.Allcases=Allcases;

    }

}