package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     *
     * @param values массив чисел
     * @return сумма элементов массива
     */
    public static <Type extends Number> double sum(Type[] values) {
        double sum = 0;
        for (Type value : values) sum += value.doubleValue();
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param <Type>
     * @param values массив значений
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <Type extends Number> double avg(Integer[] values) {
        return sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @return большее из двух значений
     */
    public static <Type extends Number> Integer max(Integer a, Integer b) {
        return a > b ? a : b;
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @return максимальное значение массива
     */
    public static <Type extends Number> int max(Integer[] values) {
        Integer result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return (int) result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @return меньшее из дух значений
     */
    public static <Type extends Number> Integer min(Integer a, Integer b) {
        return a < b ? a : b;
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @return минимальное значение массива
     */
    public static <Type extends Number> int min(Integer[] values) {
        Integer result = values[0];
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return (int) result;
    }
}
