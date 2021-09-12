package adapter_pattern.adapters;

import adapter_pattern.imperial.RocketImperial;
import adapter_pattern.metric.RocketMetric;

/*

For Adapting Metric to Imperial

 */
public class MetricAdapter extends RocketImperial {
    private RocketMetric metric;
    public MetricAdapter(RocketMetric metric){
        this.metric = metric;
    }

    public double getRoundOff(double values){ return Math.round(values*100.0)/100.0;}

    public double getKiloGrams(Double pounds) { return pounds * 0.45359237; }
    public double getMeters(Double feet){ return feet * 0.3048; }
    public double getKilometers(Double miles){ return miles * 1.60934;}

    @Override
    public double getOperational_range(){ return metric.getOperational_range() * 1.60934; }

    public String getImperial(){
        String rocket_name = metric.getRocket_name();
        double mass = getRoundOff(getKiloGrams(metric.getMass()));
        double length = getRoundOff(getMeters(metric.getLength()));
        double diameter = getRoundOff(getMeters(metric.getDiameter()));
        double operational_range = getRoundOff(getKilometers(metric.getOperational_range()));
        double flight_altitude = getRoundOff(getKilometers(metric.getFlight_altitude()));

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
