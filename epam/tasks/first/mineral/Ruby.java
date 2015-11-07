package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Рубин
 *
 * @autor Дошаков Абай
*/
public class Ruby extends Precious
{
    private static final String NAME = "Ruby";
    /**
     * Конструктор по умолчанию
     */
    public Ruby()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public Ruby(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * Конструктор с параметром объект
     */
    public Ruby(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
