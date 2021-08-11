class Calculation
{
    int storage(String s)
    {
        return s.length()*2;
    }
}
public class Practice
{
    public static void main(String[] args)
    {
        Calculation c = new Calculation();
        int len = c.storage("hello");
        System.out.println("Length of String : " + len);
    }
}
