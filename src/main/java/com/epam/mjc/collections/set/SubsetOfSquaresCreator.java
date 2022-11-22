package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer element : sourceList) {
            element *= element;
            set.add(element);
        }
        return set.subSet(lowerBound, true, upperBound, true);
    }
}
