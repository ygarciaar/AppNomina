package com.example.application.views.nomina;

import java.util.Objects;

public abstract class Nomina {

    private String nombreEmpleado;
    private String tipoContrato;
    private String descripcion;

    protected Nomina(String nombreEmpleado, String tipoContrato, String descripcion) {
        setNombreEmpleado(nombreEmpleado);
        setTipoContrato(tipoContrato);
        setDescripcion(descripcion);
    }

    public String nombreEmpleado() {
        return getNombreEmpleado();
    }

    public String tipoContrato() {
        return getTipoContrato();
    }

    public String descripcion() {
        return getDescripcion();
    }

    public String etiqueta() {
        return nombreEmpleado() + " (" + tipoContrato() + ")";
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = validarTexto(nombreEmpleado, "nombreEmpleado");
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = validarTexto(tipoContrato, "tipoContrato");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = validarTexto(descripcion, "descripcion");
    }

    @Override
    public String toString() {
        return etiqueta();
    }

    // 🔥 MÉTODO CLAVE (como convertir en el otro proyecto)
    public abstract double calcularSalario(double valor);

    private static String validarTexto(String valor, String campo) {
        String v = Objects.requireNonNull(valor, campo).trim();
        if (v.isEmpty()) {
            throw new IllegalArgumentException(campo + " no puede estar vacío");
        }
        return v;
    }
}