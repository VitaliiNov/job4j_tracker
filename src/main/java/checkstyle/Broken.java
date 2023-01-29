package checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    String name;
    private int sizeOfEmpty = 10;
    private String surname;

    void echo() { }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    public Broken() {
    }
}
