package epam.tasks.first.mineral;

import epam.tasks.first.mineral.*;
/**
 * Класс диапазона возможных значений
 */
public interface PreciousStones {
    Mineral[] VALUES = {
        new Diamond(),
        new Sapphire(),
        new Emerald(),
        new Ruby(),
        new NaturalSeaPearls()
    };
}