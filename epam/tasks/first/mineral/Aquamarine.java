package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Аквамарин
 *
 * @autor Дошаков Абай
*/
public class Aquamarine extends Semiprecious
{
    private static final String NAME = "Aquamarine";
    /**
     * Конструктор по умолчанию
     */
    public Aquamarine()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Aquamarine(Semiprecious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getIsSynthetic(), mineral.getSize(), mineral.getHardness());
    }
    /**
     * Конструктор с параметром объект
     */
    public Aquamarine(double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(NAME, weight, price, isSynthetic, size, hardness);
    }

}
