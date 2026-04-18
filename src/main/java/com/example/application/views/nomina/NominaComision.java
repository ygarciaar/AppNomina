package com.example.application.views.nomina;

public class NominaComision extends Nomina implements INomina {

    private final double porcentaje;

    public NominaComision(String nombreEmpleado, String tipoContrato, String descripcion, double porcentaje) {
        super(nombreEmpleado, tipoContrato, descripcion);

        if (!Double.isFinite(porcentaje) || porcentaje <= 0.0) {
            throw new IllegalArgumentException("El porcentaje debe ser válido y mayor que cero");
        }

        this.porcentaje = porcentaje;
    }

    public double porcentaje() {
        return porcentaje;
    }

    @Override
    public double calcularSalario(double ventas) {
        return ventas * porcentaje;
    }
}