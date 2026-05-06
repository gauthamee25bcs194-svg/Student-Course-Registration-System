package p1;
import java.util.*;
import p2.*; 
import p3.Display;
 class Main1
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        Student sob1=new Student("Anamika VS",18,"2025BCS0190");
        String t="UG";
        sob1=new UGGrad("Anamika VS",18,"2025BCS0190");
        Course c1ob1=new Course("IMA112","Discrete Mathematics",5);
        Course c2ob2=new Course("ICS113","ITWorkshop",4);
        Display ob1=new Display();
        sob1.registerCourse(c1ob1); /*registering courses*/
        sob1.registerCourse(c2ob2);
        sob1.viewCourse();
        sob1.marks[0][0]=92; sob1.marks[0][1]=56; /*entering test masks for each course*/
        sob1.marks[1][0]=45; sob1.marks[1][1]=43;
        ob1.displayGrade(sob1);
        ob1.displayFees(sob1);
        
        System.out.println("Do you want to register for more students(yes/no)?");
        String an=sc.next();
        
        if(an.equalsIgnoreCase("yes"))
        {
        char choice;
        do
        {
            Display obj=new Display();
            System.out.println("Enter name of student");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter Age");
            int age=sc.nextInt();
            System.out.println("Enter studentID");
            String stid=sc.next();
            System.out.println("Enter student type(UG/PG)");
            String type=sc.next();
            
            Student student=new Student(name,age,stid);
           
           
            
            
            int ch;
            do
            {    System.out.println("\n1.Register Courses");
                 System.out.println("2.View Courses");
                 System.out.println("3.Enter quiz marks");
                 System.out.println("4.View Grades");
                 System.out.println("5.Display Fees");
                 System.out.println("6.Exit");
                
                
                System.out.println("Enter choice");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:System.out.println("Enter the course id");
                          String crid=sc.next();
                          System.out.println("Enter the course name");
                          sc.nextLine();
                          String crname;
                          crname=sc.nextLine();
                          System.out.println("Enter the credits for the course");
                          int credits=sc.nextInt();
                          
                          Course c=new Course(crid,crname,credits);
                          
                          System.out.println("Do you want to add priority to the course(yes/no)?");
                          String ans=sc.next();
                          
                          if(ans.equalsIgnoreCase("Yes"))
                          {
                              System.out.println("Enter the priority(1-5)");
                              int pr=sc.nextInt();
                              student.registerCourse(c,pr);
                          }
                          else
                          student.registerCourse(c);
                          break;
                    case 2:student.viewCourse();
                           break;
                    case 3:for(int i=0;i<student.count;i++)
                           student.testMarks(i);
                           break;
                    case 4:obj.displayGrade(student);
                           break;
                    case 5:if(type.equalsIgnoreCase("PG"))
                           student=new PGGrad(name,age,stid);
                           else if(type.equalsIgnoreCase("UG"))
                           student=new UGGrad(name,age,stid);
                           obj.displayFees(student);
                           break;
                          
                }
            }while(ch!=6);
            System.out.println("Do you have another student to register?(y/n)?");
            choice=sc.next().charAt(0);
        }while(choice=='y'||choice=='Y');
    }}
}
