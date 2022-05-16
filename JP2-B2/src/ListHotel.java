import java.util.ArrayList;
import java.util.List;

public class ListHotel {
    public static void main(String[] args) {
        List<Hotel> listHotel =new ArrayList<>();
        listHotel.add(new Hotel("Nha Trang Hotel","Nha Trang","Resort hotel",5));
        listHotel.add(new Hotel("Da Lat Hotel","Lam Dong","Commercial hotel",4));
        listHotel.add(new Hotel("KonTum Hotel","Kon Tum","Hostel",3));

        listHotel.forEach(listHotels ->{
            System.out.println(listHotels);
        });
    }
}
