package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Агат
 *
 * @autor Дошаков Абай
*/
public class Agate extends Semiprecious
{
    private static final String NAME = "Agate";
    /**
     * Конструктор по умолчанию
     */
    public Agate()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Agate(Semiprecious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getIsSynthetic(), mineral.getSize(), mineral.getHardness());
    }
    /**
     * Конструктор с параметром объект
     */
    public Agate(double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(NAME, weight, price, isSynthetic, size, hardness);
    }

}
