class StaticTest
{
    static int i = 47;
}
class Incrementable
{
    static void increment()
    {
        StaticTest.i++;
    }
}
public class Practice
{
    public static void main(String[] args)
    {
        StaticTest st = new StaticTest();
        System.out.println("Before Increment : " + st.i);
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println("After Increment  : " + st.i);
    }
}
