package crm.trophate.annotation;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException {

        Class<?> animalClass = Animal.class;
        // 获取类上的注解
        System.out.println(animalClass.getAnnotation(TestAnnotation.class).value());
        // 获取域上的注解
        Field animalNameFiled = animalClass.getDeclaredField("name");
        System.out.println(animalNameFiled.getAnnotation(TestAnnotation.class).value());

        // 注解继承
        Class<?> dogClass = Dog.class;
        System.out.println(dogClass.getAnnotation(TestAnnotation.class).value());
        Field dogNameFiled = dogClass.getSuperclass().getDeclaredField("name");
        System.out.println(dogNameFiled.getAnnotation(TestAnnotation.class).value());
    }

}
