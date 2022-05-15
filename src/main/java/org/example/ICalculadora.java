package org.example;

public interface ICalculadora {

    /**
     * @param x
     * @param y
     * Suma de dos elementos int
     */
    public abstract int suma (int x, int y);

    /**
     * @param x
     * @param y
     * Resta de dos elementos int
     */
    public abstract int resta (int x, int y);

    /**
     * @param x
     * @param y
     * Multiplicacion de dos elementos int
     */
    public abstract int multiplación (int x, int y);

    /**
     * @param x
     * @param y
     * División de dos elementos int
     */
    public abstract int división (int x, int y);

}
