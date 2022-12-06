import java.util.Scanner;
public class MatrixMultiplication {


    public static void main(String args[])
    {
        int row1, column1, row2, column2, sum = 0, a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of first matrix");
        row1= input.nextInt();
        column1 = input.nextInt();

        int first[][] = new int[row1][column1];

        System.out.println("Enter elements of first matrix");

        for (a = 0; a < row1; a++)
            for (b = 0; b < column1; b++)
                first[a][b] = input.nextInt();

        System.out.println("Enter the number of rows and columns of second matrix");
        row2 = input.nextInt();
        column2 = input.nextInt();

        if (column1 != row2)
            System.out.println("First matrix's column must be equal to second matrix's row");
        else
        {
            int second[][] = new int[row2][column2];
            int multiply[][] = new int[row1][column2];

            System.out.println("Enter elements of second matrix");

            for (a = 0; a < row2; a++)
                for (b = 0; b < column2; b++)
                    second[a][b] = input.nextInt();

            for (a = 0; a < row1; a++)
            {
                for (b = 0; b < column2; b++)
                {
                    for (c = 0; c < row2; c++)
                    {
                        sum = sum + first[a][c]*second[c][b];
                    }

                    multiply[a][b] = sum;
                    sum = 0;
                }
            }

            System.out.println("Product of the matrices:");

            for (a = 0; a < row1; a++)
            {
                for (b = 0; b < column2; b++)
                    System.out.print(multiply[a][b]+"\t");

                System.out.print("\n");
            }
        }
    }
}

