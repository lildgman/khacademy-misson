package generic_collection_practice;

import java.util.ArrayList;
import java.util.HashMap;

public class FarmController {

    HashMap<Farm, Integer> hMap = new HashMap<>();

    ArrayList<Farm> list = new ArrayList<>();

    public boolean addNewKind(Farm farm, int amount) {
        if (!hMap.containsKey(farm)) {
            hMap.put(farm, amount);
            return true;
        }
        return false;
    }

    public boolean removeKind(Farm farm) {
        if (hMap.containsKey(farm)) {
            hMap.remove(farm);
            return true;
        }
        return false;
    }

    public boolean changeAmount(Farm farm, int amount) {
        if (hMap.containsKey(farm)) {
            hMap.put(farm, amount);
            return true;
        }
        return false;
    }

    public HashMap<Farm, Integer> printFarm() {
        return hMap;
    }

    public boolean buyFarm(Farm farm) {
        if (hMap.containsKey(farm) && hMap.get(farm) > 0) {
            list.add(farm);
            hMap.replace(farm, hMap.get(farm) -1);
            return true;
        }
        return false;
    }

    public boolean removeFarm(Farm farm) {
        if (list.contains(farm)) {
            list.remove(farm);
            hMap.replace(farm, hMap.get(farm) + 1);
            return true;
        }
        return false;
    }

    public ArrayList<Farm> printBuyFarm(){
        return list;
    }

}
