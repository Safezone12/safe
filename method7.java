import java.util.Scanner;

/**
 * method7
 */
public class method7 {

    static float triangle (float x, float y){
        return 0.5f* x* y;
    } 
    public static void main(String[] args) {
        float b , h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Base : ");
        b = scanner.nextFloat();
        System.out.println("Height : ");
        h = scanner.nextFloat();
        System.out.println("The triangle area is: " + triangle(b, h));
        
        scanner.close();
    }
}
