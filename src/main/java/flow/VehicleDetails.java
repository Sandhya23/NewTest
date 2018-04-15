package flow;

public class VehicleDetails {
    private String regNumber;
    private String make;
    private String colour;

    public VehicleDetails(String regNumber, String make, String colour) {
        this.regNumber = regNumber;
        this.make = make;
        this.colour = colour;
    }

    public String getRegistrationNumber() {
        return regNumber;
    }

    public void setRegistrationNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
