package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                    Matcher m = Pattern.compile("(((\\w){1,2})((r|R))((u|U))((e|E)))|((\\w)((r|R){1,2})((u|U))((e|E)))|((\\w)((r|R))((u|U){1,2})((e|E)))|((\\w)((r|R))((u|U))((e|E){1,2}))  |  ((((T|t){1,2})(\\w)((u|U))((e|E)))|((T|t((\\w){1,2})((u|U))((e|E)))|((T|t)((\\w))((u|U){1,2})((e|E)))|((T|t)((\\w))((u|U))((e|E){1,2})))    |     ((((T|t){1,2})(R|r)(\\w)((e|E)))|((T|t((R|r){1,2})((\\w))((e|E)))|((T|t)((R|r))((\\w){1,2})((e|E)))|((T|t)((R|r))((\\w))((e|E){1,2}))))   |    ((((T|t){1,2})(R|r)((u|U))((\\w)))|((T|t((R|r){1,2})((u|U))((\\w)))|((T|t)(R|r)((u|U){1,2})((\\w)))|((T|t)((R|r))((u|U))((\\w){1,2})))))").matcher(input);
                    if(m.matches()|input.equals("1")){
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
