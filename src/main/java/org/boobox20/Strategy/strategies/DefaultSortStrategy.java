package org.boobox20.Strategy.strategies;

import java.util.Collections;
import java.util.List;

public class DefaultSortStrategy implements Sorting<Integer> {

    @Override
    public void sort(List<Integer> items) {
       Collections.sort(items);
    }
}
