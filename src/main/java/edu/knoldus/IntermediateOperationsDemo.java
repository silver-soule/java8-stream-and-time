package edu.knoldus;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Neelaksh on 19/8/17.
 */
public class IntermediateOperationsDemo<T extends Comparable<T>> {

    private List<T> list;

    IntermediateOperationsDemo(List<T> list) {
        this.list = list;
    }

    private Stream<T> streamGenerator() {
        return this.list.stream();
    }

    public static List<Double> limitSkipCaller(Stream<Double> stream, int skipBy, int limitTo) {
        return stream.skip(skipBy).limit(limitTo).collect(Collectors.toList());
    }

    public static List<String> mapToUpperCaseCaller(Stream<String> stream) {
        return stream.map(String::toUpperCase).collect(Collectors.toList());
    }

    public static List<String> flatMapToUpperCaseCaller(List<List<String>> nestedList) {
        return nestedList.stream().flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());
    }

    public List<T> filterCaller(T mustMatch) {
        return streamGenerator().filter(inpVal -> inpVal.equals(mustMatch)).collect(Collectors.toList());
    }

    public List<T> distinctCaller() {
        return streamGenerator().distinct().collect(Collectors.toList());
    }

    public List<T> sortedCaller() {
        return streamGenerator().sorted(T::compareTo).collect(Collectors.toList());
    }

}
