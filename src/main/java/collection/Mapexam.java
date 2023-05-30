package collection;

import java.util.HashMap;
import java.util.Map;

public class Mapexam {
    public static void main(String[] args){

        Map<String, String> map = new HashMap<>(); // Set : 중복 x

        map.put("name", "이협건");
        map.put("email", "hglee67@kopo.ac.kr");
        map.put("dept", "데이터분석과");

        System.out.println("조회 결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));

        map.entrySet().forEach(entry -> {
            // 중복 확인을 항상하고 저장해서 리스트보다 상대적으로 느림
            // 그래서 속도 고려해서 순서대로 저장하지 않고 분산 저장 but 순서대로 저장하는 Set모델도 존재
                System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}
