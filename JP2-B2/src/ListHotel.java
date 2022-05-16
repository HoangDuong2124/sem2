import java.util.ArrayList;
import java.util.List;

public class ListHotel {
    public static void main(String[] args) {
        List<Hotel> listHotel =new ArrayList<>();
        listHotel.add(new Hotel("Nha Trang Hotel","Khanh Hoa","Resort hotel",5));
        listHotel.add(new Hotel("Da Lat Hotel","Lam Dong","Commercial hotel",4));
        listHotel.add(new Hotel("KonTum Hotel","Kon Tum","Hostel",3));


        listHotel.forEach(listHotels ->{
            System.out.println(listHotels);
        });
        String resort = String.valueOf(listHotel.get(0));
        System.out.println("Resort Hotel in Nha Trang la: "+resort);

        listHotel.set(0,new Hotel("Nha Trang Hotel","Khanh Hoa","Floating hotel",5));
        System.out.println("Update: "+listHotel.get(0));
    }
}
