package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collection3 = countSameElements(collectionA);
        return createUpdatedCollection(collection3,object);
    }

    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> collection3 = new HashMap<>();
        for (String letter:collection1){
            if(collection3.containsKey(letter)){
                collection3.put(letter,collection3.get(letter)+1);
            }else{
                collection3.put(letter,1);
            }
        }
        return collection3;
    }

    Map<String, Integer> createUpdatedCollection(Map<String, Integer> collectionA, Map<String, List<String>> object) {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : collectionA.entrySet()) {
            if (object.get("value").contains(entry.getKey())) {
                result.put(entry.getKey(), threeMinusOne(entry.getValue()));
            } else {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        return result;
    }

    Integer threeMinusOne (Integer num){
        return num-num/3;
    }

}
