public class NumbersInSpanish {
    public static void main(String[] args) {
       int number = Integer.parseInt(args[0]); 
       
       if (number >= 1) {
           if (number <= 5) {
               if (number == 1) {
                   System.out.println("uno");
               } else if (number == 2) {
                   System.out.println("dos");
               } else if (number == 3) {
                   System.out.println("tres");
               } else if (number == 4) {
                   System.out.println("cuatro");
               } else {  // number == 5
                   System.out.println("cinco");
               }
           } else {
               System.out.println("Sorry I do not know that!");
           }
       } else {
           System.out.println("Sorry I do not know that!");
       }
    }
}

