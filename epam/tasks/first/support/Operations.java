package epam.tasks.first.support;

import epam.tasks.first.mineral.*;
import epam.tasks.first.mineral.values.*;

// import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Действия, выполняемые со списком камней в ожерелье
 */
public class Operations implements Color, Facet, Transparency, PreciousStones, SemipreciousStones
{
    /**
     * Получение массива с суммами веса и цены
     */
    public void find (Necklace necklace)
    {
        find(necklace, 0, getMaximum(necklace.getList(), Criteria.VALUES[2]), Criteria.VALUES[2]);
    }
    /**
     * Получение массива с суммами веса и цены
     */
    public void find (Necklace necklace, int min)
    {
        find(necklace, min, getMaximum(necklace.getList(), Criteria.VALUES[2]), Criteria.VALUES[2]);
    }
    /**
     * Получение массива с суммами веса и цены
     */
    public void find (Necklace necklace, int min, int max)
    {
        find(necklace, min, max, Criteria.VALUES[2]);
    }
    /**
     * Поиск со всеми параметрами
     */
    public void find (Necklace necklace, int min, int max, String criteria)
    {
        int i;
        List<Mineral> stones = necklace.getList();
        for (i = 0; i < stones.size(); i ++) {
            if (criteria.compareTo(Criteria.VALUES[0]) == 0) {
                if (stones.get(i).getTransparency() < (double) min || stones.get(i).getTransparency() > (double)max) {
                    stones.remove(i);
                }
            } else if (criteria.compareTo(Criteria.VALUES[1]) == 0) {
                if (stones.get(i).getWeight() < (double)min || stones.get(i).getWeight() > (double)max) {
                    stones.remove(i);
                }
            } else if (criteria.compareTo(Criteria.VALUES[2]) == 0) {
                if (stones.get(i).getPrice() < (double) min || stones.get(i).getPrice() > (double) max) {
                    stones.remove(i);
                }
            }
        }
    }
    /**
     * Получение максимального значения по заданному полю
     */
    private int getMaximum(List<Mineral> stones, String criteria)
    {
        double maximum = 0.0;
        double temp = 0.0;
        for (Mineral stone : stones) {
            if (criteria.compareTo(Criteria.VALUES[0]) == 0) {
                temp = stone.getTransparency();
            } else if (criteria.compareTo(Criteria.VALUES[1]) == 0) {
                temp = stone.getWeight();
            } else if (criteria.compareTo(Criteria.VALUES[2]) == 0) {
                temp = stone.getPrice();
            }
            if (temp > maximum) {
                maximum = temp;
            }
        }
        return (int)maximum;
    }
    /**
     * Получение массива с суммами веса и цены
     */
    public double[] getTotals (Necklace necklace)
    {
        double[] totals = {0.0, 0.0};
        double currentPrice = 0.0;
        List<Mineral> stones = necklace.getList();
        for (int i = 0; i < stones.size(); i ++) {
            if (stones.get(i) instanceof Mineral) {
                currentPrice = stones.get(i).getPrice() * stones.get(i).getWeight();
                totals[0] += stones.get(i).getWeight();
                totals[1] += currentPrice;
            }
        }
        return totals;
    }
    /**
     * Генерация ожерелья
     */
    public void gatherNecklace (Necklace necklace, int quantity)
    {
        int stoneIndex;
        Random randomizer = new Random();
        Mineral mineral;

        for (int i = 0; i < quantity; i ++) {
            // if (randomizer.nextInt(2) == 0) {
                stoneIndex = randomizer.nextInt(PreciousStones.VALUES.length);
                mineral = PreciousStones.VALUES[stoneIndex];

                mineral.setTransparency(randomizer.nextInt(Transparency.VALUES.length));
                mineral.setFacet(Facet.VALUES[randomizer.nextInt(Facet.VALUES.length)]);
                mineral.setColor(Color.VALUES[randomizer.nextInt(Color.VALUES.length)]);
            // } else {
            //     stoneIndex = randomizer.nextInt(SemipreciousStones.VALUES.length);
            //     mineral = SemipreciousStones.VALUES[stoneIndex];

            //     mineral.setIsSynthetic(randomizer.nextBoolean());
            //     mineral.setSize(randomizer.nextDouble());
            //     mineral.setHardness(randomizer.nextInt(10));
            // }
            mineral.setWeight((double)randomizer.nextInt(100));
            mineral.setPrice((double)randomizer.nextInt(100));

            necklace.insert(mineral);
            mineral = null;
       }
    }
}
