package com.epam.mjc;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    public List<String> toUpperCaseCollection(List<String> list) {
        return list.stream().map(String::toUpperCase).
                collect(Collectors.toList());
    }

    public Optional<Integer> findMax(List<Integer> list) {
        return Optional.of(list.stream().
                mapToInt(x -> x).
                max().getAsInt());
    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return Optional.of(list.stream().
                flatMap(Collection::stream).
                mapToInt(x -> x).
                min().getAsInt());
    }

    public Integer sum(List<Integer> list) {
        return list.stream().
                mapToInt(x -> x).
                reduce(Integer::sum).
                getAsInt();
    }
}
