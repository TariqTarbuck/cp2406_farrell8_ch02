import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class InchesToFeetInt {
    public static void main(String[] args) {

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter an inch amount");
        int inchToFoot = 12;
        int inches = inputDevice.nextInt();
        System.out.print(inches + " inches becomes " + (inches/inchToFoot) + "ft" + inches%inchToFoot + "in");
    }
}
