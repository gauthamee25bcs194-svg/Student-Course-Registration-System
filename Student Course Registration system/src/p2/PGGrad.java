package p2;
public class PGGrad extends Student  /*Inheritance-PGGrad inherits from Student*/
{
    public PGGrad(String name,int age,String stid)
    {
        super(name,age,stid); /*super*/
        
    }
    /*Override*/
    public double Feecalc()
    {
        return 30000;
    }
}