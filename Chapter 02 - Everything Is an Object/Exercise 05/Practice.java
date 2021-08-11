class DataOnly
{
    int i;
    double d;
    boolean b;
}
public class Practice
{
    public static void main(String[] args)
    {
        DataOnly data = new DataOnly();
        System.out.println("Default Value of Integer : " + data.i);
        System.out.println("Default Value of Double  : " + data.d);
        System.out.println("Default Value of Boolean : " + data.b);
        data.i = 1;
        data.d = 1.0;
        data.b = true;
        System.out.println("Modified Value of Integer : " + data.i);
        System.out.println("Modified Value of Double  : " + data.d);
        System.out.println("Modified Value of Boolean : " + data.b);
    }
}
