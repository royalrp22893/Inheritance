
public class multipleinheritance
{
    void mobile()
    {
        System.out.println("Base class method ");
    }
}

class c1 extends multipleinheritance
{
    void color()
    {

        System.out.println("Child class method ");
    }
    public static void main(String[] args)
    {
        c1 b = new c1();
        c1 b1 = new c1();
        b.mobile();
        b1.color();
        p q = new p();
        p q1 = new p();
        q.mobile();
        q1.model();
    }
}

class p extends multipleinheritance
{
    void model()
    {

        System.out.println("One class method ");
    }
}
