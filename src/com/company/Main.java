package com.company;

public class Main {

    public static void main(String[] args) {



        Cow cow1 = new Cow("Аврора",4,90.2);
        Cow cow2 = new Cow("Emma",1,50.6);
        Cow cow3 = new Cow("Penelopa",6,78.9);
        Cow cow4 = new Cow("Bella",3,70.5);
        Cow cow5 = new Cow("Molly",2,60.7);
        Cow[] cows = {cow1,cow2,cow3,cow4,cow5};

        //2nd
        Cow cow6 = new Cow("Annie",4,90.0);
        Cow cow7 = new Cow("Ella",3,60.7);
        Cow[] cows2 = {cow6,cow7};

        Horse horse1 = new Horse("Angus",3,89.9);
        Horse horse2 = new Horse("Pokey",5,33.3);
        Horse[] horses = {horse1,horse2};
       //2nd
        Horse horse3 = new Horse("Angus",3,84.3);
        Horse horse4 = new Horse("Pokey",9,81.7);
        Horse horse5 = new Horse("Pepper",2,89.6);
        Horse horse6 = new Horse("Silver",5,56.7);
        Horse horse7 = new Horse("Gold",6,45.1);
        Horse[] horses2 = {horse3,horse4,horse5,horse6,horse7};

        Sheep sheep1 = new Sheep("Мерино",7,9.9);
        Sheep sheep2= new Sheep("Karakul",4,77.7);
        Sheep sheep3 = new Sheep("Cheviot",1,88.8);
        Sheep sheep4 = new Sheep("Altynym",8,44.4);
        Sheep sheep5 = new Sheep("Rambouillet",2,33.3);
        Sheep sheep6 = new Sheep("Hampshire",9,55.5);
        Sheep sheep7 = new Sheep("Southdown",11,66.6);
        Sheep sheep8 = new Sheep("Suffolk",12,87.4);
        Sheep[] sheeps = {sheep1,sheep2,sheep3,sheep4,sheep5,sheep6,sheep7,sheep8};
       //2nd
        Sheep sheep9 = new Sheep("Diamond",7,5.4);
        Sheep sheep10 = new Sheep("Gold",3,3.7);
        Sheep sheep11 = new Sheep("Silver",2,3.4);
        Sheep sheep12 = new Sheep("Emerald",4,5.2);
        Sheep[] sheeps2 = {sheep9,sheep10,sheep11,sheep12};
        //1-2 Жайлоо
        Jailoo jailoo = new Jailoo("Too","Naryn","Dilbara");
        Jailoo jailoo2 = new Jailoo("Sulaiman Too","Osh","Daniiar");
        //1-Жайлоо жана жаныбарлар жонундо маалымат
        System.out.println("Жайлоонун аты:"+jailoo.getName() + ", адрес: " + jailoo.getAddress() +", чабан: "+ jailoo.getChabanAty());
        System.out.println("Фермада: " + cows.length + " уйлар, " + horses.length + " аттар, " + sheeps.length + " койлор бар");
        System.out.println(" ");

        System.out.println("Уйлар: ");
        for(Cow cow : cows){
            System.out.println("Аттары: "+cow.getName() + " жашы: " + cow.getJashy() + " салмагы: " + cow.getSalmagy());
        }
        System.out.println(" ");

        System.out.println("Аттар: ");
        for(Horse horse : horses){
            System.out.println("Аттары: "+horse.getName() + " жашы: " + horse.getJashy() + " салмагы: " + horse.getSalmagy());
        }
        System.out.println(" ");

        System.out.println("Койлор: ");
        for(Sheep sheep : sheeps){
            System.out.println("Аттары: "+sheep.getName() + " жашы: " + sheep.getJashy() + " салмагы: " + sheep.getSalmagy());
        }
        System.out.println(" ");

        //2-Жайлоо жана жаныбарлар жонундо маалымат
        System.out.println("-----------------------------------------------------");
        System.out.println("Жайлоонун аты:"+jailoo2.getName() + ", адрес: " + jailoo2.getAddress() +", чабан: "+ jailoo2.getChabanAty());
        System.out.println("Фермада: " + cows2.length + " уйлар, " + horses2.length + " аттар, " + sheeps2.length + " койлор бар");
        System.out.println(" ");

        System.out.println("Уйлар: ");
        for(Cow cow : cows2){
            System.out.println("Аттары: "+cow.getName() + " жашы: " + cow.getJashy() + " салмагы: " + cow.getSalmagy());
        }
        System.out.println(" ");

        System.out.println("Аттар: ");
        for(Horse horse : horses2){
            System.out.println("Аттары: "+horse.getName() + " жашы: " + horse.getJashy() + " салмагы: " + horse.getSalmagy());
        }
        System.out.println(" ");

        System.out.println("Койлор: ");
        for(Sheep sheep : sheeps2){
            System.out.println("Аттары: "+sheep.getName() + " жашы: " + sheep.getJashy() + " салмагы: " + sheep.getSalmagy());
        }
        System.out.println(" ");






    }

}
