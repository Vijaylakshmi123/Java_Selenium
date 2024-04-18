package Assignment2;

public class Desc
{

    public static void main(String[] args)
    {
        Desc a = new Desc();
        a.descending(3);
    }

    public void descending(int n)
    {
        for(int i=n;i>=0;i--)
        {
            System.out.println(i);
        }
    }
}
