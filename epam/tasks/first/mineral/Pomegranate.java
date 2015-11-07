package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Гранат
 *
 * @autor Дошаков Абай
*/
public class Pomegranate extends Semiprecious
{
    private static final String NAME = "Pomegranate";
    /**
     * Конструктор по умолчанию
     */
    public Pomegranate()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Pomegranate(Semiprecious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getIsSynthetic(), mineral.getSize(), mineral.getHardness());
    }
    /**
     * Конструктор с параметром объект
     */
    public Pomegranate(double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(NAME, weight, price, isSynthetic, size, hardness);
    }

}
