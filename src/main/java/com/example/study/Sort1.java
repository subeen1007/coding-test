package com.example.study;

import java.util.Arrays;

//[정렬]Ch1. K번째수
public class Sort1 {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i< commands.length; i++){
            int[] tmp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Sort1 main = new Sort1();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(main.solution(array,command)));
    }

}
