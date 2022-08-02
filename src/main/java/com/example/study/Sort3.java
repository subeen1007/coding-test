package com.example.study;

import java.util.Arrays;

//[정렬]Ch3. H-Index
//테스트케이스
/*

Parameters	                        Return
[1, 7, 0, 1, 6, 4]      	        3
[1111, 2, 999, 777, 555, 10, 22]	6
[0]	                                0
[5]                                 1

*/


public class Sort3 {
    static int solution(int[] citations){
        int answer = 0;
        int hIndex = 0;
        //1. 정렬
        Arrays.sort(citations);

        //2. 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하인 것 검색
        for(int i=0; i<citations.length; i++){
            hIndex = citations.length-i;
            if(citations[i] >= hIndex){
                answer = hIndex;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sort3 main = new Sort3();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(main.solution(citations));
    }
}
