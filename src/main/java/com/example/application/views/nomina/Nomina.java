package com.example.application.views.nomina;

import java.util.Objects;

public abstract class Nomina {
  private String nombre;
  private String salario;
  private String bonificaciones;
  private String deducciones;

  protected Nomina(String nombre, String salario, String bonificaciones, String deducciones) {
    setNombre(nombre);
    setSalario(salario);
    setBonificaciones(bonificaciones);
    setDeducciones(deducciones);
  }

  public String nombre() {
    return getNombre();
  }

  public String salario() {
    return getSalario();
  }

  public String bonificaciones() {
    return getBonificaciones();
  }

  public String deducciones() {
    return getDeducciones();
  }

  public String etiqueta() {
    return nombre() + " - Salario: " + salario() + ", Bonificaciones: " + bonificaciones() + ", Deducciones: " + deducciones();
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = Objects.requireNonNull(nombre, "nombre").trim();
  }

  public String getSalario() {
    return salario;
  }

  public void setSalario(String salario) {
    this.salario = Objects.requireNonNull(salario, "salario").trim();
  }

  public String getBonificaciones() {
    return bonificaciones;
  }

  public void setBonificaciones(String bonificaciones) {
    this.bonificaciones = Objects.requireNonNull(bonificaciones, "bonificaciones").trim();
  }

  public String getDeducciones() {
    return deducciones;
  }

  public void setDeducciones(String deducciones) {
    this.deducciones = Objects.requireNonNull(deducciones, "deducciones").trim();
  }

  @Override
  public String toString() {
    return etiqueta();
  }
}