class Square
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        Square S = new Square();
        S.root(2,3);
        S.cube(3,4);
    }

    public void root( int a, int b)
    {
        int square1= (a * a) + (b * b) + (2 * a * b);
        System.out.println(square1);
        }

    public void cube (int c, int d) {
        int cube = (c * c * c) + (d * d * d) + (3 * c * c * d) + (3 * c * d * d);
        System.out.println(cube);
    }

}