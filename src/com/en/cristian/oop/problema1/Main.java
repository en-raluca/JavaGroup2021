package com.en.cristian.oop.problema1;

import com.en.cristian.oop.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        System.out.println("--------------------------------problema1------------------------------------------------");
//        Flower flower1 = new Flower("Crin", "alb", 6);
//        flower1.saySomethingSpecialAbout();
//        System.out.println("Flower " + flower1.getName() + " has color " + flower1.getCuloare() + "!");
//        Tree tree1 = new Tree("Con", 6.5, 15);
//        tree1.saySomethingSpecialAbout();
//        System.out.println("Tree " + tree1.getName() + " has height " + tree1.getHeight() + "!");
        ObjectManager manager = new ObjectManager();

        List<Flower> flowerList = new ArrayList<Flower>();
        System.out.println("FLOWERS");
        Flower flower1= new Flower("tulip","white", 8);
        Flower flower2= new Flower("rose","red", 6);
        Flower flower3= new Flower("lily","mauve", 12);

        flowerList.add(0,flower1);
        flowerList.add(1,flower2);
        flowerList.add(2,flower3);

        List<Flower> color1=manager.filterFlowersByColor(flowerList, "white");
        System.out.println(color1);
        List<Flower> color2=manager.filterFlowersByColor(flowerList, "mauve");
        System.out.println(color2);

        System.out.println("TREES");
        List<Tree> treeList = new ArrayList<Tree>();
        Tree tree1= new Tree("fag",8.78,6);
        Tree tree2= new Tree("brad",2.5,6);
        Tree tree3= new Tree("stejar",8.8,10);

        treeList.add(0,tree1);
        treeList.add(1,tree2);
        treeList.add(2,tree3);

        List<Tree> height1=manager.filterTreesByHeight(treeList,8.78);
        System.out.println(height1);
        List<Tree> height2=manager.filterTreesByHeight(treeList,8.8);
        System.out.println(height2);
    }
}
