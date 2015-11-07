import java.util.Vector;
import java.util.List;
/**
 * Сортировка, объекта коллекции
 *
 * @autor Дошаков Абай
*/
public class Sorting implements Criteria, Order
{
    /**
     * Конструктор по умолчанию
     */
    public void sort (Necklace necklace)
    {
        sort(necklace, Criteria.VALUES[2], Order.VALUES[0]);
    }
    /**
     * Конструктор, с полем, для сортировки
     */
    public void sort (Necklace necklace, String criteria)
    {
        sort(necklace, criteria, Order.VALUES[0]);
    }
    /**
     * Конструктор, с полем для сортировки и вариантом сортировки
     */
    public void sort (Necklace necklace, String criteria, String onIncrease)
    {
        int i, j;
        Mineral mineral;
        List<Mineral> stones = necklace.getList();
        boolean conditionIsTrue = false;
        for (i = 0; i < stones.size() - 1; i ++) {
            for (j = i + 1; j < stones.size(); j ++) {
                if (criteria.compareTo(Criteria.VALUES[0]) == 0) {
                    if (onIncrease.compareTo(Order.VALUES[0]) == 0 && stones.get(i).getName().compareTo(stones.get(j).getName()) == 1) {

System.out.println("i: " + stones.get(i).getName() + " j: " + stones.get(j).getName());

                        conditionIsTrue = true;
                    // } else if (onIncrease.compareTo(Order.VALUES[1]) == 0 && stones.get(i).getName().compareTo(stones.get(j).getName()) == -1) {
                    //     conditionIsTrue = true;
                    }
                } else if (criteria.compareTo(Criteria.VALUES[1]) == 0) {
                    if (onIncrease.compareTo(Order.VALUES[0]) == 0 && stones.get(i).getWeight() > stones.get(j).getWeight()) {
                        conditionIsTrue = true;
                    } else if (onIncrease.compareTo(Order.VALUES[1]) == 0 && stones.get(i).getWeight() < stones.get(j).getWeight()) {
                        conditionIsTrue = true;
                    }
                } else if (criteria.compareTo(Criteria.VALUES[2]) == 0) {
                    if (onIncrease.compareTo(Order.VALUES[0]) == 0 && stones.get(i).getPrice() > stones.get(j).getPrice()) {
                        conditionIsTrue = true;
                    } else if (onIncrease.compareTo(Order.VALUES[1]) == 0 && stones.get(i).getPrice() < stones.get(j).getPrice()) {
                        conditionIsTrue = true;
                    }
                }
                if (conditionIsTrue == true) {
                    mineral = stones.get(i);
                    stones.set(i, stones.get(j));
                    stones.set(j, mineral);
                }
                conditionIsTrue = false;
            }
        }
    }
}