package com.RARM.x00029916;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        try{

            ServicioProfesional servicioProfesional = new ServicioProfesional
                    ("Alfredo Gonzales", "Programador", 800.0, 2);
            Double pagoProfesional = CalculadoraImpuestos.calcularPago(servicioProfesional);

            PlazaFija plazaFija = new PlazaFija("Carlos Martinez","Fotografo",500.42);
            Double pagoPlazaFija = CalculadoraImpuestos.calcularPago(plazaFija);
            System.out.println("Pago plaza fija: $"+
                    new BigDecimal(pagoPlazaFija).setScale(2, RoundingMode.HALF_UP) +
                    "\nPago servicio profesional: $"+
                    new BigDecimal(pagoProfesional).setScale(2, RoundingMode.HALF_UP) ) ;

            System.out.println( CalculadoraImpuestos.mostrarTotales());

        }catch (Exception e){
            if(e.getLocalizedMessage() == null){
                System.out.println("Error en creacion de objeto en main");
            }
        }
            }

}
