package com.Chapter3.ch08;

import java.lang.reflect.Array;
import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양 날개를 쭉 펴고 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animalHuman = new Human();
        Animal animalTiger = new Tiger();
        Animal animalEagle = new Eagle();

        AnimalTest test = new AnimalTest();
//        test.moveAnimal(animalHuman);
//        test.moveAnimal(animalTiger);
//        test.moveAnimal(animalEagle);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(animalHuman);
        animalList.add(animalTiger);
        animalList.add(animalEagle);

//        for(Animal animal : animalList) {
//            animal.move();
//        }

        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for(int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human) list.get(i);
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) list.get(i);
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) list.get(i);
                eagle.flying();
            } else {
                System.out.println("unsupported Type");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
