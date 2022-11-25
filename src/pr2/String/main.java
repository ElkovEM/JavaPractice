package pr2.String;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5"};
        Task8(array);

    }
    public static void Task8(String[] array) {
        List<Object> list = Arrays.asList(array);
        Collections.reverse(list);
        System.out.println(list);
    }
}
