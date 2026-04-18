package com.example.application.views.nomina;

public class NominaEmpleadoFijo extends Nomina implements INomina {

    private final double salarioBase;
    private final double bonificacion;

    public NominaEmpleadoFijo(String nombreEmpleado, String tipoContrato, String descripcion, double salarioBase, double bonificacion) {
        super(nombreEmpleado, tipoContrato, descripcion);

        if (!Double.isFinite(salarioBase) || salarioBase < 0.0) {
            throw new IllegalArgumentException("El salario base debe ser válido");
        }

        if (!Double.isFinite(bonificacion)) {
            throw new IllegalArgumentException("La bonificación debe ser válida");
        }

        this.salarioBase = salarioBase;
        this.bonificacion = bonificacion;
    }

    public double salarioBase() {
        return salarioBase;
    }

    public double bonificacion() {
        return bonificacion;
    }

    @Override
    public double calcularSalario(double valor) {
        // 🔥 Aquí no usamos "valor", pero lo dejamos por compatibilidad
        return salarioBase + bonificacion;
    }
}