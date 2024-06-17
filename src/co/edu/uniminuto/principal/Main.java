/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.uniminuto.principal;

import co.edu.uniminuto.entidades.Vehiculos;
import java.util.Scanner;

/* Un taller mecanico desea hacer cotizaciones de reparacion de un vehiculo, para 
ello se necesitan los datos de los vehiculos: la marca,modelo,color,año y motivo de reparacion
se debe pedir mano de obra del mecanico, precio total de repuestos y gastos
administrativos que es el 15 % de la obra de mano + el precio total de repuestos.
En la cotizacion se debe imprimir los datos del vehiculo y el detalle de la 
cotizacion y monto real. 

 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner leer = new Scanner (System.in);
        Vehiculos vehiculo;
        String marca;
        String modelo;
        String color;
        String año;
        String motivoReparacion;
        double manodeObra;
        double costosdePiezas;
        //double costoTotal;
        System.out.println("Ingrese la marca del vehiculo");
        marca = leer.nextLine();
        System.out.println("Ingrese el modelo del vehiculo");
        modelo = leer.nextLine();
        System.out.println("Ingrese el color del vehiculo");
        color = leer.nextLine();
        System.out.println("Ingrese el año del vehiculo");
        año = leer.nextLine();
        System.out.println("Ingrese el motivo de Reparacion del vehiculo");
        motivoReparacion = leer.nextLine();
        vehiculo = new Vehiculos(marca,modelo,color,año,motivoReparacion);
        //solicitar costos
        System.out.println(" Ingrese mano de obra ");
        manodeObra = leer.nextDouble();
        vehiculo.setTrabajomecanico(manodeObra);
        System.out.println(" Ingrese costo de piezas");
        costosdePiezas = leer.nextDouble();
        vehiculo.setCostosdePiezas(costosdePiezas);
        /* Se comenta esta parte del codigo porque los datos se calcularan con
        los metodos calcularCostosAdministrativos y calcularcostoTotal
        
        System.out.println(" Ingrese costo costos Administrativos");
        costosAdministrativos = leer.nextDouble();
        vehiculo.setCostosAdministrativos(costosAdministrativos);*/
        
        // Calcular Gastos Administrativos
        vehiculo.calcularCostosAdministrativos();
        // Calcular total
        vehiculo.calcularcostoTotal();
        //
        System.out.print(" marca " + vehiculo.getMarca());
        System.out.print(" modelo " + vehiculo.getModelo());
        System.out.print(" color " + vehiculo.getColor());
        System.out.print(" año " + vehiculo.getAño());
        System.out.print(" motivodeReparacion " + vehiculo.getMotivoReparacion());
        //
        System.out.println("costo Total " + vehiculo.getCostoTotal());
        System.out.println("trabajomecanico " + vehiculo.getTrabajomecanico());
        System.out.println("costosAdministrativos " + vehiculo.getCostosAdministrativos());
        System.out.println("costo de piezas " + vehiculo.getCostosdePiezas());
        
        
        
        
          
       
       
    }
    
}
