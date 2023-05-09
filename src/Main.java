import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> list = new ArrayList<>();

    static {

        list.add("Привет,");
        list.add("Валера");
    }


    public static void main(String[] args) {

        for (String a:
                list) {
            System.out.println(a);
        }
    }
}