package adapter_pattern.client;

import adapter_pattern.adapters.ImperialAdapter;
import adapter_pattern.adapters.MetricAdapter;
import adapter_pattern.imperial.RocketImperial;
import adapter_pattern.metric.RocketMetric;

import java.util.ArrayList;

public class Runner {
    public static void main (String [] args){

        RocketImperial imperial = new RocketImperial("v2",12500, 14,
                1.65, 320, 88);

        RocketMetric metric = new RocketMetric("v2", 27600, 45.11,
                5.5, 200, 55);

        Object[] objects = {new ImperialAdapter(imperial), new MetricAdapter(metric)};

        for(Object object : objects){
            if (object instanceof ImperialAdapter) Imperial(imperial, (ImperialAdapter) object);
            if (object instanceof MetricAdapter) Metric(metric, (MetricAdapter) object);
        }

    }

    public static void Imperial(RocketImperial imperial, ImperialAdapter imperialAdapter){
        System.out.println(imperial.getOperational_range() + " km is equivalent to " +
                imperialAdapter.getOperational_range() + " mi");
        System.out.println("------------------       IMPERIAL        ------------------");
        System.out.println(imperial);
        System.out.println("------------------  IMPERIAL TO METRIC --------------------");
        System.out.println(imperialAdapter.getMetric());
        System.out.println("-----------------------------------------------------------");

    }

    public static void Metric(RocketMetric metric, MetricAdapter metricAdapter){
        System.out.println(metric.getOperational_range() + " mi is equivalent to " +
                metricAdapter.getOperational_range() + " km");
        System.out.println("------------------       METRIC        --------------------");
        System.out.println(metric);
        System.out.println("------------------  METRIC TO IMPERIAL --------------------");
        System.out.println(metricAdapter.getImperial());
        System.out.println("-----------------------------------------------------------");
    }
}
