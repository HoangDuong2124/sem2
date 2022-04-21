public class TestProduct {
    public static void main(String[] args) {
        Product product1 =new Product();
        System.out.println("Ten san pham 1: "+product1.getName());
        System.out.println("Gia SP1 la: "+product1.getPrice());
        System.out.println("So luong SP1 la:  "+product1.getQty());
        System.out.println("Ma SP1 la :"+ product1.getId());

        Product product2 =new Product( "Florentino");

        System.out.println("Ten san pham 2: "+product2.getName());
        System.out.println("Gia SP2 la: "+product2.getPrice());
        System.out.println("So luong SP2 la:  "+product2.getQty());
        System.out.println("Ma SP2 la :"+ product2.getId());

        Product product3 = new Product("Elsu","M03");
        System.out.println("Ten san pham 3: "+product3.getName());
        System.out.println("Gia SP3 la: "+product3.getPrice());
        System.out.println("So luong SP3 la:  "+product3.getQty());
        System.out.println("Ma SP3 la :"+ product3.getId());

       Product product4 = new Product();
       System.out.println(product4.toString());
    }
}
