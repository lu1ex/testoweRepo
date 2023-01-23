import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(metodaA("tt","aa"));
        System.out.println(metodaB("tt","aa"));
    }

    public static String metodaA(String kod, String... params) {
        StringBuilder kodyKosztow = new StringBuilder();
        for (String param : params) {
            kodyKosztow.append(param).append(",");
        }
        kodyKosztow.append(kod);
        return kodyKosztow.toString();
    }

    public static String metodaB(String kod, String... params) {
        StringBuilder kodyKosztow = new StringBuilder();
        Arrays.stream(params).forEach((param) -> {
            kodyKosztow.append(param).append(",");
        });
        kodyKosztow.append(kod);
        return kodyKosztow.toString();
    }
}
