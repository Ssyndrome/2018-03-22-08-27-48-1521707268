package cn.school.thoughtworks.section2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> result = new HashMap<>();
        for (String letter:collection1){
            if(letter.length() != 1){
                if(result.containsKey(getValid(letter)[0])){
                    result.put(getValid(letter)[0],result.get(getValid(letter)[0])+Integer.parseInt(getValid(letter)[1]));
                }else{
                    result.put(getValid(letter)[0],Integer.parseInt(getValid(letter)[1]));
                }
            }else if(result.containsKey(letter)){
                result.put(letter,result.get(letter)+1);
            }else{
                result.put(letter,1);
            }
        }
        return result;
    }

    String[] getValid(String str){
        String[] result = new String[2];
        if(str.contains("-")){
            result[0]=(str.split("-")[0]);
            result[1]=(str.split("-")[1]);
        }else if(str.contains("[")){
            result[0]=(str.split("\\[")[0]);
            result[1]=(str.split("\\[")[1].split("]")[0]);
        }else if(str.contains(":")){
            result[0]=(str.split(":")[0]);
            result[1]=(str.split(":")[1]);
        }else {
            return null;
        }
        return result;
    }


}
