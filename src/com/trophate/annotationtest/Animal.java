package com.trophate.annotationtest;

@TestAnnotation("这是一个类注解")
public class Animal {

    @TestAnnotation("这是一个域注解")
    protected String name;
}
