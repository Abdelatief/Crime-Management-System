import java.util.Vector;
// edited the access modifier of person id
abstract class  person
{
    protected int id;
    protected String name;
    public person(int id , String name)
    {
        this.id=id;
        this.name=name;
    }

    void addperson(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}


class Police_Officer extends person
{
    private String phone ;
    private float salary;
    Department Dep;
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


class Criminal extends person
{
    private String currentlocation;
    private Vector<String>Crimes;
    private String DangerLevel;

    public Criminal(int id , String name,String currentlocation,Vector<String> Crimes,String Danger)
    {
         super(id,name);
         this.currentlocation=currentlocation;
         this.Crimes=Crimes;
         this.DangerLevel=Danger;
    }

    public Criminal get_criminal()
    {
           return this;
    }

    public void addcriminal (int id , String name,String currentlocation,Vector<String> Crimes,String Danger)
    {
        super.addperson(id, name);
        this.currentlocation=currentlocation;
        this.Crimes=Crimes;
        this.DangerLevel=DangerLevel;
    }

    public void updatecurrentLocation(String currentlocation)
    {
        this.currentlocation=currentlocation;
    }

    public void updatecrimes(Vector<String > Crimes)
    {
        this.Crimes=Crimes;
    }

    public void updatedanger(String DangerLevel)
    {
        this.DangerLevel=DangerLevel;
    }

    public String getCurrentlocation()
    {
        return currentlocation;
    }

    public Vector<String> getCrimes() {
        return Crimes;
    }

    public String getDangerLevel()
    {
        return DangerLevel;
    }
}