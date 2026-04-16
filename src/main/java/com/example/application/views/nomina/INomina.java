package com.example.application.views.nomina;

public interface INomina {

    String nombre();
    String salario();
    String bonificaciones();
    String deducciones();
    double calcularSalarioNeto(double salario, double bonificaciones, double deducciones);

    default String etiqueta() {
        return nombre() + " - Salario: " + salario() + ", Bonificaciones: " + bonificaciones() + ", Deducciones: " + deducciones();
    }
}
