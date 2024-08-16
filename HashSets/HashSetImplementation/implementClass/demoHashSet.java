import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

class RandomizedSet {
    private HashMap<Integer, Integer> map;  // Value -> Index in the list
    private List<Integer> list;             // Store values for random access
    private Random random;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        // Add value to the map and list
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        // Move the last element to the place of the element to remove
        int lastElement = list.get(list.size() - 1);
        int idxToReplace = map.get(val);
        
        list.set(idxToReplace, lastElement);
        map.put(lastElement, idxToReplace);

        // Remove the last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {
        
        int randomIndex = random.nextInt(list.size());
        
        return list.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */



