package com.RARM.x00029916;

import java.io.IOException;


public abstract class Empleado {
    protected String nombre;
    protected String puesto;
    protected Double salario;

    public Empleado(String nombre, String puesto, Double salario) {
        try{
            if((nombre.isBlank() || puesto.isBlank()) || (nombre.isEmpty() || puesto.isEmpty()) )
                throw new IllegalArgumentException("El nombre y/o el puesto estan vacios");

            this.nombre = nombre;
            this.puesto = puesto;

            if(salario <= 0)
                throw new IllegalArgumentException("No puede haber salario negativo");
            this.salario = salario;

        }catch (IllegalArgumentException e){
            System.err.println(e.getLocalizedMessage());
        }
    }

    public abstract String getNombre();

    public abstract String getPuesto();

    public  abstract Double getSalario();

    public abstract void setSalario(Double sal);
}

