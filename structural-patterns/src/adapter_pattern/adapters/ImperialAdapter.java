package adapter_pattern.adapters;

import adapter_pattern.imperial.RocketImperial;
import adapter_pattern.metric.RocketMetric;

/*

For Adapting Imperial to metric

 */
public class ImperialAdapter extends RocketMetric {
    private RocketImperial imperial;

    public ImperialAdapter(RocketImperial imperial) {
        this.imperial = imperial;
    }
    public double getRoundOff(double values){ return Math.round(values*100.0)/100.0;}

    public double getPounds(Double kilo_grams){ return kilo_grams * 2.20462262; }
    public double getFeet(Double meters){ return meters * 3.28084; }
    public double getMiles(Double kilo_meter){ return kilo_meter * 0.621371; }

    @Override
    public double getOperational_range(){ return getMiles(imperial.getOperational_range()); }


    public String getMetric(){
        String rocket_name = imperial.getRocket_name();
        double mass = getRoundOff(getPounds(imperial.getMass()));
        double length = getRoundOff(getFeet(imperial.getLength()));
        double diameter = getRoundOff(getFeet(imperial.getDiameter()));
        double operational_range = getRoundOff(getMiles(imperial.getOperational_range()));
        double flight_altitude = getRoundOff(getMiles(imperial.getFlight_altitude()));

        String stats;
        stats = "Rocket stats" +
                "\nName: " + rocket_name +
                "\nMass: " + mass + " lb" +
                "\nLength: " + length + " ft" +
                "\nDiameter: " + diameter + " ft" +
                "\nOperational Range: " + operational_range + " mi" +
                "\nFlight altitude: " + flight_altitude + " mi";
        return stats;
    }

}
