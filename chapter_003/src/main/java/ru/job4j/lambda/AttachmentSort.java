package ru.job4j.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = new ArrayList<>(List.of(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        ));
        Comparator<Attachment> comparatorSize = new Comparator<>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return left.getSize() - right.getSize();
            }
        };

        Comparator<Attachment> comparatorName = new Comparator<>() {
            @Override
            public int compare(Attachment obj1, Attachment obj2) {
                return obj1.getName().compareTo(obj2.getName());
            }
        };
        Comparator<Attachment> comparatorConsume = comparatorSize.thenComparing(comparatorName);
        attachments.sort(comparatorConsume);
        System.out.println(attachments);
    }
}
