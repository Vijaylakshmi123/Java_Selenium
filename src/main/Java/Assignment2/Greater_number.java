package Assignment2;

public class Greater_number
{
    public static void main(String[] args)
    {
        Greater_number a = new Greater_number();
        a.Greatest(1,2,3);
        a.Greatest(2,2,5);
    }

    public void Greatest(int a, int b, int c)
    {
        if (a>b)
        {
            System.out.println("a is greater");
        }
        else if (b>c)
        {
            System.out.println("b is greater");

        }
        else {
            System.out.println("c is greater");
        }

    }
}
