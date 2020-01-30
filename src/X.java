import java.util.Scanner;

public class X {
    public static void main(String[] args) {


        System.out.println("Введите n");

        String sc = new Scanner(System.in).nextLine();

        Integer n = Integer.parseInt(sc);

        int count = n - 1;

        String[][] array = new String[n][n];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (j == count)
                {
                array[i][j] = "x";
                count--;
                }
                else if (i == j)
                {
                    array[i][j] = "x";
                }
                else
                {
                    array[i][j] = ".";
                }

                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
