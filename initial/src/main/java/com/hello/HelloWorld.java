package com.hello;

import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelloWorld {




    //完成 main 方法
    public static void main(String[] args) {
        Object r= 8666;

        if((r instanceof Integer)){
            int[] a ={89 , -23 , 64 , 91 , 119 , 52 , 73};

            Arrays.toString(a);


            Arrays.sort(a);

            int[] b= new int[a.length];
            for(int i=0 ; i<a.length;i++){

                if(a[i]<=100 && a[i]>=0){
                    b[i]=a[i];
                }

            }
            System.out.println(Arrays.toString(b));

        }else {

            int[] a ={89 , -23 , 64 , 91 , 119 , 52 , 73};

            List<Integer> d= new ArrayList<>();
            for(int i=0 ; i<a.length;i++){

                d.add(a[i]);

            }

            System.out.println(d.get(0));

        }









    }








}