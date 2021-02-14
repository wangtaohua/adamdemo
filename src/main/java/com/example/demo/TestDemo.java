package com.example.demo;

public class TestDemo {
    public static void main(String[] args){
        //稀疏数组
//        int[][] arr = new int[10][10];
//        arr[2][1] = 1;
//        arr[3][2] = 2;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println("");
//        }
//        int[][] arr1=new int[arr.length][arr.length];
//        arr1[0][0] = arr[0].length;
//        arr1[0][1] = arr[0].length;
//        int sum=0;
//        int k=1;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[i][j]!=0){
//                    sum++;
//                    arr1[k][0] = i;
//                    arr1[k][1] = j;
//                    arr1[k][2] = arr[i][j];
//                    k++;
//                }
//            }
//        }
//        arr1[0][2] = sum;
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1.length; j++) {
//                if(arr1[i][j]!=0){
//                    System.out.print(arr1[i][j]+" ");
//                }
//            }
//            System.out.println("");
//        }
//        int [] s = {11,4,6,2,88,101};
//        //交换位置
//        for (int i = 0; i < s.length/2; i++) {
//            int t = s[i];
//            s[i] = s[s.length - i-1];
//            s[s.length - i-1] = t;
//        }
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        //冒泡排序
//        for (int i = 0; i < s.length-1; i++) {
//            for (int j = 0; j < s.length-1-i; j++) {
//                if(s[j]>s[j+1]){
//                    int t =s[j];
//                    s[j] = s[j+1];
//                    s[j+1]=t;
//                }
//            }
//        }
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
        //交换
//        int [] r = new int[s.length];
//        for (int i = 0, j=r.length-1; i < r.length; i++,j--) {
//            r[j]=s[i];
//        }
//        for (int i = 0; i < r.length; i++) {
//            System.out.println(r[i]);
//        }
        //多维数组排序
        //int [] [] arr = {{1,2},{2,3},{3,4},{4,5}};
//        int [] [] [] arr1 = {{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}},{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}};
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[0].length; j++) {
//                for (int k = 0; k < arr1[0][0].length; k++) {
//                    System.out.println(arr1[i][j][k]);
//                }
//            }
//        }
    }
}

