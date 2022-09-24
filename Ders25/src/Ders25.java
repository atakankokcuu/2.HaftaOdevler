public class Ders25  {
    public static void main(String[] args) {
        int a=sayilaar(5,3,88,676,66);
        System.out.println(a);
    }

    public static int sayilaar(int... sayılar){
        int toplam=0;
        for (int sayi:sayılar){
            toplam=sayi+toplam;
        }
        return toplam;
    }
}

