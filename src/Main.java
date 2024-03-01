import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] frekans = new int[21];// Elemanların frekanslarını saklamak için bir dizi oluşturulur

        for (int eleman : list) { //list dizisinde gezin
            frekans[eleman]++;// Dizideki elemanların frekansları hesaplanır
        }
        System.out.println("Dizi: " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < frekans.length; i++) { //dizinin uzunluğu kadar döndür
            if (frekans[i] > 0) {
                System.out.println(i + " sayısı " + frekans[i] + " kere tekrar edildi.");
            }
        }
    }
}