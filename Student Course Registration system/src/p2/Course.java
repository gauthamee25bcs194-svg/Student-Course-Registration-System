package p2;

public class Course
{
    private String crid;  /*private variables that store the course details*/
    private String crname; /*private*/
    private int credits;  /*private*/
    
    public Course(String crid,String crname,int credits)
    {
        this.crid=crid;       /*this*/
        this.crname=crname;   /*this*/
        this.credits=credits; /*this*/
    }
    
    public String getter() 
    {
        return crname;
    }
    public int getCredits()
    {
        return credits;
    }
    
}