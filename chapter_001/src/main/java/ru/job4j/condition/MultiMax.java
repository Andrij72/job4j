package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        int max = first > second ? first : (first != second ? second : result);
        result = max > third ? max : (max != third ? third : first);
        return result;
    }
}
