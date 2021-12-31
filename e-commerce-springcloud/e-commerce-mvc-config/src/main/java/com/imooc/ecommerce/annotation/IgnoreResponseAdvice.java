package com.imooc.ecommerce.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * <h1>忽略统一响应注解定义</h1>
 * @Target(ElementType.TYPE)   //接口、类、枚举
 * @Target(ElementType.METHOD) //方法
 * @Retention(RetentionPolicy.RUNTIME) //注解不仅被保存到class文件中，jvm加载class文件之后，仍然存在；
 * */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {

}
