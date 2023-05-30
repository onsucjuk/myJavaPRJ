package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JavaCollection {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listsize = list.size();

        System.out.print(listsize + "\n");

        List<String> linklist = new LinkedList<>();

        linklist.add("A");
        linklist.add("B");
        linklist.add("C");
        linklist.add("D");

        System.out.println("1세대 반복문");
        for ( int i = 0; i < listsize; i++) {
                System.out.print(list.get(i)+" ");
        }

        System.out.println();
        System.out.println();

        System.out.println("2세대 반복문");
        for (String name : list) {
            System.out.println("이름 = " + name);
        } System.out.println();

        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " + name));
        System.out.println();

        System.out.println("4세대 반복문");
        list.parallelStream().forEach(name -> System.out.println("name은 " + name)); // 병행처리(비동기)라서 제일 빠르다.
        System.out.println();

        System.out.println("1.5세대 반복문"); // 2세대 반목문의 원류 가능하면 쓰지말자 [2세대 이후 추천]
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("이름 : " + name);

        }
    }
}
