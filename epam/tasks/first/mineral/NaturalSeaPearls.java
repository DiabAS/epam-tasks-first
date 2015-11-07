package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Естественный морской жемчуг
 *
 * @autor Дошаков Абай
*/
public class NaturalSeaPearls extends Precious
{
    private static final String NAME = "NaturalSeaPearls";
    /**
     * Конструктор по умолчанию
     */
    public NaturalSeaPearls()
    {
        this.setName(NAME);
    }
    /**
     * Конструктор с родительским объектом
     */
    public NaturalSeaPearls(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * Конструктор с параметром объект
     */
    public NaturalSeaPearls(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
