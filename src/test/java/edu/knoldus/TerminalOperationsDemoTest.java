package edu.knoldus;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

/**
 * Created by Neelaksh on 19/8/17.
 */
public class TerminalOperationsDemoTest {
    private Integer invalidValue = -1;
    private List<Integer> list = Arrays.asList(7, 1, 2, 3, 4, 9, 5, 6);
    private Integer match = 5;
    private TerminalOperationsDemo<Integer> terminalOperationsDemo = new TerminalOperationsDemo<>(list);

    @Test
    public void allMatchCallerTest() throws Exception {
        assertFalse(terminalOperationsDemo.allMatchCaller(match));
    }

    @Test
    public void anyMatchCallerTest() throws Exception {
        assertTrue(terminalOperationsDemo.anyMatchCaller(5));
    }

    @Test
    public void noneMatchCallerTest() throws Exception {
        assertTrue(terminalOperationsDemo.noneMatchCaller(11));
    }

    @Test
    public void collectCallerTest() throws Exception {
        assertEquals(terminalOperationsDemo.collectCaller(), list.size());
    }

    @Test
    public void findAnyCallerTest() throws Exception {
        assertTrue(terminalOperationsDemo.findAnyCaller().isPresent());
    }

    @Test
    public void findFirstCallerTest() throws Exception {
        assertEquals(terminalOperationsDemo.findFirstCaller().orElse(invalidValue), list.get(0));
    }

    @Test
    public void minCallerTest() throws Exception {
        assertEquals(terminalOperationsDemo.minCaller(-1), new Integer(1));
    }

    @Test
    public void maxCallerTest() throws Exception {
        assertEquals(terminalOperationsDemo.maxCaller(12), new Integer(9));
    }

    @Test
    public void reduceCallerTest() throws Exception {
        assertEquals(terminalOperationsDemo.reduceCaller(), "71234956");
    }
}
