package unit5;

public class HouseRunner {
    public static void main(String[] args){
        House s5630 = new House("5630 S Balboa Dr", 3, 2, 3600.00);
        System.out.println(s5630.furniturePerRoom(s5630.sqFTRoom()));
        System.out.println(s5630.getAddress());
        System.out.println(s5630.getBathrooms());
        System.out.println(s5630.getBedrooms());
        System.out.println(s5630.getRooms());
        System.out.println(s5630.getSqFT());
        System.out.println(s5630.getSqFTPERROOM());
        System.out.println(s5630.heatingcostPerMonth());
    }
}

