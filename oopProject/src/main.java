public class main {
    public static void main(String[] args) {

        Product products1=new Product(5,"monter",1500,"blue");//referans oluşturma, intance



        Product products2=new Product();//referans oluşturma, intance
        products2.colour="yellow";
        products2.id=3;
        products2.name="lenovo";
        products2.unitPrice=1000;


        Product products3=new Product();//referans oluşturma, intance
        products3.colour="white";
        products3.id=4;
        products3.name="samsung";
        products3.unitPrice=2300;


        Product products4=new Product();//referans oluşturma, intance
        products4.colour="green";
        products4.id=5;
        products4.name="asus";
        products4.unitPrice=5000;

Product[] product ={products1,products2,products3,products4};
for (Product prody:product){
System.out.println(prody.id);


    }
category category1=new category();
category1.id=1;
category1.name="bilgisayar";

category category2=new category();
category2.id=2;
category2.name="bahçe";
}
}
