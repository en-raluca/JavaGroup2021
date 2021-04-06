package com.en.diana.homeworkOOP.exercitiul1;

import com.en.diana.homeworkOOP.exercitiul6.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Flower musetel = new Flower("Musetel", "alb", 20);
//        Tree mesteacan = new Tree("Mesteacan", 2.3, 68.6);
//        String numeMusetel = musetel.getName();
//        System.out.println(numeMusetel);
//        mesteacan.setAge(88);
//        System.out.println("Copacul " + mesteacan.getName() + " are varsta " + mesteacan.getAge());
//        musetel.saySomethingSpecialAbout();
//        mesteacan.setName("Nuc");
//        System.out.println(mesteacan.getName());

        //exercitiul 1 Collections
        /*- filtreaza lista de flori in functie de o anumita culoare data ca parametru
        public List<Flower> filterFlowersByColor(List<Flower> flowerList, String color)*/
        //Construire obiecte tip Flower
        Flower musetel = new Flower("Musetel", "alb", 20);
        Flower trandafir = new Flower("Trandafir", "rosu", 30);
        Flower bujor = new Flower("Bujor", "rosu", 26);
        //Creare lista de obieste tip Flower
        List<Flower> flowersList = new ArrayList<Flower>();
        flowersList.add(0, musetel);
        flowersList.add(1, trandafir);
        flowersList.add(2, bujor);
        ObjectManager manager = new ObjectManager();
        manager.filterFlowersByColor(flowersList, "rosu");

        //exercitiul 2 Collections
        /*- filtreaza lista de copaci avand inaltimea mai mare decat o valoare data ca parametru
        public List<Tree> filterTreesByHeight(List<Tree> treeList, int height) */
        //Construire obiecte tip Tree
        Tree mesteacan = new Tree("Mesteacan", 3, 68.8);
        Tree carpen = new Tree("Carpen", 3.5, 43.2);
        Tree nuc = new Tree("Nuc", 4.6, 77.9);
        //Creare lista de obieste tip Tree
        List<Tree> treeList = new ArrayList<Tree>();
        treeList.add(0, mesteacan);
        treeList.add(1, carpen);
        treeList.add(2, nuc);
        manager.filterTreesByHeight(treeList, 3);
    }
}
