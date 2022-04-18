public class Product {
    String name;
    float price;
    int qty;
    String id;

    public Product(){
      name = "SGK";
      price = 200000;
      qty = 2;
      id = "M01";
    }
    public Product(String a){
        name = a;
        price = 30000;
        qty = 3;
        id = "M02";
    }
    public Product(String a,String b ){
        name = a;
        price = 40000;
        qty = 4;
        id= b;
    }

    String getName(){
        return name;
    }
    float getPrice(){
        return price;
    }
    int getQty(){
        return  qty;
    }
    String getId(){
        return id;
    }
}
