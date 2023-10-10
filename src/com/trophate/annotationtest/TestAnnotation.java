package com.trophate.annotationtest;

import java.lang.annotation.*;

// 声明文档显示
@Documented
// 声明作用范围, 这里表示作用于类, 接口, 枚举.
@Target({ElementType.TYPE, ElementType.FIELD})
// 声明存在方式, 这里表示在运行时保存到虚拟机并可以通过反射获取.
@Retention(RetentionPolicy.RUNTIME)
// 允许继承
@Inherited
// @interface表示实现Annotation接口
public @interface TestAnnotation {

     String value();
}
