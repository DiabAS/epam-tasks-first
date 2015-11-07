package epam.tasks.first.mineral;

import epam.tasks.first.mineral.Mineral;
/**
 * Камни драгоценные, так сказать, после обработки
 *
 * @autor Дошаков Абай
*/
public class Precious extends Mineral
{
    private int transparency;
    private String facet;
    private char color;

    /**
     * Конструктор по умолчанию
     */
    public Precious()
    {
        super();
    }
    /**
     * Конструктор со своими параметрами
     */
    public Precious(int transparency, String facet, char color)
    {
        this.transparency = transparency;
        if (facet instanceof String) {
            this.facet = facet;
        }
        this.color = color;
    }
    /**
     * Конструктор с параметрами родителя
     */
    public Precious(String name, double weight, double price)
    {
        super(name, weight, price);
    }
    public Precious(String name, double weight, double price, int transparency, String facet, char color)
    {
        super(name, weight, price);
        this.transparency = transparency;
        if (facet instanceof String) {
            this.facet = facet;
        }
        this.color = color;
    }
    /**
     * Получение значения поля Прозрачности
     */
    public int getTransparency()
    {
        return transparency;
    }
    /**
     * Добавление данных в поле Прозрачности
     */
    public void setTransparency(int transparency)
    {
        if (transparency > 0) {
            this.transparency = transparency;
        }
    }
    /**
     * Получение значения поля Огранки
     */
    public String getFacet()
    {
        return facet;
    }
    /**
     * Добавление данных в поле Огранки
     */
    public void setFacet(String facet)
    {
        if (facet instanceof String) {
            this.facet = facet;
        }
    }
    /**
     * Получение значения поля Цвета
     */
    public char getColor()
    {
        return color;
    }
    /**
     * Добавление данных в поле Цвета
     */
    public void setColor(char color)
    {
        this.color = color;
    }
    /**
     * Получение веса в каратах
     */
    public double getWeight()
    {
        if (super.getWeight() > 0.2) {
            return (super.getWeight() / 0.2);
        } else {
            return super.getWeight();
        }
    }

    public boolean getIsSynthetic()
    {
        return false;
    }
    public void setIsSynthetic(boolean isSynthetic)
    {
        System.out.println("This method overrided in Semiprecious");
    }
    public double getSize()
    {
        return 0.0;
    }
    public void setSize(double size)
    {
        System.out.println("This method overrided in Semiprecious");
    }
    public int getHardness()
    {
        return 0;
    }
    public void setHardness(int hardness)
    {
        System.out.println("This method overrided in Semiprecious");
    }

}
