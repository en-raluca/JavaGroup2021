package com.en.raul;

import com.en.raul.Problema1.Flower;
import com.en.raul.Problema1.Tree;
import com.en.raul.Problema12.BoardGame;
import com.en.raul.Problema12.Game;
import com.en.raul.Problema12.VideoGame;
import com.en.raul.Problema2.Pet;
import com.en.raul.Problema4.Employee;
import com.en.raul.Problema4.PartTimeEmployee;
import com.en.raul.Problema5.PersoanaFizica;
import com.en.raul.Problema5.PersoanaJuridica;

import java.util.ArrayList;
import java.util.List;

public class ObjectManager {

    public List<Flower> filterFlowersByColor(List<Flower> flowerList,String color){
        List<Flower> listRezultat = new ArrayList<>();
        for(Flower f : flowerList){
            if(f.getCuloare().equals(color)){
                listRezultat.add(f);
            }
        }
        return listRezultat;
    }

    public List<Tree> filterTreeByHeight(List<Tree> treeList,int height){
        List<Tree> listRezultat = new ArrayList<>();
        for(Tree t : treeList){
            if(t.getHeight() == height){
                listRezultat.add(t);
            }
        }
        return listRezultat;
    }

    public boolean searchPetByBreed(List<Pet> petList, String breed){
        for(Pet p : petList){
            if(p.getRasa().equals(breed)){
                return true;
            }
        }
        return false;
    }

    public boolean searchEmployeeByAddress(List<Employee> employeeList,String address){
        for(Employee e : employeeList){
            if(e.getAddress().equals(address)){
                return true;
            }
        }
        return false;
    }

    public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList, int nrOfHoursWorked){
        List<PartTimeEmployee> restulList = new ArrayList<>();
        for(PartTimeEmployee p : employeeList){
            if(p.getNrOfHoursWorked() >= nrOfHoursWorked){
                restulList.add(p);
            }
        }
        return restulList;
    }

    public boolean searchPersonByCnp(List<PersoanaFizica> personList, String cnp){
        for(PersoanaFizica p : personList){
            if(p.getCnp().equals(cnp)){
                return true;
            }
        }
        return false;
    }

    public String findCompanyNameByCui(List<PersoanaJuridica> personList, String cuiFirma){
        String numeComp=null;
        for(PersoanaJuridica p : personList){
            if(p.getCuiFirma().equals(cuiFirma)){
                numeComp=p.getCompanie();
            }
        }
        return numeComp;
    }

    public List<PersoanaJuridica> filterPersonsByCompany(List<PersoanaJuridica> personList, String company){
        List<PersoanaJuridica> listRez = new ArrayList<>();
        for(PersoanaJuridica p : personList){
            if(p.getCompanie().equals(company)){
                listRez.add(p);
            }
        }
        return listRez;
    }

    public List<BoardGame> filterGamesByNrOfPlayers(List<BoardGame> gameList, int nrOfPlayers){
        List<BoardGame> listRez = new ArrayList<>();
        for(BoardGame bg : gameList){
            if(bg.getNrOfPlayers() >= nrOfPlayers){
                listRez.add(bg);
            }
        }
        return listRez;
    }

    public boolean searchGameByProducer(List<VideoGame> gameList, String producator){
        for(VideoGame vg : gameList){
            if(vg.getProducator().equals(producator)){
                return true;
            }
        }
        return false;
    }

    public List<Game> findGameByTitle(List<Game> gameList, String titlu){
        List<Game> listRez = new ArrayList<>();
        for(Game g : gameList){
            if(g.getTitlu().equals(titlu)){
                listRez.add(g);
            }
        }
        return listRez;
    }
}
