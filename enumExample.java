enum Suits {heart, club, spade, diamond}

public class enumExample {
    public static void main(String[] args) {
        System.out.println(Suits.heart);
        System.out.println(Suits.valueOf("heart"));
    }
}
