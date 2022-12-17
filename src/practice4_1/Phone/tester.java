package practice4_1.Phone;

public class tester {
    public static void main(String[] args) {
        int[] numbers = {79047371, 79047372, 79047373, 79047375, 79047376};
        Phone Xiaomi12T = new Phone(790574304, "Xiaomi 12T 8/256GB Black ", 202);
        Phone SamsungA52 = new Phone(797739104, "Samsung Galaxy A52 8/256 ГБ RU", 189);
        Phone OPPOReno7 = new Phone(790647391, "OPPO Reno 7 4G 8/128 ГБ RU", 175);
        Xiaomi12T.sendMessage("There is a special promotion for you! Follow this link to find out more!", numbers);
        System.out.println(SamsungA52.receiveCall("Egor"));
        System.out.println(OPPOReno7.receiveCall("Egor", 790572245));
    }
}
