package unit6;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private String licensePlateNumber;
    
    public Automobile(String make, String model, String color, String licensePlateNumber) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licensePlateNumber = licensePlateNumber;
    }
    
    // getters and setters for instance variables

    /**
     * @return String return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return String return the licensePlateNumber
     */
    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    /**
     * @param licensePlateNumber the licensePlateNumber to set
     */
    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

}