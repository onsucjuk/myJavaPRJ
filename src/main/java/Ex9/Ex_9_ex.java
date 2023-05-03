package Ex9;

public class Ex_9_ex {
    public static void main(String[] args){
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)";

        String str[] = log.split(" ");
        String ip = str[0];
        System.out.print("출력결과 : ");
        System.out.println(ip);

        String time = str[3].replace("[","");
        System.out.print("호출날짜와 시간만 출력하기 : ");
        System.out.println(time);
    }
}
