package com.example.application.views.nomina;

import java.util.List;

public final class NominasPredefinidas {

    private NominasPredefinidas() {
    }

    public static List<INomina> todos() {
        return List.of(
                new NominaEmpleadoFijo("Juan Pérez", "Empleado Fijo", "Salario mensual", 2000000, 200000),
                new NominaEmpleadoFijo("María López", "Empleado Fijo", "Salario mensual", 2500000, 300000),

                new NominaPorHoras("Carlos Ruiz", "Por Horas", "Pago por horas trabajadas", 15000),
                new NominaPorHoras("Ana Torres", "Por Horas", "Pago por horas trabajadas", 20000),

                new NominaComision("Luis Gómez", "Comisión", "Pago por ventas", 0.10),
                new NominaComision("Sofía Martínez", "Comisión", "Pago por ventas", 0.15)
        );
    }
}