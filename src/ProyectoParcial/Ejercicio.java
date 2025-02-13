
package ProyectoParcial;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[]args){
        //Declarar variable 
        String empleado;
        double horastrabajadas,tarifaporhora,sueldobruto,descuento,sueldoneto;
        Scanner lectura=new Scanner(System.in);
        System.out.print("Ingresar nombre del empleado:");
        empleado=lectura.next();
        System.out.print("Ingresar horas trabajadas:");
        horastrabajadas=lectura.nextDouble();
        System.out.print("Tarifa por hora:");
        tarifaporhora=lectura.nextDouble();
        //Proceso de datos
        sueldobruto=horastrabajadas*tarifaporhora;
        descuento=sueldobruto*0.13;
        sueldoneto=sueldobruto-descuento;
        //salida de datos
        System.out.println("El sueldo bruto es:"+sueldobruto);
        System.out.println("El descuento es:"+descuento);
        System.out.println("El sueldo neto es:"+sueldoneto);
        //falta agregar
     
    }
    
}
