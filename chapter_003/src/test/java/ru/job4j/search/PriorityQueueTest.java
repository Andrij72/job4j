package ru.job4j.search;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("lowest", 6));
        queue.put(new Task("urgent_middle", 2));
        StringBuilder printQ = new StringBuilder();
        Task result = queue.take();
        printQ.append(result).append(" ");
        result = queue.take();
        printQ.append(result).append(" ");
        result = queue.take();
        printQ.append(result).append(" ");
        result = queue.take();
        printQ.append(result).append(" ");
        result = queue.take();
        printQ.append(result).append(" ");
        System.out.println(printQ.toString());
        assertThat(result.getDesc(), is("lowest"));
    }
}
