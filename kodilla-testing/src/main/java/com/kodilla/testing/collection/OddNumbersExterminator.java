package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int resultList1: numbers) {
            if (resultList1 % 2 == 0) {
                resultList.add(resultList1);
            }
        }

        return resultList;

        }

    }

