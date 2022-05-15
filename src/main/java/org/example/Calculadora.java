package org.example;

public class Calculadora implements ICalculadora {

    /**
     * Suma los dos elementos pasados por parametro
     * @param x
     * @param y
     * @return x+y
     */
    @Override
    public int suma (int x, int y){
        return x + y;
    }

    /**
     * Resta los dos elementos pasados por parametro
     * @param x
     * @param y
     * @return x-y
     */
    @Override
    public int resta (int x, int y){
        return x - y;
    }

    /**
     * Multiplica los dos elementos pasados por parametro
     * @param x
     * @param y
     * @return x*y
     */
    @Override
    public int multiplación(int x, int y) {
        return x*y;
    }

    /**
     * Divide los dos elementos pasados por parametro
     * @param x
     * @param y
     * @return x/y
     */
    @Override
    public int división (int x, int y){
        return x / y;
    }


}
