import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            
            System.out.print("enter the number of shapes: ");
            int n = sc.nextInt();
            sc.nextLine();

            List<Shape> sh = new ArrayList<>();


            for (int i = 0; i < n; i++) {
                System.out.print("Rectangle or Circle? (r/c): ");
                char option = sc.next().toLowerCase().charAt(0);

                System.out.print("Color: (BLACK/BLUE/RED): ");
                Color color = Color.valueOf(sc.next().toUpperCase());

                
                if(option == 'r'){
                    System.out.print("Width: ");
                    Double width = sc.nextDouble();
                    System.out.print("Height: ");
                    Double height = sc.nextDouble();

                    Shape rec = new Rectangle(color, width, height);
                    sh.add(rec);

                } 
                if(option == 'c') {
                    System.out.print("Radius: ");
                    Double radius = sc.nextDouble();

                    Shape cir = new Circle(color, radius);
                    sh.add(cir);
                }


            }
            System.out.println();
            System.out.println("SHAPE AREAS:");
            for(Shape csh : sh){
                System.out.println(String.format("%.2f", csh.area()));
            }

        } 
    }
}
