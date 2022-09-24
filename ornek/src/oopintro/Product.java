package oopintro;

public class Product {
    String name;
    int id;
    double unitPrice;
    String detail;
    public Product() {
        System.out.println("hoşgeldin");
    }
public Product(int id,String name,double unitPrice,String detail){

    this.id=id;
    this.name=name;
    this.unitPrice=unitPrice;
    this.detail=detail;
}


}
