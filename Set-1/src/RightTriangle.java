public class RightTriangle
{
    public static void main(String[] args)
    {
        System.out.println("The Right Angled Triangle is here");
        print2();
    }


    public static void print2()
    {
        for (int i = 0; i < 5 ; i++)
        {
            for (int j = 0; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
