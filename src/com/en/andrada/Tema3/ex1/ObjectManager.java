package com.en.andrada.Tema3.ex1;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {
    public List<Flower> filterFlowersByColor(List<Flower> flowerList, String color) {
        List<Flower> flowerListFiltered = new ArrayList<Flower>();
        for (Flower flower : flowerList) {
            if (flower.getCuloare().equals(color)) {
                flowerListFiltered.add(flower);
            }
        }
        return flowerListFiltered;
    }

    public List<Tree> filterTreesByHeight(List<Tree> treeList, double height) {
        List<Tree> treeListFiltered = new ArrayList<Tree>();
        for (Tree tree : treeList) {
            if (tree.getHeight() > height) {
                treeListFiltered.add(tree);
            }
        }
        return treeListFiltered;
    }
}
