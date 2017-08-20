package edu.knoldus.primitivestreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Neelaksh on 20/8/17.
 */
public class GeometricProgression {

    private int seed;
    private int increment;

    public GeometricProgression(int seed, int increment) {
        this.seed = seed;
        this.increment = increment;
    }

    public int sum(int max) {
        return IntStream.iterate(seed, prev -> prev * this.increment).limit(max).sum();
    }

    public List<Integer> generateGPSeries(int max) {
        return IntStream.iterate(seed, prev -> prev * this.increment).limit(max).mapToObj(Integer::new).collect(Collectors.toList());
    }
}
