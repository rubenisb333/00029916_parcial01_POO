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




}