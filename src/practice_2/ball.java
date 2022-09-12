package practice_2;

public class ball {
    public static void main(String[] args) {
        practice_2.ObjectBall NikeMerlin = new practice_2.ObjectBall("White","Professional","Nike");
        System.out.println("Nike Merlin");
        System.out.println("Color: "+ NikeMerlin.getColor() + "\nPurpose: "+NikeMerlin.getPurpose()+ "\nFirm: "+ NikeMerlin.getFirm());
    }
}

class ObjectBall {
    private String color;
    private String purpose;
    private String firm;

    public ObjectBall (String color, String purpose, String firm) {
        this.color = color;
        this.purpose = purpose;
        this.firm = firm;
    }

    public ObjectBall (String color, String purpose) {
        this.color = color;
        this.purpose = purpose;
        this.firm = "unknown";
    }

    public String getColor(){
        return color;
    }

    public String getFirm(){
        return firm;
    }

    public String getPurpose() {
        return purpose;
    }
}