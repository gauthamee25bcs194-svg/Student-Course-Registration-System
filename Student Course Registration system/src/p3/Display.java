package p3;
import  p2.Student; 
import p2.*;
import p2.Course;
public class Display
{
    public void displayGrade(Student s)
    {   
        System.out.println("\nCourse Grade Report Card");
        for(int i=0;i<s.count;i++)
        {   char g=' ';
            String cname=s.courseList[i].getter(); /*private variable being accessed through the members of its class*/
            double avg=s.calcAvg(i);
            if(avg>=80)
            g='A';
            else if(avg>=70)
            g='B';
            else if(avg>=50)
            g='C';
            else if(avg>=40)
            g='D';
            else
            g='F';
            System.out.println("Course: "+cname);
            System.out.println("Average :"+avg+" Grade: "+g);
            
        }
    }
    public void displayFees(Student s)
    {
        if(s instanceof p2.PGGrad)  /*instanceof*/
         {   System.out.println("\nFees for PG Course");
             System.out.println("Rs "+s.Feecalc()+"/-");}
        else if(s instanceof p2.UGGrad) /*instanceof*/
        {   System.out.println("\nFees for UG Course");
            System.out.println("Rs "+s.Feecalc()+"/-");}
            }
}