package pr4.Seasons;

public class Main {
    static public void favoriteOut(Seasons seasons) {
        switch (seasons) {
            case SUMMER:
                System.out.println("I love summer!");
                break;
            case WINTER:
                System.out.println("I love winter!");
                break;
            case SPRING:
                System.out.println("I love spring!");
                break;
            case AUTUMN:
                System.out.println("I love autumn!");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons myfav = Seasons.SPRING;
        Main.favoriteOut(myfav);
        System.out.println();

        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + ": average temperature: " + s.getAvgTemp() + ". " + s.getDescription());
        }
    }
}
