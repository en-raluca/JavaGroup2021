package com.myproject;

import com.myproject.model.Employee;
import com.myproject.model.ExternalTrainer;
import com.myproject.model.Trainer;
import com.myproject.service.Course;
import com.myproject.service.Location;
import com.myproject.service.Training;
import com.myproject.service.TrainingGroup;

import java.util.*;

/**
 * Created by atpop on 08 Apr 2021
 */

public class Manager {

    public int getNumberOfTrainings(List<Training> trainingList, int minNrOfParticipants) {
        int numberOfTrainings = 0;
        for (Training t : trainingList) {
            int numberOfParticipants = t.getNrOfParticipants();
            if (minNrOfParticipants > numberOfParticipants) {
                numberOfTrainings++;
            }
        }
        return numberOfTrainings;
    }

    public List<Training> getTrainingsWithMaxDuration(List<Training> trainingList) {
        List<Training> maxTrainingList = new ArrayList<>();
        int totalNumberOfHours = 0;
        int max = 0;
        for (Training t : trainingList) {
            List<Course> courseList = t.getCourseList();
            for (Course c : courseList) {
                int nrOfHours = c.getHoursDuration();
                totalNumberOfHours += nrOfHours;
            }
            if (totalNumberOfHours > max) {
                maxTrainingList = new ArrayList<>();
                max = totalNumberOfHours;
                maxTrainingList.add(t);
            } else if (totalNumberOfHours == max) {
                maxTrainingList.add(t);
            }
        }
        return maxTrainingList;
    }

    public Map<Employee, Integer> getNumberOfTrainings(List<TrainingGroup> trainingGroupList, List<Employee> employeeList) {
        Map<Employee, Integer> employeeIntegerMap = new HashMap<>();
        for (TrainingGroup tg : trainingGroupList) {
            List<Employee> tgEmployeeList = tg.getEmployeeList();
            for (Employee e : tgEmployeeList) {
                if (employeeIntegerMap.containsKey(e)) {
                    int actual = employeeIntegerMap.get(e);
                    employeeIntegerMap.put(e, actual++);
                } else {
                    employeeIntegerMap.put(e, 1);
                }
            }
        }
        for (Employee e : employeeList) {
            if (!employeeIntegerMap.containsKey(e)) {
                employeeIntegerMap.put(e, 0);
            }
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

    public Map<Location, Integer> getNumberOfEmployees(List<Employee> employeeList) {
        Map<Location, Integer> locationIntegerMap = new HashMap<>();
        for (Employee e : employeeList) {
            Location location = e.getWorkLocation();
            if (locationIntegerMap.containsKey(location)) {
                int nrOfEmployee = locationIntegerMap.get(location);
                nrOfEmployee++;
                locationIntegerMap.put(location, nrOfEmployee);
            } else {
                locationIntegerMap.put(location, 1);
            }
        }
        return locationIntegerMap;
    }

    public Set<Trainer> getNrOfTrainers(List<TrainingGroup> trainingGroupList, String code) {
        Set<Trainer> trainingSet = new HashSet<>();
        for (TrainingGroup tg : trainingGroupList) {
            Training training = tg.getTraining();
            if (training.getCode().equals(code)) {
                Trainer trainer = tg.getTrainer();
                trainingSet.add(trainer);
            }
        }
        return trainingSet;
    }

    public Map<Training, Integer> getTrainingDuration(List<Training> trainingList) {
        Map<Training, Integer> trainingIntegerMap = new HashMap<>();
        for (Training t : trainingList) {
            int sum = 0;
            List<Course> courseList = t.getCourseList();
            for (Course c : courseList) {
                sum += c.getHoursDuration();
            }
            trainingIntegerMap.put(t, sum);
        }
        return trainingIntegerMap;
    }

    public List<Training> getTrainingsForEmployee(List<TrainingGroup> trainingGroupList, int employeeId) {
        List<Training> trainings = new ArrayList<>();
        for (TrainingGroup tg : trainingGroupList) {
            List<Employee> employeeList = tg.getEmployeeList();
            for (Employee e : employeeList) {
                if (employeeId == e.getEmployeeId()) {
                    Training training = tg.getTraining();
                    trainings.add(training);
                }
            }
        }
        return trainings;
    }

    public Set<Trainer> getTrainingListForTraining(List<TrainingGroup> trainingGroupList, Training training) {
        Set<Trainer> trainers = new HashSet<>();
        for (TrainingGroup tg : trainingGroupList) {
            Training training1 = tg.getTraining();
            if (training.equals(training1)) {
                Trainer trainer = tg.getTrainer();
                trainers.add(trainer);
            }
        }
        return trainers;
    }

    public int getEmployees(List<TrainingGroup> trainingGroupList, List<Employee> employeeList) {
        int nrOfEmployees = 0;
        for (Employee e : employeeList) {
            boolean hasTrainings = false;
            for (TrainingGroup tg : trainingGroupList) {
                List<Employee> employeeList1 = tg.getEmployeeList();
                if (employeeList1.contains(e)) {
                    hasTrainings = true;
                }
            }
            if (!hasTrainings) {
                nrOfEmployees++;
            }
        }
        return nrOfEmployees;
    }

    public List<Employee> getLineManager(List<Employee> employeeList, Location location) {
        List<Employee> employeeList1 = new ArrayList<>();
        for (Employee e : employeeList) {
            boolean isLineManager = e.isLineManager();
            if (e.getWorkLocation() == location && isLineManager) {
                employeeList1.add(e);
            }
        }
        return employeeList1;
    }

    public Map<ExternalTrainer, Integer> externalTrainerMap(List<TrainingGroup> trainingGroupList,
                                                            List<ExternalTrainer> externalTrainerList) {
        Map<ExternalTrainer, Integer> externalTrainerIntegerMap = new HashMap<>();
        for (ExternalTrainer et : externalTrainerList) {
            int nrOfTrainings = 0;
            for (TrainingGroup tg : trainingGroupList) {
                Trainer trainer = tg.getTrainer();
                if (trainer instanceof ExternalTrainer) {
                    ExternalTrainer externalTrainer = (ExternalTrainer) trainer;
                    if (externalTrainer.equals(et)) {
                        nrOfTrainings++;
                    }
                }
            }
            externalTrainerIntegerMap.put(et, nrOfTrainings);
        }
        return externalTrainerIntegerMap;
    }
}
