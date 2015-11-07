package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Топаз
 *
 * @autor Дошаков Абай
*/
public class Topaz extends Semiprecious
{
    private static final String NAME = "Topaz";
    /**
     * Конструктор по умолчанию
     */
    public Topaz()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Topaz(Semiprecious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getIsSynthetic(), mineral.getSize(), mineral.getHardness());
    }
    /**
     * Конструктор с параметром объект
     */
    public Topaz(double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(NAME, weight, price, isSynthetic, size, hardness);
    }

}
