package oop1;

public class main {
    public static void main(String[] args) {

        Product prof1 = new Product();
        prof1.name = "dellogini";
        prof1.id = 33;
        prof1.unitPrice = 22000;


        Product prof2 = new Product();
        prof2.name = "vestel";
        prof2.id = 34;
        prof2.unitPrice = 22000;


        Product prof3 = new Product();
        prof3.name = "hp";
        prof3.id = 35;
        prof3.unitPrice = 22000;


        Product prof4 = new Product();
        prof4.name = "dell";
        prof4.id = 36;
        prof4.unitPrice = 22000;

        Product[] produts={prof1,prof2,prof3,prof4};
        for (Product pro:produts){
            System.out.println(pro.id);
        }



    }
}