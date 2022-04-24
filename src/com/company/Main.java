package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);
        while(true){
            input = in.nextLine();
            switch (input){
                case ("H"):
                case ("h"):{
                    System.out.println("Hello World!");
                    break;
                }
                case("Q"):
                case("q"):{
                    System.out.println("True or False?");
                    input = in.nextLine();
                    if(input.equalsIgnoreCase("true")|input.equals("1")){
                        System.out.println("True!");
                    }
                    else{
                        System.out.println("False!");
                    }
                    break;
                }
                case("+"):{
                    System.out.println("Введите число");
                    try {
                        int j = in.nextInt();
                        for (int i = 1; i <= j; i++){
                            Thread.sleep(500);
                            System.out.println(i);
                        }
                    } catch (Exception ex) {
                        System.out.println("Норм с головой?");
                    }
                }
                case("exit"):{
                    System.exit(0);
                }
            }
        }
    }
}
