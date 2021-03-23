package com.en.andrada;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbeian
 */
public class PlayWithGenericList {

        public static void main(String[] args) {
            // safe collections (generic)
            List<Integer> mySafeList = new ArrayList<>();

            // we can add only elements of the specified type or its subtypes in a generic collection
            mySafeList.add(1234);
            mySafeList.add(5678);
            //mySafeList.add("aaa"); // compiler error if we try to add a different type which is not subtype of the specified type

            // the downcast is not needed when extracting from a generic collections
            // (the downcast is needed when extracting from a non-generic collections)
            Integer i1 = mySafeList.get(0);
            System.out.println(i1);


            // we iterate over a generic collections with the specified type or supertype
            for(Integer i : mySafeList){
                System.out.println("Element = " + i);
            }

            // we iterate over a collections by using the index of elements
            for(int i=0; i < mySafeList.size(); i++){
                Integer i2 = mySafeList.get(i);
                System.out.println("Element is: " + i2);
            }

            // compilations fails if we try to pass the generic collection to a method with a generic collections argument of different type
            // doStuffWihGenericList(mySafeList);

            List<String> namesList = new ArrayList<>();
            namesList.add("Raluca");
            doStuffWihGenericList(namesList);
            System.out.println(namesList);
        }

        public static void doStuffWihGenericList(List<String> list){
            // we can add only elements of the specified type or subtype in a generic collections
            list.add("aaa");
            list.add("bbb");
            //list.add(new Object()); // compiler error if we try to add an element of an incompatible type
        }

        public static void doStuffWihGenericObjectLIst(List<Object> list){
            // we can add any type of elements in this collections
            // because Object is the superclass of any class in Java
            list.add("aaa");
            list.add("bbb");
            list.add(123);
            list.add(new Object());
        }
}
