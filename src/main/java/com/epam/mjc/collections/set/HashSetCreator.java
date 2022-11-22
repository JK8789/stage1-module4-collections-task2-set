package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new LinkedHashSet<>();
        for (Integer element : sourceList) {
            if (element % 2 == 0) {
                while (element % 2 == 0) {
                    set.add(element);
                    element /= 2;
                }
                set.add(element);
            } else {
                set.add(element);
                set.add(element * 2);
            }
        }
        return set;
    }
}
