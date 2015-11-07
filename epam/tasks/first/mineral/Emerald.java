package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * �������
 *
 * @autor ������� ����
*/
public class Emerald extends Precious
{
    private static final String NAME = "Emerald";
    /**
     * ����������� �� ���������
     */
    public Emerald()
    {
        this.setName(NAME);
    }
    /**
     * ����������� � ������������ ��������
     */
    public Emerald(Precious mineral)
    {
        super(NAME, mineral.getWeight(), mineral.getPrice(), mineral.getTransparency(), mineral.getFacet(), mineral.getColor());
    }
    /**
     * ����������� � ���������� ������
     */
    public Emerald(double weight, double price, int transparency, String facet, char color)
    {
        super(NAME, weight, price, transparency, facet, color);
    }

}
