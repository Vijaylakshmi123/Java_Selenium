package Assignment2;

public class Factorial {

    public static void main(String[] args)
    {
        Factorial a = new Factorial();
        a.fact(4);
    }

    public void fact(int n)
    {
        int fact=1;
        for(int i=1;i<=10;i++)
        {
            fact= fact*i;
        }
        System.out.println(fact);
    }
}
