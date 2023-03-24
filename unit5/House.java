package unit5;
public class House {
    /** 
     * This program makes my own class house, which has all the things that a house
     * would have, such as an adress bedrooms bathrooms rooms, sqFT, rooms, and it calculates how much large furniture you can have per room and
     * sqFT per room, and the heatingcosts per month based on the figure $0.3588192 dollars per square feet per month.
     */
    private String address;
    private int bedrooms;
    private int bathrooms;
    private double sqFT;
    private int rooms;
    private double sqFTPERROOM;

    public House(String address){
        this.address=address;
    }
    public House(String adress, int bedrooms, int bathrooms, double sqFT){
        address=adress;
        this.bedrooms=bedrooms;
        this.bathrooms=bathrooms;
        this.sqFT=sqFT;
        rooms=bedrooms+bathrooms+1;
    }
    public double sqFTRoom(){
        sqFTPERROOM = sqFT/((double)rooms);
        return sqFTPERROOM;
    }  
    public int furniturePerRoom(double sqFTPERROOM){
        return ((int)sqFTPERROOM)/250;
    }
    public double heatingcostPerMonth(){
        return sqFT*0.3588192;
        //This number is determined from a calculator of on how much heating costs per squarefoot per month.
    }
    
    public String toString(){
        return "" + bedrooms + " bedrooms, " + bathrooms + "bathrooms, " + sqFT +"sqft, " + address;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return int return the bedrooms
     */
    public int getBedrooms() {
        return bedrooms;
    }

    /**
     * @param bedrooms the bedrooms to set
     */
    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    /**
     * @return int return the bathrooms
     */
    public int getBathrooms() {
        return bathrooms;
    }

    /**
     * @param bathrooms the bathrooms to set
     */
    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    /**
     * @return double return the sqFT
     */
    public double getSqFT() {
        return sqFT;
    }

    /**
     * @param sqFT the sqFT to set
     */
    public void setSqFT(double sqFT) {
        this.sqFT = sqFT;
    }

    /**
     * @return int return the rooms
     */
    public int getRooms() {
        return rooms;
    }

    /**
     * @return double return the sqFTPERROOM
     */
    public double getSqFTPERROOM() {
        return sqFTPERROOM;
    }
}
