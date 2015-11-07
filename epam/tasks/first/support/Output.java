package epam.tasks.first.support;

import epam.tasks.first.mineral.*;
import epam.tasks.first.mineral.values.*;


// import java.util.ArrayList;
import java.util.List;
/**
 * Вывод
 *
 * @autor Дошаков Абай
*/
public class Output
{
    /**
     * Вывод списка
     */
    public void list (List<Mineral> minerals)
    {
        System.out.println("|------------< Minerals >------------|");
        for (Mineral mineral : minerals) {
            System.out.printf("| %s (%s: %.2f, %s: %.2f) |\n", mineral.getName(), "weight", mineral.getWeight(), "price", mineral.getPrice());
        }
        System.out.println("|------------< /Minerals >------------|");
    }
    /**
     * Вывод общей массы ожерелья
     */
    public void totalWeight (double total)
    {
        System.out.println("|------------< Total weight >------------|");
        System.out.printf("| %f |\n", total);
        System.out.println("|------------< /Total weight >------------|");
    }
    /**
     * Вывод общей цены ожерелья
     */
    public void totalPrice (double total)
    {
        System.out.println("|------------< Total price >------------|");
        System.out.printf("| %f |\n", total);
        System.out.println("|------------< /Total price >------------|");
    }
    /**
     * Вывод какого - либо сообщения
     */
    public void message (String message)
    {
        System.out.println("|------------< " + message + ">------------|");
    }
}
