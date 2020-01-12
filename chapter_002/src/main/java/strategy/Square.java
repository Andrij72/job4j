package strategy;

public class Square implements Shape {
    @Override
    public String draw() {
        return new StringBuilder()
                .append("+  +  +  +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+        +" + System.lineSeparator())
                .append("+  +  +  +")
                .toString();
    }
}
