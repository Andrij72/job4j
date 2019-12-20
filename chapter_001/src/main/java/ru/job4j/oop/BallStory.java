package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Ball ball = new Ball();
        ball.song(hare);
        hare.tryEat(ball);
        ball.escapeFrom(hare);
        ball.song(wolf);
        wolf.tryEat(ball);
        ball.escapeFrom(wolf);
        ball.song(fox);
        fox.tryEat(ball);
        fox.swallow(ball);
    }
}
