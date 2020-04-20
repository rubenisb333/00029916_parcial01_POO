package com.RARM.x00029916;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class CalculadoraImpuestos {
    private static Double totalRenta = 0.0;
    private static Double totalISSS = 0.0;
    private static Double totalAFP = 0.0;


    private CalculadoraImpuestos(){}

    public static Double calcularPago(Empleado empleado) throws IllegalArgumentException {

        try{
            if(empleado == null)
                throw new IllegalArgumentException("El empleado que ha ingresado no es valido");

            if(empleado instanceof  ServicioProfesional){
                ServicioProfesional empl =(ServicioProfesional) empleado;
                Double totRent = 0.1 * empl.salario;
                totalRenta+=totRent;
                return empl.salario - totRent;
            }
            else if(empleado instanceof PlazaFija){

                PlazaFija empl = (PlazaFija) empleado;
                Double totAFP = 0.0625 * empl.salario;
                Double totISSS = 0.03 * empl.salario;
                Double restante = (empl.salario - totalAFP) - totalISSS;
                double totRent = 0.0;

                if(restante >= 0.01 && restante<= 472.00 ){
                    totRent = 0.0;
                }
                else if(restante>= 472.01 && restante<= 895.24){
                    totRent = 0.1 * (restante - 472) + 17.67;
                }
                else if(restante>= 895.25 && restante<= 2038.10) {
                    totRent = 0.2 * (restante - 895.24) + 60;
                }
                else if(restante>= 2038.11) {
                    totRent = 0.3 * (restante - 2038.10) + 288.57;
                }
                totalRenta += totRent;
                totalAFP += totAFP;
                totalISSS += totISSS;
                return restante - totalRenta;
            }
            else return -1.0;
        }catch (IllegalArgumentException e){
            System.err.println(e.getLocalizedMessage());
            return -1.0;
        }

    }
    pu
