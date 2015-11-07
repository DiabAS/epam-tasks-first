package epam.tasks.first.mineral;
/**
 * Камни полудрагоценные, так сказать, после обработки
 *
 * @autor Дошаков Абай
*/
public class Semiprecious extends Mineral
{
    private boolean isSynthetic;
    private double size;
    private int hardness;
    /**
     * Конструктор по умолчанию
     */
    public Semiprecious()
    {
        super();
    }
    /**
     * Конструктор со своими параметрами
     */
    public Semiprecious(boolean isSynthetic, double size, int hardness)
    {
        this.isSynthetic = isSynthetic;
        this.size = size;
        this.hardness = hardness;
    }
    /**
     * Конструктор с параметрами родителя
     *
     * При вызове своего конструктора по умолчанию и конструктора родителя,
     * выдается ошибка, т.к. любой конструктор должен быть всегда первым
     */
    public Semiprecious(String name, double weight, double price)
    {
        super(name, weight, price);
    }
    public Semiprecious(String name, double weight, double price, boolean isSynthetic, double size, int hardness)
    {
        super(name, weight, price);
        this.isSynthetic = isSynthetic;
        this.size = size;
        this.hardness = hardness;
    }
    /**
     * Получение значения поля Натуральности (или Синтетический)
     */
    public boolean getIsSynthetic()
    {
        return isSynthetic;
    }
    /**
     * Добавление данных в поле Натуральности (или Синтетический)
     */
    public void setIsSynthetic(boolean isSynthetic)
    {
        this.isSynthetic = isSynthetic;
    }
    /**
     * Получение значения поля Размер
     */
    public double getSize()
    {
        return size;
    }
    /**
     * Добавление данных в поле Размер
     */
    public void setSize(double size)
    {
        this.size = size;
    }
    /**
     * Получение значения поля Твердости
     */
    public int getHardness()
    {
        return hardness;
    }
    /**
     * Добавление данных в поле Твердости
     */
    public void setHardness(int hardness)
    {
        this.hardness = hardness;
    }

    public int getTransparency()
    {
        return 0;
    }
    public void setTransparency(int transparency)
    {
        System.out.println("This method overrided in Precious");
    }
    public String getFacet()
    {
        return " ";
    }
    public void setFacet(String facet)
    {
        System.out.println("This method overrided in Precious");
    }
    public char getColor()
    {
        return ' ';
    }
    public void setColor(char color)
    {
        System.out.println("This method overrided in Precious");
    }

}
