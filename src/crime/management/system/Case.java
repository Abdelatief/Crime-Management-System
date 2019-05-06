package crime.management.system;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.Date;

public class Case
{
    private int id;
    private String description;
    private String startDate;
    private String lastUpdateDate;
    private String crimeType;
    private Department Department;
    private Vector<Police_Officer> officers_assigned = new Vector<>();
    private Vector<Criminal> criminalsInvolved = new Vector<>();
    public static Vector<Case> cases = new Vector<>();

    //parametrized construction with the essential attributes only
    public Case (int id, String crimeType, String description, Department caseDepartment, String startDate)
    {
        this.id = id;
        this.description = description;
        this.crimeType = crimeType;
        this.Department = caseDepartment;
        //this.officers_assigned = null;
        //this.criminalsInvolved = null;
        //this.officers_assigned = null;

        if (startDate.equals("today"))
        {
            this.startDate = getCurrentDate();
            this.lastUpdateDate = getCurrentDate();
        }
        else
        {
            this.startDate = startDate;
            this.lastUpdateDate = startDate;
        }
        cases.add(this);
    }

    //parametrized constructor with all the attributes except the last update date
    public Case (int id, String crimeType, String description, Department caseDepartment,
          Vector<Police_Officer> officers_assigned, Vector<Criminal> criminalsInvolved, String startDate)
    {
        this(id, crimeType, description, caseDepartment,startDate);
        this.officers_assigned = officers_assigned;
        this.criminalsInvolved = criminalsInvolved;
        cases.add(this);
    }

    public void add_case(Case case_)
    {
        this.cases.add(case_);
    }
    
    public static Case get_case_by_id(int id)
    {
        for (int i = 0; i < cases.size(); i++)
        {
            if (cases.get(i).getId() == id)
                return cases.get(i);
        }
        return null;
    }
    
    public static void remove_case(Case case_)
    {
        for (int i = 0; i < cases.size(); i++)
        {
            if (cases.get(i) == case_)
                cases.remove(i);
        }
    }

    public void add_Officer(Police_Officer officer)
    {
        this.officers_assigned.add(officer);
    }

    public void add_criminal(Criminal criminal)
    {
        criminalsInvolved.add(criminal);
    }

    private String getCurrentDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); //yyyy MM dd HH mm ss
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void displayCase()
    {
        System.out.println("Case ID: " + id);
        System.out.println("Case Crime: " + crimeType);
        System.out.println("Case Description: " + description);
        System.out.println("Case Department: " + Department.getName());
        System.out.println("Case Start Date: " + startDate);
        System.out.println("Case Last update date: " + lastUpdateDate);
    }

    public Vector<Case> getCases()
    {
        return this.cases;
    }


    //getters and setters for all the attributes
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
        this.lastUpdateDate = getCurrentDate();
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
        this.lastUpdateDate = getCurrentDate();
    }

    public String getStartDate()
    {
        return startDate;
    }

    public void setStartDate(String startDate)
    {
        this.startDate = startDate;
        this.lastUpdateDate = getCurrentDate();
    }

    public String getLastUpdateDate()
    {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate)
    {
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdateDate = getCurrentDate();
    }

    public String getCrimeType()
    {
        return crimeType;
    }

    public void setCrimeType(String crimeType)
    {
        this.crimeType = crimeType;
        this.lastUpdateDate = getCurrentDate();
    }

    public Department getDepartment()
    {
        return Department;
    }

    public void setDepartment(Department caseDepartment)
    {
        this.Department = caseDepartment;
        this.lastUpdateDate = getCurrentDate();
    }

    public Vector<Police_Officer> getOfficers_assigned()
    {
        return officers_assigned;
    }

    public void setOfficers_assigned(Vector<Police_Officer> officers_assigned)
    {
        this.officers_assigned = officers_assigned;
        this.lastUpdateDate = getCurrentDate();
    }

    public Vector<Criminal> getCriminalsInvolved()
    {
        return criminalsInvolved;
    }

    public void setCriminalsInvolved(Vector<Criminal> criminalsInvolved)
    {
        this.criminalsInvolved = criminalsInvolved;
        this.lastUpdateDate = getCurrentDate();
    }
}



