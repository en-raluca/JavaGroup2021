package com.en.raul;

import com.en.raul.FinalProject.*;
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
import com.en.raul.Tema5Map.Order;
import com.en.raul.Tema5Map.Person;
import com.en.raul.Tema5Map.Product;

import java.util.*;

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

    public Set<Person> extractPersonsFromOrder(List<Order> ordersList){
        Set<Person> personSet = new HashSet<>();
        for(Order o : ordersList){
            personSet.add(o.getPersoana());
        }
        return personSet;
    }

    public int getNumberOfTimesProductBought(Map<String,Order> orderMap, int idOfProduct){
        int rezultat=0;
        Set<String> keySet = orderMap.keySet();
        for(String s:keySet){
            Order o = orderMap.get(s);
            Product product = o.getProdus();
            if(product.getId() == idOfProduct){
                rezultat++;
            }
        }
        return rezultat;
    }

    public double getSumOfOrders(Map<String,Order> orderMap, int idOfPerson){
        double rezultat=0;
        Set<String> keySet = orderMap.keySet();
        for(String s : keySet){
            Order order = orderMap.get(s);
            Person person = order.getPersoana();
            Product product = order.getProdus();
            if(person.getId() == idOfPerson){
                double pretComanda = product.getPret();
                rezultat += pretComanda;
            }
        }
        return rezultat;
    }

    public List<String> getOrderIds(Map<String,Order> orderMap, int idOfPerson){
        List<String> orderList = new ArrayList<>();
        Set<String> keySet = orderMap.keySet();
        for (String s : keySet){
            Order order = orderMap.get(s);
            Person person = order.getPersoana();
            Product product = order.getProdus();
            if(person.getId() == idOfPerson){
                orderList.add(order.getId());
            }
        }
        return orderList;
    }

    public Map<String, Person> getPersonWhoBought(Map<String, Order> orderMap, int idOfProduct){
        Map<String,Person> resultMap = new HashMap<>();
        Set<String> keySet = orderMap.keySet();
        for(String s : keySet){
            Order order = orderMap.get(s);
            Product product = order.getProdus();
            Person person = order.getPersoana();
            if(product.getId() == idOfProduct){
                resultMap.put(order.getId(),person);
            }
        }
        return resultMap;
    }

    public int getNumberOfTrainings(List<Training> trainingList, int minNumberOfParticipants) {
        int nrOfTrainings = 0;
        for(Training t : trainingList){
            if(t.getNrOfParticipants() >= minNumberOfParticipants){
                nrOfTrainings++;
            }
        }
        return nrOfTrainings;
    }

    public Map<Location,Integer> getNrOfEmployee(List<Employee> employeeList){
        Map<Location,Integer> resultMap = new HashMap<>();
        for(Employee e : employeeList){
            Location l = e.getWorkLocation();
            if(resultMap.containsKey(l)){
                int nrEmp = resultMap.get(l);
                resultMap.put(l,nrEmp++);
            }else{
                resultMap.put(l,1);
            }
        }
        return resultMap;
    }

    public Set<Trainer> getTrainerList (List<TrainingGroup> trainingGroupList, String trainingCode){
        Set<Trainer> resultSet = new HashSet<>();
        for(TrainingGroup tr : trainingGroupList){
            Training training = tr.getTraining();
            if(training.getCode().equals(trainingCode)){
                Trainer trainer = tr.getTrainer();
                resultSet.add(trainer);
            }
        }
        return resultSet;
    }

    public Map<Training,Integer> getTrainingDuration(List<Training> trainingList){
        Map<Training,Integer> resultMap = new HashMap<>();
        for(Training training : trainingList){
            int sum=0;
            List<Course> courseList = training.getCourseList();
            for(Course c : courseList){
                int courseDuration = c.getHoursDuration();
                sum+=courseDuration;
            }
            resultMap.put(training,sum);
        }
        return resultMap;
    }

    public List<Training> getTraining(List<TrainingGroup> trainingGroupList, int idAngajat){
        List<Training> resultList = new ArrayList<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            List<Employee> employeeList = trainingGroup.getEmployeeList();
            for(Employee e : employeeList){
                if(e.getEmployeeId() == idAngajat){
                    resultList.add(trainingGroup.getTraining());
                }
            }
        }
        return resultList;
    }

    public Set<Trainer> getTrainers(List<TrainingGroup> trainingGroupList, Training trainingParam){
        Set<Trainer> resultSet = new HashSet<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            Training training = trainingGroup.getTraining();
            if(training.equals(trainingParam)){
                resultSet.add(trainingGroup.getTrainer());
            }
        }
        return resultSet;
    }

    public int getEmployee(List<TrainingGroup> trainingGroupList, List<Employee> employeeList){
        int result=0;
        for(Employee e : employeeList){
            boolean hasTrainig=false;
            for(TrainingGroup trainingGroup : trainingGroupList){
                List<Employee> employeeList1 = trainingGroup.getEmployeeList();
                if(employeeList1.contains(e)){
                    hasTrainig=true;
                }
            }
            if(hasTrainig==false){
                result++;
            }
        }
        return result;
    }

    public List<com.en.raul.FinalProject.Employee> getLineManager(List<com.en.raul.FinalProject.Employee> employeeList, Location location){
        List<com.en.raul.FinalProject.Employee> resultList = new ArrayList<>();
        for(Employee e : employeeList){
            if((e.isLineManager == true) && e.getWorkLocation()==location){
                resultList.add(e);
            }
        }
        return resultList;
    }

    public Map<ExternalTrainer,Integer> getExternalTrainter(List<TrainingGroup> trainingGroupList, List<ExternalTrainer> externalTrainersList){
        Map<ExternalTrainer,Integer> resultMap = new HashMap<>();
        for(ExternalTrainer externalTrainer : externalTrainersList){
            int nrTraineri=0;
            for(TrainingGroup trainingGroup : trainingGroupList){
                Trainer trainer = trainingGroup.getTrainer();
                if(trainer instanceof ExternalTrainer){
                    ExternalTrainer trainer1 = (ExternalTrainer) trainer;
                    if(trainer.equals(externalTrainer)){
                        nrTraineri++;
                    }
                }
            }
            resultMap.put(externalTrainer,nrTraineri);
        }
        return resultMap;
    }

    public List<Training> getTrainingListWithNonFullCapacity(List<TrainingGroup> trainingGroupList){
        List<Training> resultList = new ArrayList<>();
        for(TrainingGroup trainingGroup : trainingGroupList){
            Training training = trainingGroup.getTraining();
            int nrOfParticipants = training.getNrOfParticipants();
            List<com.en.raul.FinalProject.Employee> empList = trainingGroup.getEmployeeList();
            int nrOfEmp = empList.size();
            if(nrOfParticipants>nrOfEmp){
                resultList.add(training);
            }
        }
        return resultList;
    }
}
