package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (this.tasks.size() == 0) {
                break;
            } else if (task.getPriority() >= element.getPriority()) {
                index = this.tasks.size();
                continue;
            }
            index = this.tasks.size() - 1;
            break;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }

    @Override
    public String toString() {
        return "PriorityQueue{"
                + "tasks=" + tasks.element()
                + '}';
    }
}