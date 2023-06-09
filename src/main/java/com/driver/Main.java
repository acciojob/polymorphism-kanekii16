package com.driver;

public class Main {

    static  class Product{

        public int product(int x , int y){
            return x * y;
        }

        public int product(int x , int y,int z){
            return x * y * z;
        }

        public double product(double x , double y){
            return x * y;
        }

    }


    public static void main(String[] args) {
        Product p = new Product();

        System.out.println(p.product(10,3));


        System.out.println(p.product(10,3,4));


        System.out.println(p.product(10.5,21.3));

    }

}

/*
* Method overloading in java can be done using same name but changing parameters
* The product(int x , int y) will return product of 2 integers
* The product(int x , int y , int z) will return product of 3 integers
* The product(double x , double y) will return product of 2 doubles.
* */