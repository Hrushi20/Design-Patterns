package org.boobox20.Strategy;

import org.boobox20.Strategy.strategies.BubbleSortStrategy;
import org.boobox20.Strategy.strategies.DefaultSortStrategy;
import org.boobox20.Strategy.strategies.SelectionSortStrategy;
import org.boobox20.Strategy.strategies.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Integer> items = new ArrayList<>(List.of(5,2,3,4,1));
       Sorting<Integer> sortStrategy = new DefaultSortStrategy();

       // Using Default Sort Strategy
       SortNumbers sortNumbers = new SortNumbers(sortStrategy,items);
       sortNumbers.sort();
       printArray(sortNumbers.getItems(), "DefaultSort");

        // Using Bubble Sort Strategy
        sortStrategy = new BubbleSortStrategy();
        items = new ArrayList<>(List.of(5,4,3,2,1));
        sortNumbers = new SortNumbers(sortStrategy,items);
        sortNumbers.sort();
        printArray(sortNumbers.getItems(), "BubbleSort");

        // Using Selection Sort Strategy
        sortStrategy = new SelectionSortStrategy();
        items = new ArrayList<>(List.of(20,2,5,10,-11));
        sortNumbers = new SortNumbers(sortStrategy,items);
        sortNumbers.sort();
        printArray(sortNumbers.getItems(), "SelectionSort");

        // Easy to Add Another Sorting algorithm by creating a new SortStrategy
        // and binding it to Sort Interface.
    }

    static void printArray(List<Integer> items, String strategy){
        System.out.println("Below result Sorted using " + strategy + " Strategy");
        for(Integer item : items){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
