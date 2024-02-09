package tr.workintech.courses.s13d2;

public class App {

    public static void main(String[] args) {

        App app = new App();

        int result = app.add(2,3);

        app.print(result);
    }

    int add(int x, int y) {

        return x + y;
    }

    void print(Object o) {

        //TODO Complete this

        System.out.println(o);
    }
}
