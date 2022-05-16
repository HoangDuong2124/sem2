public class Hotel {
    public String hotelName;
    public String hotelAddress;
    public String typeOfHotel;
    public int starRating;

    public Hotel(String hotelName,String hotelAddress,String typeOfHotel,int starRating){
        this.hotelName=hotelName;
        this.hotelAddress=hotelAddress;
        this.typeOfHotel=typeOfHotel;
        this.starRating=starRating;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public String getTypeOfHotel() {
        return typeOfHotel;
    }

    public int getStarRating() {
        return starRating;
    }

    public String toString(){
        return "Hotel Name is: "+hotelName+",Address: "+hotelAddress+",Type of Hotel is: "+typeOfHotel+" and star rating is: "+starRating;
    }

}
