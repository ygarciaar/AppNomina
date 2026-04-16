package com.example.application.views.nomina;

public class NominaDeducciones extends Nomina implements INomina {

    private final double deduccion;

    public NominaDeducciones(String nombre, double salario, double deduccion) {
        super(nombre, String.valueOf(salario), "0", String.valueOf(deduccion));
        this.deduccion = deduccion;
    }

    public double getDeduccion() {
        return deduccion;
    }

    @Override
    public double calcularSalarioNeto(double salario, double bonificaciones, double deducciones) {
        return salario - deducciones;
    }
}
