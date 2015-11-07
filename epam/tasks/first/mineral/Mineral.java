package epam.tasks.first.mineral;
/**
 * Минералы, не обработанные, родитель камней
 *
 * @autor Дошаков Абай
 */
public abstract class Mineral
{
    private String name;
    private double weight;
    private double price;

    /**
     * Конструктор по умолчанию
     */
    public Mineral()
    {
        super();
    }
    /**
     * Конструктор с необходимыми параметрами
     */
    public Mineral(String name, double weight, double price)
    {
        this();
        if (name instanceof String && !name.isEmpty()) {
            this.name = name;
        }
        if (weight > 0.2) {
            this.weight = weight;
        }
        if (price > 0) {
            this.price = price;
        }
    }
    /**
     * Добавление данных в поле Найменования
     */
    public void setName(String name)
    {
        // Проверить на наличие только алфавита
        if (name instanceof String && !name.isEmpty()) {
            this.name = name;
        }
    }
    /**
     * Получение значения поля Найменования
     */
    public String getName()
    {
        return name;
    }
    /**
     * Получение значения поля Веса
     */
    public double getWeight()
    {
        return weight;
    }
    /**
     * Добавление данных в поле Веса
     */
    public void setWeight(double weight)
    {
        if (weight > 0.2) {
            this.weight = weight;
        }
    }
    /**
     * Получение значения поля Цены
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * Добавление данных в поле Цены
     */
    public void setPrice(double price)
    {
        if (price > 0) {
            this.price = price;
        }
    }
    /**
     * Методы для "детей"
     */
    public abstract int getTransparency();
    public abstract void setTransparency(int transparency);
    public abstract String getFacet();
    public abstract void setFacet(String facet);
    public abstract char getColor();
    public abstract void setColor(char color);

    public abstract boolean getIsSynthetic();
    public abstract void setIsSynthetic(boolean isSynthetic);
    public abstract double getSize();
    public abstract void setSize(double size);
    public abstract int getHardness();
    public abstract void setHardness(int hardness);
}
