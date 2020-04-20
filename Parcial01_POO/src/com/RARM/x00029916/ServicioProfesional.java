package com.RARM.x00029916;

import java.io.IOException;


public class ServicioProfesional extends Empleado {

    private Integer mesesContrato;

    public ServicioProfesional(String nombre, String puesto, Double salario, Integer mesesContrato) throws  IOException  {
        super(nombre, puesto, salario);
        try{
            if(mesesContrato<=0)
                throw new IllegalArgumentException("No pueden existir meses de contrato nulos o negativos");
            this.mesesContrato = mesesContrato;
        }catch (IllegalArgumentException e){
            System.err.println(e.getLocalizedMessage());
        }
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public String getPuesto() {
        return null;
    }

    @Override
    public Double getSalario() {
        return null;
    }

    @Override
    public void setSalario(Double sal) {
        this.salario = sal;
    }

    public Integer getMeses() {
        return mesesContrato;
    }

    public void setMeses(Integer mesesContrato) {
        this.mesesContrato = mesesContrato;
    }
}

