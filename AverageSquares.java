import java.util.Scanner; 

public class AverageSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();

        in.nextLine();

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);

        int sum = 0;
        int count = 0;
        int i = startNum;
        do {
            sum += i * i;
            count++;
            ++i;
        } while (i <= endNum);

        double average = (double) sum / count;

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        System.out.println(average);
    }
}