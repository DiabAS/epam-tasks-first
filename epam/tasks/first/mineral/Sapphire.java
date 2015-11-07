package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Сапфир
 *
 * @autor Дошаков Абай
*/
public class Sapphire extends Precious
{
    private static final String NAME = "Sapphire";
    /**
     * Конструктор по умолчанию
     */
    public Sapphire()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Sapphire(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * Конструктор с параметром объект
     */
    public Sapphire(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
