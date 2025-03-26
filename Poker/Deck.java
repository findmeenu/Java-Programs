package Seminar1.poker;

import java.util.Random;

public class Deck {
    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS
    }

    public enum CardNumbers {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    //Create an array of suits & card numbers of enums.
    Suit[] suitArray = Suit.values();
    CardNumbers[] cardNumbersArray = CardNumbers.values();
    Random random = new Random();
    public String[][] s; //Two dimensional Array to hold 5 random cards.
    //public String[] c;

    public String[] d; //

    public Deck() {
        this.s = new String [5][5];
     //   this.c = new String[5];
        this.d = new String[5];

    }

    public String [][] draw() {
        for (int i = 0; i < 5; i++) {
            Suit suit_random = suitArray[random.nextInt(4)];
            s[0][i] = suit_random.toString();
            Deck.CardNumbers card_random = cardNumbersArray[random.nextInt(13)];
            s[1][i] = card_random.toString();

            String drawValue = new String(s[1][i] + " of " + s[0][i]);
            boolean isExisting = false;

            for (int j=0; j<d.length;j++)
            {
                if (d[j] != null) {
                    if (d[j].equals(drawValue)) {
                        isExisting = true;
                        break;
                    }
                }
            }
            if (isExisting)
            {
                i--;
            }
            else
            {
                d[i]=drawValue;
                System.out.print(drawValue + "\n");
            }

        }
        return s;
    }

}