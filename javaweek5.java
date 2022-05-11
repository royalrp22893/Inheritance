public class javaweek5
{
    void mobile()
    {

        System.out.println("Base class method ");
    }
}


class c extends javaweek5
    {
        void color()
        {
            System.out.println("Child class method ");
        }
        public static void main(String[] args)
        {
             c b = new c();
             c b1 = new c();
             b.mobile();
             b1.color();
        }
    }
