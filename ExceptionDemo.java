
import java.math.*;

public class ExceptionDemo extends Exception {

    public static void main(String[] args) {
        double a, b, c, x1, x2;
        try {
            a = Double.parseDouble(args[0]);
            b = Double.parseDouble(args[1]);
            c = Double.parseDouble(args[2]);

            x1 = (-b+Math.pow(Math.pow(b, 2)-(4 * a * c), 0.5))/(2 * a);
            x2 = (-b-Math.pow(Math.pow(b, 2)-(4 * a * c), 0.5))/(2 * a);

            System.out.println(x1);
            System.out.println(x2);

        } catch (NumberFormatException f) {
            System.out.println("Please input data in number format only.");
            
        } catch (ArrayIndexOutOfBoundsException f) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
            
        }
    }
}
