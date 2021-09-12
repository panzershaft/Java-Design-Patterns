package adapter_pattern.imperial;

/*

This Rocker client uses Imperial units

 */
public class RocketImperial {
    
    
    private String rocket_name;
    private double mass;
    private double length;
    private double diameter;
    private double operational_range;
    private double flight_altitude;
    
    public RocketImperial(){}

    public RocketImperial(String rocket_name, double mass, double length, double diameter,
                          double operational_range, double flight_altitude){
        this.rocket_name = rocket_name;
        this.mass = mass;
        this.length = length;
        this.diameter = diameter;
        this.operational_range = operational_range;
        this.flight_altitude = flight_altitude;
    }

    public String getRocket_name(){ return rocket_name; }
    public double getMass(){ return mass; }
    public double getLength() { return length; }
    public double getDiameter() { return diameter; }
    public double getOperational_range() { return operational_range; }
    public double getFlight_altitude(){ return flight_altitude; }

    public String toString(){
        String stats;
        stats = "Rocket stats" +
                "\nName: " + rocket_name +
                "\nMass: " + mass + " Kg" +
                "\nLength: " + length + " m" +
                "\nDiameter: " + diameter + " m" +
                "\nOperational Range: " + operational_range + " km" +
                "\nFlight altitude: " + flight_altitude + " km";
        return stats;
    }




}
