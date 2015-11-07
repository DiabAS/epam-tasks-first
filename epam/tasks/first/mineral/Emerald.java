package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Изумруд
 *
 * @autor Дошаков Абай
*/
public class Emerald extends Precious
{
    private static final String NAME = "Emerald";
    /**
     * Конструктор по умолчанию
     */
    public Emerald()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Emerald(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * Конструктор с параметром объект
     */
    public Emerald(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
