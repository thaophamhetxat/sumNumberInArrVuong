package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của mảng: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        n = scanner.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("enter number in arr:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("arr[" + i + "][" + j + "]= ");
                arr[i][j] = scanner.nextInt();
            }
        }
 //tổng đường chéo ma trận hình vuông
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum = sum + arr[i][j];
                }
            }
        } System.out.println("tổng đường chéo của hình vuông là: "+sum);

    }
}
