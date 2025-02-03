import java.util.Scanner; 
public class PrintSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine();

        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("You entered: " + startNum + " and " + endNum);
        System.out.println("Sequence of squares from " + startNum + " to " + endNum + ":");
        for (int i = startNum; i <= endNum; i++) {
            System.out.print((i * i) + " ");
        }
        System.out.println(); 
    }
}