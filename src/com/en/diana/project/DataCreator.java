package com.en.diana.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DataCreator {

    public List<Person> createPersonList() throws ParseException {
        List<Person> personList = new ArrayList<>();

        Address address = new Address("Strada Fericirii", 17, "Cluj-Napoca", "Romania", 400482);
        Person person1 = new Employee(1, "2800301125121", "Alina", "Gliga", "alina.gliga@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("01/03/1980"), address, 1001, Location.PBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("08/01/2015"));
        Person person2 = new Employee(2, "1810302125121", "Dragos", "Sabau", "dragos.sabau@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("02/03/1981"), address, 1002, Location.PBC, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("15/02/2016"));
        Person person3 = new Employee(3, "2820302125121", "Maria", "Cucuiet", "maria.cucuiet@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("02/03/1983"), address, 1004, Location.UBC, "Tester", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("06/04/2018"));
        Person person4 = new Employee(4, "2840303125121", "Oana", "Dines", "oana.dines@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("03/03/1984"), address, 1005, Location.UBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2014"));
        Person person5 = new Employee(5, "1850304125121", "Paul", "Stanescu", "paul.stanescu@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("04/03/1985"), address, 1006, Location.UBC, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("12/06/2015"));
        Person person6 = new Employee(6, "2860304125121", "Ioana", "Vedean", "ioana.vedean@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("04/03/1986"), address, 1007, Location.UBC, "Tester", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("13/07/2016"));
        Person person7 = new Employee(7, "1870305125121", "Dumitru", "Motpan", "dumitru.motpan@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("05/03/1987"), address, 1008, Location.UBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("29/08/2017"));
        Person person8 = new Employee(8, "2880306125121", "Ruxandra", "Verde", "ruxandra.verde@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("06/03/1988"), address, 1009, Location.UBC, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("27/09/2018"));
        Person person9 = new Employee(9, "2890306125121", "Oana", "Pop", "oana.pop@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("06/03/1989"), address, 1010, Location.UBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("14/10/2014"));
        Person person10 = new Employee(10, "2900307125121", "Ancuta", "Abrudan", "ancuta.abrudan@endava.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("07/03/1990"), address, 1011, Location.PBC, "Tester", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("18/11/2015"));
        Person person11 = new EmployeeTrainer(11, "1890308125121", "Mihai", "Boga", "mihai.boga@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("08/03/1989"), address, 1012, Location.UBC1, "Developer", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("15/12/2016"));
        Person person12 = new Employee(12, "1880308125121", "Ionut", "Branescu", "ionut.branescu@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("08/03/1988"), address, 1013, Location.UBC, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("19/01/2017"));
        Person person13 = new Employee(13, "2870309125121", "Olivia", "Crucita", "olivia.crucita@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("09/03/1987"), address, 1014, Location.UBC, "Developer", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("09/02/2018"));
        Person person14 = new Employee(14, "1860309125121", "Lucian", "Rusan", "lucian.rusan@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("09/03/1986"), address, 1015, Location.PBC, "Tester", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("11/03/2014"));
        Person person15 = new Employee(15, "2850309125121", "Mihaela", "Cozmei", "mihaela.cozmei@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("09/03/1985"), address, 1016, Location.UBC, "Developer", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("21/04/2015"));
        Person person16 = new Employee(16, "2840310125121", "Nicoleta", "Horincar", "nicoleta.horincar@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("10/03/1984"), address, 1017, Location.UBC, "Tester", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2016"));
        Person person17 = new Employee(17, "1830310125121", "Adrian", "Pitu", "adrian.pitu@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("10/03/1983"), address, 1018, Location.UBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("30/06/2017"));
        Person person18 = new Employee(18, "1820310125121", "Emil", "Marginean", "emil.marginean@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("10/03/1982"), address, 1019, Location.UBC, "Tester", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("29/07/2017"));
        Person person19 = new Employee(19, "1810310125121", "Alin", "Bordean", "alin.bordean@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("10/03/1981"), address, 1020, Location.UBC1, "Developer", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("07/08/2018"));
        Person person20 = new EmployeeTrainer(20, "1800311125121", "Bogdan", "Nastasa", "bogdan.nastasa@endava.com", "0735184375", new SimpleDateFormat("dd/MM/yyyy").parse("11/03/1980"), address, 1021, Location.UBC1, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("27/09/2014"));
        Person person21 = new Employee(21, "2810311125121", "Smaranda", "Hrimiuc", "smaranda.hrimiuc@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("11/03/1981"), address, 1022, Location.UBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("23/10/2015"));
        Person person22 = new Employee(22, "2820312125121", "Veronica", "Micle", "veronica.micle@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1982"), address, 1023, Location.UBC1, "Developer", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("13/11/2016"));
        Person person23 = new EmployeeTrainer(23, "2830312125121", "Andrada", "Rotar", "andrada.rotar@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("12/03/1983"), address, 1024, Location.UBC, "Tester", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("02/12/2017"));
        Person person24 = new Employee(24, "2840314125121", "Iraida", "Eremia", "iraida.eremia@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("14/03/1984"), address, 1025, Location.PBC, "Developer", false, false, new SimpleDateFormat("dd/MM/yyyy").parse("07/01/2018"));
        Person person25 = new Employee(25, "1850316125121", "Adrian", "Matean", "adrian.matean@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("16/03/1985"), address, 1026, Location.UBC1, "Tester", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("17/02/2014"));
        Person person26 = new Employee(26, "1860318125121", "Rares", "Oltean", "rares.oltean@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("18/03/1986"), address, 1027, Location.UBC, "Developer", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("19/03/2015"));
        Person person27 = new EmployeeTrainer(27, "1870324125121", "Cosmin", "Cristea", "cosmin.cristea@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("24/03/1987"), address, 1028, Location.UBC, "Tester", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("29/04/2016"));
        Person person28 = new Employee(28, "2880326125121", "Cosmina", "Bocos", "cosmina.bocos@endava.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("26/03/1988"), address, 1029, Location.UBC, "Tester", true, false, new SimpleDateFormat("dd/MM/yyyy").parse("02/05/2017"));
        Person person29 = new EmployeeTrainer(29, "2890331125121", "Raluca", "Beian", "raluca.beian@endava.com", "0729173631", new SimpleDateFormat("dd/MM/yyyy").parse("31/03/1989"), address, 1030, Location.UBC1, "Developer", false, true, new SimpleDateFormat("dd/MM/yyyy").parse("30/03/2015"));
        Person person30 = new ExternalTrainer(30, "1750316125121", "Mircea", "Miclea", "mircea.miclea@yahoo.com", "0741596375", new SimpleDateFormat("dd/MM/yyyy").parse("16/03/1975"), address, "", "www.mircea-miclea.ro", 250);
        Person person31 = new ExternalTrainer(31, "2840311125121", "Raluca", "Anton", "raluca.anton@yahoo.com", "0752681375", new SimpleDateFormat("dd/MM/yyyy").parse("11/03/1984"), address, "", "www.raluca-anton.ro", 200);

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);
        personList.add(person11);
        personList.add(person12);
        personList.add(person13);
        personList.add(person14);
        personList.add(person15);
        personList.add(person16);
        personList.add(person17);
        personList.add(person18);
        personList.add(person19);
        personList.add(person20);
        personList.add(person21);
        personList.add(person22);
        personList.add(person23);
        personList.add(person24);
        personList.add(person25);
        personList.add(person26);
        personList.add(person27);
        personList.add(person28);
        personList.add(person29);
        personList.add(person30);
        personList.add(person31);

        return personList;
    }

    public List<Training> createTrainingList() {
        List<Training> trainingList = new ArrayList<>();

        // create first training object
        Training training1 = new Training(1, "TR_JAVA", "Java Programming Language", 10, "Intermediary", "Technical Skills");
        List<Course> courseList1 = new ArrayList<>();
        Course course1 = new Course(1, "Java Classes and Members and Access Modifiers", "Learn how to define classes members and access modifiers in Java", 2);
        Course course2 = new Course(2, "OOP - Encapsulation", "Learn one oop principle: encapsulation", 2);
        Course course3 = new Course(3, "OOP - Inheritance", "Learn one oop principle: inheritance", 2);
        Course course4 = new Course(4, "OOP - Polymorphism", "Learn one oop principle: polymorphsim", 2);
        Course course5 = new Course(5, "OOP - Abstraction", "Learn one oop principle: abstraction", 2);
        courseList1.add(course1);
        courseList1.add(course2);
        courseList1.add(course3);
        courseList1.add(course4);
        courseList1.add(course5);
        training1.setCourseList(courseList1);

        // create second training object
        Training training2 = new Training(2, "TR_IOS", "IOS Programming Language", 10, "Beginner", "Technical Skills");
        List<Course> courseList2 = new ArrayList<>();
        course1 = new Course(1, "Introduction into IOS Software Language", "Learn about IOS programming language", 1);
        course2 = new Course(2, "Classes and Operators", "Learn how to define classes in IOS", 2);
        course3 = new Course(3, "Variables in IOS", "Learn how to use variable in IOS", 2);
        course4 = new Course(4, "Final Project", "Create a final project using IOS language", 42);
        courseList2.add(course1);
        courseList2.add(course2);
        courseList2.add(course3);
        courseList2.add(course4);
        training2.setCourseList(courseList2);

        // create third training object
        Training training3 = new Training(3, "TR_PUBLIC_SPEAKING", "How to Successfullt Speak in Public", 30, "Beginner", "Soft Skills");
        List<Course> courseList3 = new ArrayList<>();
        course1 = new Course(1, "VOICE", "Your most important job as a speaker is to find your voice", 2);
        course2 = new Course(2, "LEARN", "You will learn more from audiences that don't love you than audiences that do", 2);
        course3 = new Course(3, "SPEAK", "Let it go", 2);
        course4 = new Course(4, "AUDIENCE", "Not all audiences should hear you", 2);
        course5 = new Course(5, "SPEECH", "In fact - you should never give the same speech twice", 2);
        courseList3.add(course1);
        courseList3.add(course2);
        courseList3.add(course3);
        courseList3.add(course4);
        courseList3.add(course5);
        training3.setCourseList(courseList3);

        // create fourth training object
        Training training4 = new Training(4, "TR_EMOTIONAL_INTELLIGENCE", "How to grow your Emotional Intelligence", 30, "Intermediary", "Soft Skills");
        List<Course> courseList4 = new ArrayList<>();
        course1 = new Course(1, "IMPORTANCE", "The importance of emotional intelligence", 3);
        course2 = new Course(2, "IDENTIFY", "Recognize your emotional intelligence", 3);
        course3 = new Course(3, "GROW", "Exercises to grow your emotional intelligence", 3);
        courseList4.add(course1);
        courseList4.add(course2);
        courseList4.add(course3);
        training4.setCourseList(courseList4);

        trainingList.add(training1);
        trainingList.add(training2);
        trainingList.add(training3);
        trainingList.add(training4);

        return trainingList;
    }

}
