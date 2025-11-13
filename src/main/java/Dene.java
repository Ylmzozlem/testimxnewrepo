public class Dene {
    public static void main(String[] x) {
        // sum metodundan dönen değeri yazdırıyoruz
        int sonuc = Dene.sum(3, 5);
        System.out.println("Toplam: " + sonuc);

        // Veya direkt olarak metodu println içinde çağırabiliriz:
        // System.out.println("Toplam: " + Dene.sum(3, 5));
    }

    public static int sum(int a,int b){
        return a + b;
    }
}