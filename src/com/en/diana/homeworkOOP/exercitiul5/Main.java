package com.en.diana.homeworkOOP.exercitiul5;

import com.en.diana.homeworkOOP.exercitiul6.ObjectManager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        PersFizica person = new PersFizica("Popescu", "Maria", "290123456", "Cluj-Napoca");
//        PersoanaJuridica juridic = new PersoanaJuridica("Popa","Ana","JYSK", "5678", "Bucuresti");
//        System.out.println(person.toString());
//        System.out.println("cnp-ul pentru " + person.getPrenume() + " est " + person.getCnp());
//        juridic.setAdresaFirma("Baia Mare");
//        System.out.println(juridic.getAdresaFirma());
//        juridic.setCuiFirma("8907");
//        System.out.println(juridic.getCuiFirma());

        //exercitiul 7 Collections
        /*- verifica daca exista in lista de persoane o persoana care are cnp-ul dat ca parametru
        public boolean searchPersonByCnp(List<PersoanaFizica> personList, String cnp)*/
        //Construire obiecte tip PersFizica
        PersFizica person1 = new PersFizica("Popescu", "Maria", "2901234560", "Cluj-Napoca");
        PersFizica person2 = new PersFizica("Antonescu", "Marian", "1978234569", "Cluj-Napoca");
        PersFizica person3 = new PersFizica("Man", "Ana", "2901234568", "Cluj-Napoca");
        //Creare lista de obieste tip PersFizica
        List<PersFizica> persFizicaList = new ArrayList<PersFizica>();
        persFizicaList.add(0, person1);
        persFizicaList.add(1, person2);
        persFizicaList.add(2, person3);
        ObjectManager manager = new ObjectManager();
        boolean rezultCnp = manager.searchPersonByCnp(persFizicaList, "1978234569");
        System.out.println(rezultCnp);

        //exercitiul 8 Collections
        /*- cauta in lista de persoane numele companiei asociat unui anumit cod unic de inregistrare (cui) dat
         ca parametru
        public String findCompanyNameByCui(List<PersoanaJuridica> personList, String cuiFirma) */
        //Construire obiecte tip PersoanaJuridica
        PersoanaJuridica juridica1 = new PersoanaJuridica("Popa", "Marin", "IKEA", "5678", "Bucuresti");
        PersoanaJuridica juridica2 = new PersoanaJuridica("Anton", "Ion", "IKEA", "78898", "Cluj-Napoca");
        PersoanaJuridica juridica3 = new PersoanaJuridica("Rusu", "Alina", "ENDAVA", "44502", "Mures");
        //Creare lista de obieste tip PersoanaJuridica
        List<PersoanaJuridica> persJuridicaList = new ArrayList<PersoanaJuridica>();
        persJuridicaList.add(0, juridica1);
        persJuridicaList.add(1, juridica2);
        persJuridicaList.add(2, juridica3);
        String rezultCui = manager.findCompanyNameByCui(persJuridicaList, "44502");
        System.out.println(rezultCui);

        //exercitiul 9 Collections
        /*- - filtreaza lista de persoane in functie de o anumita companie data ca parametru
        public List<PersoanaJuridica> filterPersonsByCompany(List<PersoanaJuridica> personList, String company) */
        List<PersoanaJuridica> rezultByCompany = manager.filterPersonsByCompany(persJuridicaList, "IKEA");
        System.out.println(rezultByCompany);
    }
}
