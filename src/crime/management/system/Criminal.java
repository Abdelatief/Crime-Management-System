package crime.management.system;

import java.util.Vector;

/**
 *
 * @author Abdelatief
 */
public class Criminal extends person
{
    private String currentlocation;
    public Vector<String>Crimes;
    private String DangerLevel;
    public static Vector<Criminal> criminals = new Vector<>();

    public Criminal(int id , String name,String currentlocation,Vector<String> Crimes,String Danger)
    {
         super(id,name);
         this.currentlocation=currentlocation;
         this.Crimes=Crimes;
         this.DangerLevel=Danger;
         criminals.add(this);
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
    
    public int get_id()
    {
        return super.id;
    }
    
    public String get_name()
    {
        return super.name;
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