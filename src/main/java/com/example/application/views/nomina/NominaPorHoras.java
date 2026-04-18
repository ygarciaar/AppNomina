package com.example.application.views.nomina;

public class NominaPorHoras extends Nomina implements INomina {

    private final double valorHora;

    public NominaPorHoras(String nombreEmpleado, String tipoContrato, String descripcion, double valorHora) {
        super(nombreEmpleado, tipoContrato, descripcion);

        if (!Double.isFinite(valorHora) || valorHora <= 0.0) {
            throw new IllegalArgumentException("El valor por hora debe ser válido y mayor que cero");
        }

        this.valorHora = valorHora;
    }

    public double valorHora() {
        return valorHora;
    }

    @Override
    public double calcularSalario(double horasTrabajadas) {
        return horasTrabajadas * valorHora;
    }
}