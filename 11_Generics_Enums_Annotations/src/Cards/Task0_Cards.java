package Cards;


public class Task0_Cards {

    public static void main(String[] args) {
        String suits = "";
        String ranks ="";
        for (CardSuite result:CardSuite.values()) {
            suits+=result+" ";
        }
        for (CardRank result: CardRank.values()) {
            ranks+=result+" ";
        }
        System.out.println(suits);
        System.out.println(ranks);
    }
}
