package org.boobox20.Strategy.strategies;

import java.util.List;

public class BubbleSortStrategy implements Sorting<Integer> {

    @Override
    public void sort(List<Integer> items) {
        int temp;
        for(int i = 0; i < items.size() - 1; i++) {
            int k = 0;
            for(int j = 1; j < items.size() - i; j++,k++) {
                if(items.get(j) < items.get(k)) {
                    temp = items.get(j);
                    items.set(j, items.get(k));
                    items.set(k, temp);
                }
            }
        }
    }
}
