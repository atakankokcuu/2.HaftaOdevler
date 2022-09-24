package oopintro;

public class main {
    public static void main(String[] args) {


        Product prducts1 = new Product(15, "hp", 22000, "16 gb ram");



        Product prducts2 = new Product();
        prducts2.id = 12;
        prducts2.name = "monsteer";
        prducts2.unitPrice=15000;
        prducts2.detail="16 gb ram";


        Product prducts3 = new Product();
        prducts3.id = 12;
        prducts3.name = "monsteer";
        prducts3.unitPrice=15000;
        prducts3.detail="16 gb ram";




        Product[] pro = {prducts1,prducts2,prducts3};

            System.out.println(pro.length);
        for (Product pr:pro
             ) {
            System.out.println(pr.name + pr.detail);

        }

        category cat=new category();
        cat.id=33;
        cat.name="bilgidsysr";



        }


    }


