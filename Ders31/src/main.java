public class main {
    public static void main(String[] args) {
        Product product1=new Product();
        product1.set_id(33);
        product1.get_name()="vestel";
        product1.get_description()="vestel telefon";
        product1.get_price()=4000;
        product1.getId();


        ProductManeger productManeger=new ProductManeger();
        productManeger.Add(product1);
    }
}
