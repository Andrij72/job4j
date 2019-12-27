package ru.job4j.pojo;

public class Student {
    private String fullName;
    private String groupName;
    private Long receiptDate;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Long receiptDate) {
        this.receiptDate = receiptDate;
    }

    @Override
    public String toString() {
        return "Student["
                + "fullName='" + fullName + "\n"
                + "groupName= " + groupName + '\n'
                + "receiptDate= " + receiptDate + "\n"
                + ']';
    }
}
