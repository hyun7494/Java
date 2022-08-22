package step01;
/*
 * 인터넷 봤음
 * 날짜 : 2022/08/23
 * 이름 : 김현준
 * 내용 : 입력받고 사칙연산
 * 
 */

import java.util.Scanner;

public class _10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int chess[] = {1, 1, 2, 2, 2, 8};
        int findChess[] = new int[chess.length];

        for(int i =0; i< chess.length; i++){
            findChess[i] = sc.nextInt();
        }

        for(int i =0; i < chess.length; i++){
            System.out.printf("%d ", chess[i]- findChess[i] );
        }
    }
}