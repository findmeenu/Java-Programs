package Seminar1.poker;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("--- Poker Hand Evaluation ---");
        System.out.print("Your Hand: " + "\n"+ "\n");

        String [][] x = deck.draw();
        Hand hand = new Hand(x);



        System.out.println();
        System.out.println("Evaluation Result:");
        hand.evaluate();
        }
}
