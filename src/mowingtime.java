import java.util.Scanner;

public class mowingtime {

    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);


        System.out.println("Enter width: ");
        double width = key.nextDouble();

        System.out.println("Enter length: ");
        double length = key.nextDouble();

double userarea = fieldarea(width,length);

        System.out.println(userarea);

    }

    public static double fieldarea (double widthf, double lengthf) {

        double area = widthf*lengthf;
        return area;}

        public static double fieldtime (double bigtime) {






    }

}
