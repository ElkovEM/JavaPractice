package pr3.Shells;

public class Shells {
    public static void main(String[] args){
        Double typeDouble = Double.valueOf(10);
        System.out.println(typeDouble);
        String string = "10";
        typeDouble = Double.parseDouble(string);
        typeDouble.parseDouble(string);
        System.out.println(typeDouble);

        int typeInteger = typeDouble.intValue();
        long typeLong = typeDouble.longValue();
        byte typeByte = typeDouble.byteValue();
        float typeFloat = typeDouble.floatValue();
        short typeShort = typeDouble.shortValue();

        System.out.println(typeDouble);
        String d = Double.toString(3.14);
        System.out.println(d);

    }
}
