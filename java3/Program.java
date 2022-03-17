import java.util.Scanner;



public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter width of Square");
        int x = sc.nextInt();
        System.out.println("enter radius of circle");
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}