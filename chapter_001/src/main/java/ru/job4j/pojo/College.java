package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Bill Gates Mihalich");
        student.setGroupName("javagroup № 3");
        student.setReceiptDate(2209201L);
        System.out.println("Student: [" + student.getFullName() + "||" + student.getGroupName() + "||" + student.getReceiptDate() + "]");
    }
}
