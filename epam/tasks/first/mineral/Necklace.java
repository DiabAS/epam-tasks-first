package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;

import java.util.Vector;
import java.util.List;
/**
 * Ожерелья, объект массив
 *
 * @autor Дошаков Абай
*/
public class Necklace
{
    private List<Mineral> stones;

    public Necklace()
    {
        stones = new Vector<>();
    }
    /**
     * Добавление элемента с список
     */
    public List<Mineral> insert (Mineral stone)
    {
        stones.add(stone);
        return stones;
    }
    /**
     * Удаление элемента
     */
    public List<Mineral> delete (int index)
    {
        stones.remove(index);
        return stones;
    }
    /**
     * Получение элемента по номеру
     */
    public Mineral getElement (int index)
    {
        return stones.get(index);
    }
    /**
     * Получение всего массива
     */
    public List<Mineral> getList ()
    {
        return stones;
    }
}
