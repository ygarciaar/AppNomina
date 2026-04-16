package com.example.application.views.nomina;

public class NominaBonificaciones extends Nomina implements INomina {

  private final double bonificaciones;

  public NominaBonificaciones(String nombre, String salario, double bonificaciones) {
    super(nombre, salario, String.valueOf(bonificaciones), "0");
    this.bonificaciones = bonificaciones;
  }

  @Override
  public double calcularSalarioNeto(double salario, double bonificaciones, double deducciones) {
    return salario + this.bonificaciones - deducciones;
  }
}