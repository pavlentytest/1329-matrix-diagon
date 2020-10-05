package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); // строки
        int m = scan.nextInt(); // столбцы
        int[][] z = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                z[i][j] = scan.nextInt();
            }
        }




        // добавить комментарий
        //int[][] x = { {4,5,6}, {9,8,2}, {4,2,88}};
        //printMatr(x);
        // элементы главной диагонали i=j
        //mainDiagMatr(x);
        // элементы побочной диагонали i+j = n - 1 (где n - размер кв. матрицы)
        // pobochDiagMatr(x);
        // элементы выше главное диагонали i<j
      //  upDiagMatr(x);
       // System.out.println();
        // элементы ниже главное диагонали i>j
       // downDiagMatr(x);
        // элементы выше побочной диагонали i+j < n - 1
        //upPobochDiagMatr(x);
       // System.out.println();
        // элементы ниже побочной диагонали i+j > n - 1
        //downPobochDiagMatr(x);
    }

    public static void upPobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i + j < x[i].length - 1) System.out.print(x[i][j] + " ");
            }
        }
    }

    public static void downPobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i + j > x[i].length - 1) System.out.print(x[i][j] + " ");
            }
        }
    }

    public static void downDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i > j) System.out.print(x[i][j] + " ");
            }
        }
    }

    public static void upDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i < j) System.out.print(x[i][j] + " ");
            }
        }
    }

    public static void pobochDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i+j == x[i].length-1) System.out.print(x[i][j] + " ");
            }
        }
    }

    public static void mainDiagMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                if(i==j) System.out.print(x[i][j] + " ");
            }

        }
    }

    public static void printMatr(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
