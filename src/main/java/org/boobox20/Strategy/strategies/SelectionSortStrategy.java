package org.boobox20.Strategy.strategies;

import java.util.List;

public class SelectionSortStrategy implements Sorting<Integer> {

    @Override
    public void sort(List<Integer> items) {

        int temp;
        for(int i = 0; i < items.size(); i++) {
            int k = 0;
            for(int j=1;j < items.size() - i; j++) {
               if(items.get(j) > items.get(k)){
                  k = j;
               }
            }
            temp = items.get(items.size() - i - 1);
            items.set(items.size() - i - 1, items.get(k));
            items.set(k, temp);
        }
    }
}
