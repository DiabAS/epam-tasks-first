package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Хризолит
 *
 * @autor Дошаков Абай
*/
public class Chrysolite extends Semiprecious
{
    private static final String NAME = "Chrysolite";
    /**
     * Конструктор по умолчанию
     */
    public Chrysolite()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Chrysolite(Semiprecious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getIsSynthetic(), mineral.getSize(), mineral.getHardness());
    }
    /**
     * Конструктор с параметром объект
     */
    public Chrysolite(double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(NAME, weight, price, isSynthetic, size, hardness);
    }

}
