package org.boobox20.Strategy;

import org.boobox20.Strategy.strategies.Sorting;

import java.util.List;

public class SortNumbers {

    private Sorting<Integer> sortAlgorithm;
    private final List<Integer> items;


    public SortNumbers(Sorting<Integer> sortAlgorithm, List<Integer> items) {
        this.sortAlgorithm = sortAlgorithm;
        this.items = items;
    }

    public void addItem(Integer item){
       this.items.add(item);
    }

    public void sort(){
        this.sortAlgorithm.sort(items);
    }

    public void setSortAlgorithm(Sorting<Integer> sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }

    public List<Integer> getItems(){
        return this.items;
    }
}
