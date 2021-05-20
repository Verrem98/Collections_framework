package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Utils {


    public ArrayList generateList(int length) {

        Random rand = new Random();
        ArrayList<String> randomList = new ArrayList<String>();

        for (int i = 0; i < length; i++) {

            String randomLetter = Character.toString((char) rand.nextInt(26) + 97);
            randomList.add(randomLetter);

        }

        return randomList;

    }


    public ArrayList bubbleSort(ArrayList list) {
        /** Returns a list sorted with bubble sort*/


        while (true) {

            boolean swap = false;

            for (int i = 0; i < list.size() - 1; i++) {
                if ((int) list.get(i).toString().charAt(0) > (int) list.get(i + 1).toString().charAt(0)) {

                    String smaller = list.get(i + 1).toString();
                    String bigger = list.get(i).toString();

                    list.set(i, smaller);
                    list.set(i + 1, bigger);
                    swap = true;
                }
            }

            if(swap==false){
                return list;
            }

        }

    }


    public ArrayList bubbleSortV2(ArrayList list) {
        /** Returns a list sorted with bubble sort, uses compareTo which is much better for strings(doesn't just look at the first character)*/

        while (true) {

            boolean swap = false;

            for (int i = 0; i < list.size() - 1; i++) {

                if(list.get(i).toString().compareTo(list.get(i+1).toString())>0){

                    String smaller = list.get(i + 1).toString();
                    String bigger = list.get(i).toString();

                    list.set(i, smaller);
                    list.set(i + 1, bigger);
                    swap = true;
                }
            }

            if(swap==false){
                return list;
            }

        }

    }
}
