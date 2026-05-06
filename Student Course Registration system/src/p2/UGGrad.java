package p2;
public  class UGGrad extends Student /*Inheritance-UGGrad inherits from Student*/
{
    public UGGrad(String name,int age,String stid)
    {
        super(name,age,stid); /*super*/
        
    }
    /*Override*/
    public double Feecalc()
    {
        return 20000;
    }
}
