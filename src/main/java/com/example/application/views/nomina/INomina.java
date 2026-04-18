package com.example.application.views.nomina;

public interface INomina {

    String nombreEmpleado();

    String tipoContrato();

    String descripcion();

    double calcularSalario(double valor);

    default String etiqueta() {
        return nombreEmpleado() + " (" + tipoContrato() + ")";
    }
}