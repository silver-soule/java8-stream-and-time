package edu.knoldus;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Neelaksh on 19/8/17.
 */
public class IntermediateOperationsDemoTest {
    private List<String> demoList = Arrays.asList("guild wars2", "potato", "chips", "chillies", "chips", "potato", "train");
    private List<List<String>> nestedDemoList = Arrays.asList(Collections.singletonList(demoList.get(0)), Collections.singletonList(demoList.get(1)));
    private IntermediateOperationsDemo<String> intermediateOperationsDemo = new IntermediateOperationsDemo<>(demoList);

    @Test
    public void limitSkipCaller() throws Exception {
        assertEquals(IntermediateOperationsDemo.limitSkipCaller(Stream.generate(Math::random), 10, 2).size(), 2);
    }

    @Test
    public void mapToUpperCaseCaller() throws Exception {
        assertEquals(IntermediateOperationsDemo.mapToUpperCaseCaller(demoList.stream()).get(0), demoList.get(0).toUpperCase());
    }

    @Test
    public void flatMapToUpperCaseCaller() throws Exception {
        assertEquals(IntermediateOperationsDemo.flatMapToUpperCaseCaller(nestedDemoList).get(0), demoList.get(0).toUpperCase());
    }

    @Test
    public void filterCaller() throws Exception {
        assertEquals(intermediateOperationsDemo.filterCaller(demoList.get(2)).size(), 2);
    }

    @Test
    public void distinctCaller() throws Exception {
        assertEquals(intermediateOperationsDemo.distinctCaller().size(), new HashSet<>(demoList).size());
    }

    @Test
    public void sortedCaller() throws Exception {
        assertEquals(intermediateOperationsDemo.sortedCaller().get(0), demoList.get(3));
    }

}
