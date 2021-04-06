package com.en.diana.homeworkOOP.exercitiul6;

import com.en.diana.homeworkOOP.exercitiul1.Flower;
import com.en.diana.homeworkOOP.exercitiul1.Tree;
import com.en.diana.homeworkOOP.exercitiul2.Pet;
import com.en.diana.homeworkOOP.exercitiul3.Animal;
import com.en.diana.homeworkOOP.exercitiul4.Employee;
import com.en.diana.homeworkOOP.exercitiul4.PartTimeEmployee;
import com.en.diana.homeworkOOP.exercitiul5.PersFizica;
import com.en.diana.homeworkOOP.exercitiul5.Persoana;
import com.en.diana.homeworkOOP.exercitiul5.PersoanaJuridica;


import java.util.ArrayList;
import java.util.List;

public class ObjectManager {

    public boolean checkIfProductIsFree(Produs produs) {
        double pret = produs.getPret();
        boolean isFree = false;
        if (pret == 0) {
            isFree = true;
        }
        return isFree;
    }

    public String findProductById(List<Produs> productList, String name) {
        String nameRez = null;
        for (Produs p : productList) {
            if (p.getNume().equals(name)) {
                nameRez = p.getNume();
            }
        }
        return nameRez;
    }

    public boolean getAgeOfPersonByNameAndLastName(List<Persoana> personList, String lastName) {
        boolean result = false;
        for (Persoana p : personList) {
            if (p.getNume().equals(lastName) && p.getPrenume().equals(lastName)) {
                return true;
            }
        }
        return result;
    }

    public List<Flower> filterFlowersByColor(List<Flower> flowerList, String color) {
        List<Flower> newFlowerList = new ArrayList<Flower>();
        for (Flower s : flowerList) {
            if (s.getCuloare().equals(color)) {
                newFlowerList.add(s);
            }
        }
        System.out.println(newFlowerList);
        return newFlowerList;
    }

    public List<Tree> filterTreesByHeight(List<Tree> treeList, int height) {
        List<Tree> newTreeList = new ArrayList<Tree>();
        for (Tree s : treeList) {
            if (s.getHeight() == height) {
                newTreeList.add(s);
            }
        }
        System.out.println(newTreeList);
        return newTreeList;
    }

    public boolean searchPetByBreed(List<Pet> petList, String breed) {
        boolean existeingBreed = false;
        for (Pet s : petList) {
            if (s.getRasa().equals(breed)) {
                existeingBreed = true;
            }
        }
        return existeingBreed;
    }

    public String findAnimalNameByCategory(List<Animal> animalList, String category) {
        for (Animal s : animalList) {
            if (s.getCategorie().equals(category)) {
                return s.getNume();
            }
        }
        return "";
    }

    public boolean searchEmployeeByAddress(List<Employee> employeeList, String address) {
        boolean existeingEmployee = false;
        for (Employee s : employeeList) {
            if (s.getAddress().equals(address)) {
                existeingEmployee = true;
            }
        }
        return existeingEmployee;
    }

    public List<PartTimeEmployee> filterEmployeeByNrOfHoursWorked(List<PartTimeEmployee> employeeList,
                                                                  int nrOfHoursWor) {
        List<PartTimeEmployee> newEmployeeList = new ArrayList<PartTimeEmployee>();
        for (PartTimeEmployee s : employeeList) {
            if (s.getNrOfHoursWorked() == nrOfHoursWor) {
                newEmployeeList.add(s);
            }
        }
        return newEmployeeList;
    }

    public boolean searchPersonByCnp(List<PersFizica> personList, String cnp) {
        boolean existeingCnp = false;
        for (PersFizica s : personList) {
            if (s.getCnp().equals(cnp)) {
                existeingCnp = true;
            }
        }
        return existeingCnp;
    }

    public String findCompanyNameByCui(List<PersoanaJuridica> personList, String cuiFirma) {
        for (PersoanaJuridica s : personList) {
            if (s.getCuiFirma().equals(cuiFirma)) {
                return s.getCompanie();
            }
        }
        return "";
    }

    public List<PersoanaJuridica> filterPersonsByCompany(List<PersoanaJuridica> personList, String company) {
        List<PersoanaJuridica> nouaLista = new ArrayList<PersoanaJuridica>();
        for (PersoanaJuridica s : personList) {
            if (s.getCompanie().equals(company)) {
                nouaLista.add(s);
            }
        }
        return nouaLista;
    }

    public List<ProdAlimentar> filterProductsByPrice(List<ProdAlimentar> productList, double pret) {
        List<ProdAlimentar> newProductList = new ArrayList<ProdAlimentar>();
        for (ProdAlimentar s : productList) {
            if (s.getPret() < pret) {
                newProductList.add(s);
            }
        }
        return newProductList;
    }

    public ProdAlimentar findProductById(List<ProdAlimentar> productList, int id) {
        ProdAlimentar newProductListById;
        for (ProdAlimentar s : productList) {
            if (s.getId() == id) {
                System.out.println(s);
            }
        }
        return null;
    }

    public String findProductNameById(List<ProdAlimentar> productList, int id) {
        String nameProd = "";
        for (ProdAlimentar s : productList) {
            if (s.getId() == id) {
                nameProd = s.getNume();
            }
        }
        return nameProd;
    }

    public boolean searchProductByName(List<ProdAlimentar> productList, String nume) {
        boolean hasName = false;
        for (ProdAlimentar s : productList) {
            if (s.getNume().equals(nume)) {
                hasName = true;
            }
        }
        return hasName;
    }

    public boolean searchProductByModel(List<ProdElectronic> productList, String model) {
        boolean modelProd = false;
        for (ProdElectronic s : productList) {
            if (s.getModel().equals(model)) {
                modelProd = true;
            }
        }
        return modelProd;
    }


}
