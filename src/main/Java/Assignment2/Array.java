package Assignment2;

public class Array
{
    public static void main(String[] args)
    {
        Array a = new Array();
        a.traverse();
        a.traverse1();
    }
    public void traverse()
    {
        int[] numbers={54, 43,2,1,5};
        for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
    }
    public void traverse1()
    {
        int[] numbers={324, 5,2,2};
        System.out.println();
        for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
        }
    }
}
