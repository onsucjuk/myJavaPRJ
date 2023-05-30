package Quiz;

public class Ex_9ver2 {
    public static void main(String[] args){

        String s = "IT CookBook Java";
        System.out.println("원본 문자열 : "+s);
        int len = s.length();
        System.out.println("문자열의 길이 : "+len);

        String strSub = s.substring(0,2); // s에서 주소 0,1 (앞에서 2글자 축출)
        System.out.println("문자열 잘라내기 : " + strSub);
        String strUpp = s.toUpperCase(); // 대문자로 바꿔줌
        System.out.println("대문자로 바꾸기 : " + strUpp);
        String strLow = s.toLowerCase(); // 소문자로 바꿔줌
        System.out.println("소문자로 바꾸기 : " + strLow);
        String strRep = s.replaceAll(" ","^"); // " " 공백을 "$"로 바꿔줌
        System.out.println("지정 문자로 바꾸기 : " + strRep);
        String str[] = s.split(" "); // " "기준으로 배열로 저장 str[0], str[1], str[2]
        System.out.print("지정 문자열로 나눠서 저장하기 : ");

        for(int i = 0; i < str.length; i++){ // " " 기준으로 나눠진 문자열 출력
            System.out.print(i+"번째 문자열은 " + str[i]+",");
            if(i==str.length-1){
                System.out.println();
            }
        }

        char ch = s.charAt(0); // 0번째 위치에 있는 문자열 타입을 문자 타입으로 출력
        System.out.println("문자열의 해당 위치(0) 문자로 출력하기 : "+ch);

        System.out.print("startsWith와 endsWith로 괄호 추가하기 : ");
        if (!s.startsWith("(")){
            System.out.print("(");
        }

        for(int i = 0; i < len; i++) {
            System.out.print(s.charAt(i));
        }

        if (!s.endsWith(")")){
            System.out.print(")");
        }
        System.out.println();
        // startsWith 부터 endsWith까지 문자열s출력
        // startsWith는 문자열의 시작이 제시 문자열인지 아닌지 여부를 반환(true or false)
        // endsWith는 문자열의 마지막이 제시 문자열인지 아닌지 여부를 반환
        // 처음과 끝에 각각 ( ) 가 없다면 추가해서 문자열을 출력해준다는 의미.

        int stridx = s.indexOf("o",7);
        // 언급한 index(default = 0)부터 제시 문자열 "o"의 처음 등장 위치
        System.out.println("7번째부터 o가 처음 나오는 위치 : "+stridx);
        int stridx2 = s.lastIndexOf("o",7);
        System.out.println("7번째 기준으로 역순으로 o가 처음 나오는 위치 : "+stridx2);
        // index(default = 0)부터 제시 문자열 "o"의 마지막 위치

        String s1 = "Java Programming";
        String s2 = "Java Programming";
        String s3 = new String("Java Programming");
        System.out.println("문자열1과 2는 s1 = Java로 문자열3은 new를 써서 문자열 초기화");
        System.out.println("문자열1==문자열2의 결과 : "+(s1==s2));
        System.out.println("문자열1.equals(문자열2)의 결과 : "+s1.equals(s2));
        System.out.println("문자열1==문자열3의 결과 : "+(s1==s3));
        // 문자열s1과 s3는 메모리에서 저장장소가 달라서 비교가 제대로 성립되지 않아서 false 출력
        System.out.println("문자열1.equals(문자열3)의 결과 : "+s1.equals(s3));
        // 스트링 메서드 .equals사용시 같은 문자열로 판단되고 true출력

    }
}
