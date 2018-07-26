public class kagdfsd {
    public static void main(String[] args) {
        System.out.println(potega(2,5));
    }

    public static int potega(int liczba, int potega) {
        if(potega == 0) {
            return 1;
        } else {
            return liczba * potega(liczba, potega - 1);
        }
    }
}
