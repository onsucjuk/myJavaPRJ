package Ex7;
public class Practice {
    public static void main(String[] args) {

        int j = 2; // 구구단 2단,3단~ 단 수 기준
        for (int i = 1 ; j<=9 && i<=9; i++) { // for문 두개 합쳐서 조건 2개 동시에 작성, j는 기준 단수 i는 곱해지는 1~9 정수 카운트

            if(i==1) { // i가 1일 떄는 ~~단 시작하므로 ~~단 시작 출력 후 j * i에 해당하는 구구단 출력

                System.out.printf("%d단 시작합니다.\n",j);
                System.out.printf("%d x %d = %d | ", j, i ,i * j);

            } else if(i<9) { // 구구단 9가 마지막이므로 1이후 2~8까지는 i만 변동하면 됌.

                System.out.printf("%d x %d = %d | ", j, i ,i * j);


            } else if(i==9) { // i가 9가되면 구구단의 한 단(ex. 2단)이 끝나므로 ~~단 끝났습니다 출력 후 곱해지는 값인 i 초기화[초기 값은 1이지만 0으로 초기화하는 이유는 이후 for문에 의해 ++해주기 떄문] 후 단수의 기준인 j++

                System.out.printf("%d x %d = %d\n", j, i ,i * j);
                System.out.printf("%d단 끝났습니다.\n\n",j);
                i = 0;
                j++;

            }

        }

    }

}
