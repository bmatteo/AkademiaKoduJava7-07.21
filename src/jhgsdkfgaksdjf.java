public class jhgsdkfgaksdjf {
    public static void main(String[] args) {

        String name = "Mateusz";

        System.out.println(name);

        String nameWithDot = addDotToString(name);

        System.out.println(nameWithDot);

        a();
    }

    public static String addDotToString(String exampleString2) {
        return exampleString2+".";
    }

    public static void a() {
        System.out.println("START A");
        b();
        System.out.println("END A");
    }

    public static void b() {
        System.out.println("START B");
        c();
        System.out.println("END B");
    }

    public static void c() {
        System.out.println("START C");
        d();
        System.out.println("END C");
    }

    public static void d() {
        System.out.println("D");
    }
}
