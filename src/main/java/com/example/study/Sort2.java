package com.example.study;

import java.util.Arrays;
import java.util.Comparator;

//[정렬]Ch2. 가장 큰 수
public class Sort2 {
    public String solution(int[] numbers) {
        String answer = "";

//        방법1. for문으로 풀기
        //문자열을 리턴해줄 String배열로 변환
        String[] str = new String[numbers.length];

        //int배열 String배열로 변환
        for(int i=0; i<numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        //젤 첫번쨰 자리가 같다면 두번쨰 자리가 큰것을 앞으로
        //내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
                //오름차순 정렬 (o1+o2).compareTo(o2+o1);
            }
        });

        //0값이 중복일 경우
        if(str[0].equals("0"))  return "0";

        //0이 아니면 문자열을 더함
        for(String s : str) answer+=s;

//        방법2. 람다로 풀기
//        answer = Arrays.stream(numbers)
//                .mapToObj(String::valueOf)
//                .sorted((s1, s2) -> s1.concat(s2).compareTo(s2.concat(s1)))
//                .reduce("", (s1, s2) -> s1.equals("0") && s2.equals("0") ? "0" : s1.concat(s2))

        return answer;
    }

    public static void main(String[] args) {
        Sort2 main = new Sort2();
        int[] numbers = {6, 10, 2};
        System.out.println(main.solution(numbers));
    }
}
