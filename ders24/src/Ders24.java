public class Ders24 {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();


    }
    public  static void sayiBulmaca() {
        int [] sayilar={1,2,5,7,9,0};
        int aranacak =6;
        boolean varmi=false;

        for(int sayi:sayilar){
            varmi=true;
            break;}


        if (varmi){
            System.out.println("sayi mevuttur");
        }else{
            System.out.println("sayi mevut değildir");
        }


    }
    public static void mesajVer(String aranacak){
        System.out.println("kelime"+aranacak);
    }




}
