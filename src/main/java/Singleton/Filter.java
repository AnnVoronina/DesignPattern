package Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        List <Integer> result = new ArrayList<>();

        result = source.stream().filter(x -> x >= threshold).toList();

        return result;
        }

    }

