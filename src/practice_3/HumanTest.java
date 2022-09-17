package practice_3;

/*
Создать класс, описывающий тело человека(Human).
Для описания каждой части тела создать отдельные классы(Head, Leg, Hand).
Описать необходимые свойства и методы для каждого класса.
Протестировать работу класса Human.
 */

public class HumanTest {
    public static void main(String[] args) {
        Human Andrew = new Human("Andrew", 35);
        Head Black = new Head("Black", "Green", "no");
        Leg Right = new Leg("Right");
        Leg Left = new Leg("Left");
        Hand RightHand = new Hand("Right", "no");
        Hand LeftHand = new Hand("Left", "no");

        System.out.println(Andrew.getName() + " Age - " + Andrew.getAge());
        System.out.println("Hair has " + Black.getHairColor() +
                " color, eyecolor has " + Black.getEyecolor() +
                " color, " + Black.getHeadgear() + " headgear");
        System.out.println("On his " + RightHand.getSide() + " hand he has " + RightHand.getDecorations() + " decorations");
        System.out.println("On his " + LeftHand.getSide() + " hand he has " + LeftHand.getDecorations() + " decorations");
    }
}

class Human {
    String name;
    int age;
    public Human (String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public void setName (String name) {
        this.name = name;
    }
}

class Head {
    String haircolor;
    String eyecolor;
    String headgear;
    public Head(String haircolor,String eyecolor, String headgear){
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.headgear = headgear;
    }
    public String getHairColor() {
        return haircolor;
    }
    public String getEyecolor() {
        return eyecolor;
    }
    public String getHeadgear() {
        return headgear;
    }
    public void setHairColor(String haircolor) {
        this.haircolor = haircolor;
    }
    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }
    public void setHeadgear(String headgear) { this.headgear = headgear; }
}

class Leg {
    String side;
    public Leg (String side){
        this.side = side;
    }
    public void setName(String name) {
        this.side = name;
    }
    public String getName() {
        return side;
    }
}

class Hand {
    String side;
    String decorations;
    public Hand(String side, String decorations){
        this.side = side;
        this.decorations = decorations;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public String getSide() {
        return side;
    }
    public String getDecorations() {
        return decorations;
    }
    public void setDecorations(String decorations) {
        this.decorations = decorations;
    }
}