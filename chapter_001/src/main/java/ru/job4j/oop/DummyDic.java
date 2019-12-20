package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String tword = "Неизвестное слово: " + eng;
        System.out.println(tword);
        return tword;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        dummyDic.engToRus("java");
    }
}
