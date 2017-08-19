package edu.knoldus;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Neelaksh on 18/8/17.
 */
public class TerminalOperationsDemo<T extends Comparable<T>> {

    List<T> list;
    T mustMatch;

    TerminalOperationsDemo(List<T> list){
        this.list = list;
    }

    private Stream<T> streamGenerator(){
        return this.list.stream();
    }

    public boolean allMatchCaller(T mustMatch){
        return streamGenerator().allMatch(value -> value.compareTo(mustMatch) == 0);
    }

    public boolean anyMatchCaller(T mustMatch){
        return streamGenerator().anyMatch(value -> value.compareTo(mustMatch) == 0);
    }

    public boolean noneMatchCaller(T mustMatch){
        return streamGenerator().noneMatch(value -> value.compareTo(mustMatch) == 0);
    }

    public long collectCaller(){
        return streamGenerator().collect(Collectors.counting());
    }

    public Optional<T> findAnyCaller(){
        return streamGenerator().findAny();
    }

    public Optional<T> findFirstCaller(){
        return streamGenerator().findFirst();
    }

    public T minCaller(T backUpValue){
        return streamGenerator().min(T::compareTo).orElse(backUpValue);
    }

    public T maxCaller(T backUpValue){
        return streamGenerator().max(T::compareTo).orElse(backUpValue);
    }

    public String reduceCaller(){
        return streamGenerator().map(T::toString).reduce("",String::concat);
    }



}
