import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine();

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        int sum = 0;
        int i = startNum;
        while (i <= endNum) {
            sum += i * i;
            ++i;
        }

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");
        System.out.println(sum);
    }
}
