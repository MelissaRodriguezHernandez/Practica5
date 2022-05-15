package org.example;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

public class CalculadoraTest {

    /**
     * Pruebas para el metodo suma de la clase Calculadora
     */
    @Test
    public void probarSuma(){

        Calculadora calc = new Calculadora();

        Assert.assertEquals(10, calc.suma(5,5), 0.001);
        Assert.assertEquals(20, calc.suma(15,5), 0.001);
        Assert.assertEquals(110, calc.suma(100,10), 0.001);
    }

    /**
     * Pruebas para el metodo resta de la clase Calculadora
     */
    @Test
    public void probarResta(){

        Calculadora calc = new Calculadora();

        Assert.assertEquals(10, calc.resta(15,5), 0.001);
        Assert.assertEquals(20, calc.resta(30,10), 0.001);
        Assert.assertEquals(110, calc.resta(200,90),  0.001);

    }

    /**
     * Pruebas para el metodo multipliación de la clase Calculadora
     */
    @Test
    public void probarMultiplicacion(){

        Calculadora calc = new Calculadora();

        Assert.assertEquals(25, calc.multiplación(5,5), 0.001);
        Assert.assertEquals(75, calc.multiplación(15,5), 0.001);
        Assert.assertEquals(3900, calc.multiplación(60,65), 0.001);

    }

    /**
     * Pruebas para el metodo división de la clase Calculadora
     */
    @Test
    public void probarDivicion(){

        Calculadora calc = new Calculadora();

        Assert.assertEquals(1, calc.división(5,5), 0.001);
        Assert.assertEquals(3, calc.división(15,5), 0.001);
        Assert.assertEquals(12,calc.división(60,5),  0.001);

    }


}
