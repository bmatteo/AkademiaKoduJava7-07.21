import java.util.Random;

public class usdyfilu {
    public static void main(String[] args) {
        final int tabSize = 10;

        Random r = new Random();
        int looking = r.nextInt(100) + 1;

        System.out.println("Szukana liczba: " + looking);

        //int[][] tab = generateArray(tabSize);

        //int[] searchResult = findValueInArray(tab, looking);

        //System.out.println(searchResult[0] + " - " + searchResult[1]);

        int a = 9;
        System.out.println(a);
        a = changeInteger(a);
        System.out.println(a);
    }

    public static int[][] generateArray(int tabSize) {
        int[][] tab = new int[tabSize][tabSize];

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab.length; j++) {
                addElementToArrayIfDoesntExist(tab, i, j);
            }
            System.out.println();
        }

        return tab;
    }

    public static int[] findValueInArray(int[][] tab, int value) {
        boolean flag = false;

        int[] result = new int[2];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if(tab[i][j] == value) {
                    result[0] = i;
                    result[1] = j;
                    flag = true;
                    break;
                }
            }
        }

        if (!flag) {
            result[0] = -1;
            result[1] = -1;
        }

        return result;
    }

    public static void addElementToArrayIfDoesntExist(int[][] tab, int i, int j) {
        while(true) {
            Random random = new Random();
            int randomNumber = random.nextInt(98) + 1;
            int[] searchResult = findValueInArray(tab, randomNumber);
            if(searchResult[0] == -1) {
                tab[i][j] = randomNumber;
                System.out.print(tab[i][j] + " ");
                break;
            }
        }
    }

    public static int changeInteger(int a) {
        return  5;
    }
}
