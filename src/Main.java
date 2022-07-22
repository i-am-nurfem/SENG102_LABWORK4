import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int length, num_Row, num_Column, a;
        String choice;

        Scanner scan = new Scanner(System.in);

        System.out.println("--- Fibonacci solution starts ---");

        System.out.println("Enter the length of sequence: ");
        length = scan.nextInt();

        Fibonacci f = new Fibonacci(length);
        f.generate();

        System.out.println("\n--- Fibonacci solution ends ---");

        System.out.println("--- --- --- --- --- --- --- --- ---");


        System.out.println("--- MatrixLab solution starts ---");


        System.out.println("Enter the length of row: ");
        num_Row = scan.nextInt();

        System.out.println("Enter the length of column: ");
        num_Column = scan.nextInt();

        System.out.println();

        MatrixLab mL = new MatrixLab(num_Row, num_Column);
        System.out.println("Matrix is shown below:");
        mL.print();

        System.out.println();

        System.out.println("Calculate sum of (row/column): ");
        choice = scan.next();

        if(choice.equals("row")){
            System.out.println("Which row? ");
            a = scan.nextInt();
            mL.sumRow(a);
        }
        else if(choice.equals("column")){
            System.out.println("Which column? ");
            a = scan.nextInt();
            mL.sumCol(a);
        }
        System.out.println("--- MatrixLab solution ends ---");
    }
}
