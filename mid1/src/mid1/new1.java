package mid1;
import java.util.Scanner;

public class new1 {

    public static int i = 1, r = 1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0,
            y = 0,
            sS = 0;

        System.out.println("-----Enter the side of a square-----");
        sS = in.nextInt();

        System.out.print("\n");
        for (x = 1; x <= sS; ++x)
        {
            for (y = 1; y <= sS; ++y)
            {
                // It will check boundary conditions
                // It will check diagonal and secondary diagonal conditions
                if ((x == 1) || (x == sS) || (y == 1) || (y == sS) || (x == y) || (y == (sS - x + 1)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            // It will print the new line
            System.out.print("\n");
        }
    }
}