package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Алмаз
 *
 * @autor Дошаков Абай
*/
public class Diamond extends Precious
{
    private static final String NAME = "Diamond";
    /**
     * Конструктор по умолчанию
     */
    public Diamond()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Diamond(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * Конструктор с параметром объект
     */
    public Diamond(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
