package unit6;
public class ParkingLot {
    private final int ROWS = 10;
    private final int COLUMNS = 9;
    private Automobile[][] spots;
    
    public ParkingLot() {
        spots = new Automobile[ROWS][COLUMNS];
    }
    
    public void parkCar(Automobile auto, String location) {
        int row = location.charAt(0) - 'A';
        int col = Integer.parseInt(location.substring(1)) - 1;
        spots[row][col] = auto;
    }
    
    public void removeCar(String location) {
        int row = location.charAt(0) - 'A';
        int col = Integer.parseInt(location.substring(1)) - 1;
        spots[row][col] = null;
    }
    
    public int getEmptySpots() {
        int count = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (spots[row][col] == null) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public int countCarsByMake(String make) {
        int count = 0;
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (spots[row][col] != null && spots[row][col].getMake().equals(make)) {
                    count++;
                }
            }
        }
        return count;
    }
    
    public Automobile findCarByLicensePlate(String license) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (spots[row][col] != null && spots[row][col].getLicensePlateNumber().equals(license)) {
                    return spots[row][col];
                }
            }
        }
        return null;
    }
    
    public boolean isDescriptionFound(String make, String model, String color) {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (spots[row][col] != null 
                    && spots[row][col].getMake().equals(make) 
                    && spots[row][col].getModel().equals(model) 
                    && spots[row][col].getColor().equals(color)) {
                    return true;
                }
            }
        }
        return false;
    }
}