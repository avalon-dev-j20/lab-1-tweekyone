package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point <Type extends Number> {
    /**
     * Абсцисса точки.
     */
    private final Type x;
    /**
     * Ордината точки.
     */
    private final Type y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public Point(Type x, Type y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public int getX() {
        return x.intValue();
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public int getY() {
        return y.intValue();
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public <Type extends Number> double distanceTo(Point point) {
        float dx = x.floatValue() - point.x.floatValue();
        float dy = y.floatValue() - point.y.floatValue();
        return Math.sqrt(dx * dx + dy * dy);
    }
}
