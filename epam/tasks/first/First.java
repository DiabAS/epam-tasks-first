package epam.tasks.first;

import epam.tasks.first.mineral.*;
import epam.tasks.first.mineral.values.*;
import epam.tasks.first.support.*;

public class First
{
    public static void main(String[] args)
    {
        double[] totals;
        Necklace necklace = new Necklace();
        Output output = new Output();

        Operations operations = new Operations();
        operations.gatherNecklace(necklace, 10);
        output.list(necklace.getList());

        operations.find(necklace, 10, 50);
        output.list(necklace.getList());

        // Sorting sorting = new Sorting();
        // sorting.sort(necklace,"byWeight");
        // output.list(necklace.getList());

        // totals = operations.getTotals(necklace);
        // output.totalWeight(totals[0]);
        // output.totalPrice(totals[1]);

    }
}
