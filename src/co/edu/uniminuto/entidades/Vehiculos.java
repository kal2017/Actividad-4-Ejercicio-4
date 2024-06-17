/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entidades;

/**
 *
 * @author jjleo
 */
public class Vehiculos {
    private String marca;
    private String modelo;
    private String color;
    private String año;
    private String motivoReparacion;
    private double costodeReparacion;
    private double trabajomecanico;
    private double costosdePiezas;
    private double costosAdministrativos;
    private double costoTotal;

    public Vehiculos(String marca, String modelo, String color, String año, String motivoReparacion, double costodeReparacion, double trabajomecanico, double costosdePiezas, double costosAdministrativos, double costoTotal) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
        this.costodeReparacion = costodeReparacion;
        this.trabajomecanico = trabajomecanico;
        this.costosdePiezas = costosdePiezas;
        this.costosAdministrativos = costosAdministrativos;
        this.costoTotal = costoTotal;
    }

    public Vehiculos(String marca, String modelo, String color, String año, String motivoReparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.año = año;
        this.motivoReparacion = motivoReparacion;
    }

    public Vehiculos(double costodeReparacion, double trabajomecanico, double costosdePiezas, double costosAdministrativos, double costoTotal) {
        this.costodeReparacion = costodeReparacion;
        this.trabajomecanico = trabajomecanico;
        this.costosdePiezas = costosdePiezas;
        this.costosAdministrativos = costosAdministrativos;
        this.costoTotal = costoTotal;
    }

    public String getMotivoReparacion() {
        return motivoReparacion;
    }

    public void setMotivoReparacion(String motivoReparacion) {
        this.motivoReparacion = motivoReparacion;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public double getCostodeReparacion() {
        return costodeReparacion;
    }

    public void setCostodeReparacion(double costodeReparacion) {
        this.costodeReparacion = costodeReparacion;
    }

    public double getTrabajomecanico() {
        return trabajomecanico;
    }

    public void setTrabajomecanico(double trabajomecanico) {
        this.trabajomecanico = trabajomecanico;
    }

    public double getCostosdePiezas() {
        return costosdePiezas;
    }

    public void setCostosdePiezas(double costosdePiezas) {
        this.costosdePiezas = costosdePiezas;
    }

    public double getCostosAdministrativos() {
        return costosAdministrativos;
    }

    public void setCostosAdministrativos(double costosAdministrativos) {
        this.costosAdministrativos = costosAdministrativos;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
        
    }
    public void calcularCostosAdministrativos(){
        this.costosAdministrativos = (this.trabajomecanico * 0.15) + this.costosdePiezas ;
        
    }
    public void calcularcostoTotal(){
       costoTotal = this.costosAdministrativos + this.costosdePiezas + this.costodeReparacion + this.trabajomecanico;
    }
    
}
