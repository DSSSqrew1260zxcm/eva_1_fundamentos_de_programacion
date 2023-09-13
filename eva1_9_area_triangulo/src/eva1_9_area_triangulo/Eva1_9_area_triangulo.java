package eva1_9_area_triangulo;

import java.util.*;

public class Eva1_9_area_triangulo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base;
        double altura;
        double area;
        System.out.println("Ingresa la base del triángulo:");
        base = input.nextDouble();
        System.out.println("Ingresa la base del triángulo:");
        altura = input.nextDouble();
        System.out.println("El área del triángulo es:");
        area = (base * altura) / 2;
        System.out.println(area);
    }

}
