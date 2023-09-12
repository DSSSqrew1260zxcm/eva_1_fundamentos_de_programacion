package eva1_6_entradas_salidas;

import java.util.*;

public class Eva1_6_entradas_salidas {

    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        double precio;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar la marca del auto:");
        marca = input.nextLine();
        System.out.println("Ingresar el modelo del auto:");
        modelo = input.nextLine();
        System.out.println("Ingresar el año del auto:");
        year = input.nextInt();
        System.out.println("Ingresar el precio del auto:");
        precio = input.nextDouble();
        System.out.println("\n");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(year);
        System.out.println(precio);
    }

}
