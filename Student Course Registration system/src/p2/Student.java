package p2; 
import java.util.*;
interface register /*Interface*/
{
    void registerCourse(Course course); /*Abstract method*/

}
class Person
{
      public String name;
      int age;
      public Person(String name,int age)  /*Constructor*/
      {
          this.name=name; /*this*/
          this.age=age;   /*this*/
      }
      
}

public class Student extends Person implements register
{
    protected String stid; /*protected variable to store student id*/
    public int count;  /* count of the courses is made public so that it can be accessed in p2*/
    public double marks[][]; /*2D array to store marks of 2 tests for each course*/
    public Course courseList[]=new Course[5];/*1D Array of objects*/
    
    public Student(String name,int age,String stid)
    {
        super(name,age);  /*super*/
        this.stid=stid;   /*this*/
        count=0;
        marks=new double[5][2];
    }
    /*overloaded method*/ 
    public void registerCourse(Course course) //interface method implemented 
    {
        if(count <5)
        courseList[count++]=course;
    }
    /*overload*/
    public void registerCourse(Course course,int pr)
    {
       if(pr<1 || pr>5)
       System.out.println("Invalid priority");
       if(count<5)
       {
          for(int i=count;i>=pr;i--) 
          {
              courseList[i]=courseList[i-1];
          }
          courseList[pr-1]=course; count++;
          System.out.println("Course added at priority "+pr);
       }
       else
       System.out.println("Course List full");
       
    }
    public void viewCourse()
    {   System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Courses registered are:");
        for(int i=0;i<count;i++)
        {
            System.out.println(courseList[i].getter());
        }
    }
    public void testMarks(int i)
    {   Scanner sc=new Scanner(System.in);
        String crname=courseList[i].getter();
        System.out.println("Enter the quiz1 marks for "+crname);
        double q1=sc.nextDouble();
        System.out.println("Enter the quiz2 marks for "+crname);
        double q2=sc.nextDouble();
        marks[i][0]=q1;
        marks[i][1]=q2;
    }
    public double calcAvg(int i)
    {
       double t=marks[i][0]+marks[i][1];
       return t/2.0;
    }
    /*override*/
    public double Feecalc()
    {
        return 0;
    }
    
}
