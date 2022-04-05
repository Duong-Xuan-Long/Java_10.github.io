package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);

    int r=0;
    int c=0;
        System.out.println("Enter the number of rows: ");
  r=scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        c=scanner.nextInt();

    double[][] array=new double[r][c];
        double[][] array2=new double[r][c];
        double[][] array3=new double[r][c];
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            System.out.printf("Enter array[%d][%d]: ",i,j);
            array[i][j]=scanner.nextDouble();

        }

    }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+"\t\t");
            }
            System.out.println(" ");
        }
        double sum=0;
        if(r==c){
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    if(i==j){
                        System.out.println(array[i][j]+" là một phần tử nằm trên đường chéo chính");
                    }
                }

            }
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.printf("Enter array2[%d][%d]: ",i,j);
                array[i][j]=scanner.nextDouble();

            }

        }
        for(int i=0;i<array3.length;i++){
            for(int j=0;j<array3[i].length;j++){
                array3[i][j]=array[i][j]+array2[i][j];
            }}
        System.out.println("array3=array+array2");
        for(int i=0;i<array3.length;i++){
            for(int j=0;j<array3[i].length;j++){
                System.out.print(array3[i][j]+"\t\t");
            }
            System.out.println(" ");
        }

    }
}
