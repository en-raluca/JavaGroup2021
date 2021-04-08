package com.en.diana.project;

import java.util.*;

public class Manager {

    public int getNrOfTrainings(List<Training> trainingList, int minNrOfParticipants) {
        int nrOfTrainings = 0;
        for (Training training : trainingList) {
            if (training.getNrOfParticipants() >= minNrOfParticipants) {
                nrOfTrainings++;
            }
        }
        return nrOfTrainings;
    }

    public List<Training> getTrainingsWithMaxDuration(List<Training> trainingsList) {
        List<Training> trainingsWithMaxDuration = new ArrayList<>();
        int max = 0;
        for (Training training : trainingsList) {
            List<Course> courseList = training.getCourseList();
            int totalNrOfHours = 0;
            for (Course course : courseList) {
                int nrOfHours = course.getHoursDuration();
                totalNrOfHours += nrOfHours;
            }
            if (totalNrOfHours > max) {
                trainingsWithMaxDuration = new ArrayList<>();
                max = totalNrOfHours;
                trainingsWithMaxDuration.add(training);
            } else if (totalNrOfHours == max) {
                trainingsWithMaxDuration.add(training);

            }
        }
        return trainingsWithMaxDuration;
    }

    public Map<Employee, Integer> getNrOfTrainings(List<TrainingGroup> trainingGroupList, List<Employee> employeeList) {
        Map<Employee, Integer> employeeIntegerMap = new HashMap<>();
        for (TrainingGroup tg : trainingGroupList) {
            int numberOfTrainings = 0;
            List<Employee> tgEmployeeList = tg.getEmployeeList();
            for (Employee e : employeeList) {
                numberOfTrainings++;
                if (employeeIntegerMap.containsKey(e)) {
                    int actual = employeeIntegerMap.get(e);
                    employeeIntegerMap.put(e, actual++);

                } else {
                    employeeIntegerMap.put(e, 1);
                }
            }
        }
        for (Employee e : employeeList) {
            if (!employeeIntegerMap.containsKey(e)) ;
            employeeIntegerMap.put(e, 0);
        }
        return employeeIntegerMap;
    }

    public List<Training> getTrainings(List<Training> trainingList, int minCourseList) {
        List<Training> trainings = new ArrayList<>();
        for (Training t : trainingList) {
            List<Course> courseList = t.getCourseList();
            if (courseList.size() > minCourseList) {
                trainings.add(t);
            }
        }
        return trainings;
    }

    public Map<Location, Integer> getNrOfEmployees(List<Employee> employeeList) {
        Map<Location, Integer> resultsMap = new HashMap<>();
        for (Employee e : employeeList) {
            Location loc = e.getWorkLocation();
            if (resultsMap.containsKey(loc)) {
                int nr = resultsMap.get(loc);
                nr++;
                resultsMap.put(loc, nr);

            } else {
                resultsMap.put(loc, 1);
            }
        }
        return resultsMap;
    }

    public Set<Trainer> getNrOfTrainers(List<TrainingGroup> trainingGroupList, String code) {
        Set<Trainer> setTrainerList = new HashSet<>();
        for (TrainingGroup tr : trainingGroupList) {
            Training training = tr.getTraining();
            if (training.getCode().equals(code)) {
                Trainer trainer = tr.getTrainer();
                setTrainerList.add(trainer);
            }
        }
        return setTrainerList;
    }

    //me
    public Map<Training, Integer> getTrainingDuration(List<Training> trainingList) {
        Map<Training, Integer> newMap = new HashMap<>();
        for (Training t : trainingList) {
            int suma = 0;
            List<Course> courseList = t.getCourseList();
            for (Course c : courseList) {
                suma += c.getHoursDuration();
            }
            newMap.put(t, suma);
        }
        return newMap;
    }

    //me
    public List<Training> getTrainings(List<TrainingGroup> trainingGroupList, int idEmployee) {
        List<Training> newList = new ArrayList<>();
        for (TrainingGroup tr : trainingGroupList) {
            List<Employee> emp = tr.getEmployeeList();
            for (Employee employee : emp) {
                if (employee.getEmployeeId() == idEmployee) {
                    Training training = tr.getTraining();
                    newList.add(training);
                }
            }
        }
        return newList;
    }

    public Set<Trainer> getTrainingListForTrainers(List<TrainingGroup> trainingGroupList, Training training) {
        Set<Trainer> trainerSet = new HashSet<>();
        for (TrainingGroup trainingGroup : trainingGroupList) {
            Training tr = trainingGroup.getTraining();
            if (training.equals(training)) {
                Trainer trainer = trainingGroup.getTrainer();
                trainerSet.add(trainer);
            }
        }
        return trainerSet;
    }

    public int getEmployee(List<TrainingGroup> trainingGroup, List<Employee> employeeList) {
        int employeeNumber = 0;
        for (Employee e : employeeList) {
            boolean hasTrainings = false;
            for (TrainingGroup tr : trainingGroup) {
                List<Employee> empList = tr.getEmployeeList();
                if (empList.contains(e)) {
                    hasTrainings = true;
                }
            }
            if (hasTrainings == false) {
                employeeNumber++;
            }
        }
        return employeeNumber;
    }

    public List<Employee> getLinemManager(List<Employee> employeeList, Location location) {
        List<Employee> employeesList = new ArrayList<>();
        for (Employee employee : employeesList) {
            boolean isLineManager = employee.isLineManager();
            if (employee.getWorkLocation() == location && isLineManager == true) {
                employeesList.add(employee);
            }
        }
        return employeeList;
    }

    //calculati cate training-uri a avut fiecare External Trainer
    public Map<ExternalTrainer, Integer> externalTrainerMap(List<TrainingGroup> trainingGroupList, List<ExternalTrainer> externalTrainerList) {
        Map<ExternalTrainer, Integer> externalTrainerIntegerMap = new HashMap<>();
        for (ExternalTrainer externalTrainer : externalTrainerList) {
            int nrOfTrainings = 0;
            for (TrainingGroup trainingGroup : trainingGroupList) {
                Trainer trainer = trainingGroup.getTrainer();
                if (trainer instanceof ExternalTrainer) {
                    ExternalTrainer externalTrainer1 = (ExternalTrainer) trainer;
                    if (externalTrainer1.equals(externalTrainer)) {
                        nrOfTrainings++;
                    }
                }
            }
            externalTrainerIntegerMap.put(externalTrainer, nrOfTrainings);
        }
        return externalTrainerIntegerMap;
    }

    public List<Training> getTrainingListWithNonFullCapacity(List<TrainingGroup> trainingGroupList) {
        List<Training> resultList = new ArrayList<>();
        for (TrainingGroup trainingGroup : trainingGroupList) {
            Training training = trainingGroup.getTraining();
            int nrOfParticipants = training.getNrOfParticipants();
            List<Employee> empList = trainingGroup.getEmployeeList();
            int nrOfEmp = empList.size();
            if (nrOfParticipants > nrOfEmp) {
                resultList.add(training);
            }
        }
        return resultList;
    }

}
