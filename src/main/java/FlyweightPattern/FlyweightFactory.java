package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String, FlyWeight> flyWeightMap;

    public FlyweightFactory() {
        flyWeightMap = new HashMap<String, FlyWeight>();
    }

    public FlyWeight getFlyweight(String name) {

        FlyWeight flyWeight = flyWeightMap.get(name);
        if (flyWeight == null) {
            flyWeight = new ConcreteFlyweight(name);
            flyWeightMap.put(name, flyWeight);
        }
        return flyWeight;
    }

}
