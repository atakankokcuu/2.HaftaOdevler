public class Main {
    public static void main(String[] args) {
        OgretmenrediManeger ogretmenrediManeger=new OgretmenrediManeger();
        ogretmenrediManeger.hesapla();


        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new BaseKrediManager());
        krediUI.KrediHesapla(new AskerKrediManeger());
    }





}
