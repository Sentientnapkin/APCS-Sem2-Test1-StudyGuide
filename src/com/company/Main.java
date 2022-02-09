package com.company;
import java.util.ArrayList;

public class Main {

    int count(String[][] wordMatrix, String key){
        int count = 0;
        for(String[] strArr:wordMatrix){
            for(String strCol:strArr){
                if(strCol.equals(key)){
                    count++;
                }
            }
        }
        return count;
    }

    boolean[][] matrixProbabilities(int rows, int cols){
        boolean[][] mat = new boolean[rows][cols];
        for(boolean[] arr:mat){
            for(boolean bool:arr){
                double ran = Math.random();
                if(ran<=0.1){
                    bool=true;
                }
            }
        }
        return mat;
    }

    double average(double[][] numberMatrix){
        int sum = 0;
        for(double[] arr:numberMatrix){
            for(double num:arr){
                sum+= num;
            }
        }
        return sum/(numberMatrix.length*numberMatrix[0].length);
    }

    String firstWord(String[][] wordMatrix){
        String firstWord = "";
        for(String[] arr:wordMatrix){
            for(String str:arr){
                if(str.compareTo(firstWord)<=0){
                    firstWord=str;
                }
            }
        }
        return firstWord;
    }

    int largestRowSumIndex(int[][] matrix){
        int largestSum = 0;
        int largestSumIndex = 0;
        for(int i = 0;i<matrix.length;i++){
            int sum = 0;
            for(int j = 0;j<matrix[i].length;j++){
                sum+= matrix[i][j];
            }
            if(largestSum<sum){
                largestSumIndex=i;
                largestSum=sum;
            }
        }
        return largestSumIndex;
    }

    int largestColumnSumIndex(int[][] matrix){
        int largestSum = 0;
        int largestSumIndex = 0;
        for(int col = 0;col<matrix[0].length;col++){
            int sum = 0;
            for(int row = 0;row<matrix.length;row++){
                sum+= matrix[row][col];
            }
            if(largestSum<sum){
                largestSumIndex=col;
                largestSum=sum;
            }
        }
        return largestSumIndex;
    }

    int min(int[] array){
        return minTR(array,0,Integer.MAX_VALUE);
    }

    int minTR(int[] arr,int index,int smallest){
        if(index==arr.length){
            return smallest;
        }
        else{
            smallest = Math.min(smallest,arr[index]);
            return minTR(arr,index+1,smallest);
        }
    }

    int countOdd(int num){
        if(num<1){
            return 0;
        }
        else if (num%2!=0){
            return 1+countOdd(num/10);
        }
        else{
            return countOdd(num/10);
        }
    }

    String removeZ(String str){
        if(str.length()<1){
            return "";
        }
        else if(str.toLowerCase().charAt(0)!= 'z'){
            return str.charAt(0)+removeZ(str.substring(1));
        }
        else{
            return removeZ(str.substring(1));
        }
    }


    public static void main(String[] args) {
	// write your code here
    }
}
