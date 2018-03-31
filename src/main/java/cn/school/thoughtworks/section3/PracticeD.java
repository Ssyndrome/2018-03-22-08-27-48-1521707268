package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> collection3 = countSameElements(collectionA);
        return createUpdatedCollection(collection3,object);
    }

    Map<String,Integer> countSameElements(List<String> collection1) {
        Map<String,Integer> result = new HashMap<>();
        for (String letter:collection1){
            if(letter.indexOf('-') != -1){
                result.put(letter.split("-")[0],Integer.parseInt(letter.split("-")[1]));
            }else if(result.containsKey(letter)){
                result.put(letter,result.get(letter)+1);
            }else{
                result.put(letter,1);
            }
        }

        return result;
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
