package cn.school.thoughtworks.section1;

import com.sun.nio.sctp.SctpSocketOption;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> common = new ArrayList<>();
        for(String str1 : collection1){
            for(String str2 :collection2.get("value")){
                if(str1 == str2){
                    common.add(str1);
                }
            }
        }
        return common;
    }


}
