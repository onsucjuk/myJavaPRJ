package collection;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        List<Map<String, String>> list = new ArrayList<>();
        Map<String, String> map = null;

        for (int i = 0; i < 5; i++){

            System.out.print("이름 : ");
            String name = sc.next();

            System.out.print("이메일 : ");
            String email = sc.next();

            System.out.print("주소 : ");
            String addr = sc.next();

            System.out.print("부서 : ");
            String dept = sc.next();

            map = new HashMap<>();

            map.put("name", name);
            map.put("email", email);
            map.put("addr", addr);
            map.put("dept", dept);

            list.add(map);

            map = null; // 마지막에 new로 선언해놨으면 마지막에 초기화 필요
        }

        int listsize = list.size();
        System.out.println("저장된 데이터 수 : " + listsize);

        System.out.println("1세대 반복문");
        for (int i = 0; i < listsize; i++) {
            Map<String, String> rmap = list.get(i);

            System.out.println("name : " + rmap.get("name")); // 이름 가져오기
            System.out.println("email : " + rmap.get("email")); // 이메일 가져오기
            System.out.println("addr : " + rmap.get("addr")); // 주소 가져오기
            System.out.println("dept : " + rmap.get("dept")); // 부서 가져오기

            rmap = null;
        }

        System.out.println("2세대 반복문");
        for(Map<String, String> rmap : list) {
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
        }

        System.out.println("3세대 반복문");
        list.forEach(rmap -> {
            System.out.println("name : " + rmap.get("name"));
            System.out.println("email : " + rmap.get("email"));
            System.out.println("addr : " + rmap.get("addr"));
            System.out.println("dept : " + rmap.get("dept"));
        });
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rmap -> {
            System.out.println("name : " + rmap.get("name")); // 이름 가져오기
            System.out.println("email : " + rmap.get("email")); // 이메일 가져오기
            System.out.println("addr : " + rmap.get("addr")); // 주소 가져오기
            System.out.println("dept : " + rmap.get("dept")); // 부서 가져오기
        });
    }
}
