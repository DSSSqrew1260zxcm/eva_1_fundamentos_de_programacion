/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_inicializacion;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

/**
 *
 * @author invitado
 */
public class eva1_11_inicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Los paréntesis denotan una función
        //println() <<---- función
        //main() <<--- función
        System.out.println("Hola mundo!!!!");
        int valor = 0;
        System.out.println(valor);
        //declaramos e inicializamos 3 variables de tipo double
        double salario = 0, iva = 0.16, subtotal = 100000;
        final int CAL_PASAR = 70;
        final String ESCUELA = "Instituto Tecnlogico de Chihuahua II";
        System.out.println(ESCUELA);
        System.out.println("La calificaión minima para pasar es");
        System.out.println(CAL_PASAR);
        //ERROR: Solo se puede declarar una vez
        //cal_pasar = 100;
        //cal_pasar = 70;
        /*
        IGNORAR VARIAS
        LINEAS DE TEXTO Y SI VAN 
        A TIRAR MUCHO ROLLO
         */
        byte valores = 120;
        //valores = 128;
        int miValor = Integer.MAX_VALUE;
        System.out.println(miValor + 1);
    }

}
