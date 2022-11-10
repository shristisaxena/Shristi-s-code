import java.util.Scanner;
public class Interchange {

    /* X = 22 (First number), Y = 12 (Second number)
     * Interchange logic :-
     * X = X + Y = 22 + 12 = 34
     * Y = X - Y = 34 - 12 = 22
     * X = X - Y = 34 - 22 = 12
     */

    public static void main(String[] args) {
        System.out.println(" Enter the value of x and y ");
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(" before interchanging numbers: " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(" after interchanging numbers:" + x +" " + y);

    
        
    }
    
}
