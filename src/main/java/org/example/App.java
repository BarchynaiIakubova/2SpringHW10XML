package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Panda animal = context.getBean("myPanda", Panda.class);
//        System.out.println(animal.animalPlus());
//        System.out.println("It is color is: " + animal.getColor());
//        System.out.println("Its age: " + animal.getAge());


        Person person = context.getBean("person", Person.class);
        System.out.println("My friend's " + person.favoriteAnimal());
        System.out.println("My favorite animal is: " + person.getName());
        System.out.println("Its age is: " + person.getAge());
        context.close();

    }
}
