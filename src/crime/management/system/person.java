package crime.management.system;
// edited the access modifier of person id
// placed the child classes in their own folder to be imported
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
