package Seminar1.poker;

public class Hand {
    public String[] s;
    public String[] c;

    Deck.CardNumbers[] cardNumbers = Deck.CardNumbers.values();
    public Hand(String [][] x) {
       // this.s = new String[5];
        //this.c = new String[5];
        this.s = x[0];
        this.c = x[1];
    }
    public void evaluate() {
        int countOfPositions = 0;
        boolean isHighCard = false;
        System.out.print("High Cards: ");
        for (int i = 0; i < c.length; i++) {
            if (c[i].equals("TEN")) {
                isHighCard = true;
                System.out.printf("TEN of %s, ", s[i]);
            } else if (c[i].equals("JACK")) {
                isHighCard = true;
                System.out.printf("JACK of %s, ", s[i]);
            } else if (c[i].equals("QUEEN")) {
                isHighCard = true;
                System.out.printf("QUEEN of %s, ", s[i]);
            } else if (c[i].equals("KING")) {
                isHighCard = true;
                System.out.printf("KING of %s, ", s[i]);
            } else if (c[i].equals("ACE")) {
                isHighCard = true;
                System.out.printf("ACE of %s, ", s[i]);
            }

        }
        if (isHighCard == false)
        {
            System.out.printf("None");
        }
        System.out.println();
        System.out.print("Pair: ");
        for (int i = 0; i < cardNumbers.length; i++) {
            countOfPositions=0;
            for (int j = 0; j < c.length; j++) {

                if (cardNumbers[i].toString().equals(c[j])){
                    //System.out.println(cardNumbers[i]);

                    countOfPositions +=  1 ;
                }
                if (countOfPositions >= 2) {
                    System.out.printf(cardNumbers[i] + " ");
                    break;
                }
            }
        }

    }
}




