package com.RARM.x00029916;

import java.io.IOException;


public class PlazaFija extends Empleado {

    public PlazaFija(String nombre, String puesto, Double salario) {
        super(nombre, puesto, salario);
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getPuesto() {
        return this.puesto;
    }

    @Override
    public Double getSalario() {
        return this.salario;
    }

    @Override
    public void setSalario(Double sal) {
        this.salario = sal;
    }
}