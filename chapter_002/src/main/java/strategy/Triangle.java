package strategy;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return new StringBuilder()
                .append("    +    " + System.lineSeparator())
                .append("  +   +  " + System.lineSeparator())
                .append(" +     + " + System.lineSeparator())
                .append("+  +  +  +")
                .toString();
    }
}
