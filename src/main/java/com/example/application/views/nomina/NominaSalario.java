package com.example.application.views.nomina;

public class NominaSalario extends Nomina implements INomina {

    private final double salario;

    public NominaSalario(String nombre, double salario) {
        super(nombre, String.valueOf(salario), "0", "0");
        this.salario = salario;
    }

    public String getSalario() {
        return String.valueOf(salario);
    }

    @Override
    public double calcularSalarioNeto(double salario, double bonificaciones, double deducciones) {
        return salario + bonificaciones - deducciones;
    }
}
