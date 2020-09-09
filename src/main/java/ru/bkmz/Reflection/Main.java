package ru.bkmz.Reflection;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Main main = new Main();
        Print print = new Print();
        main.print(print, print.getClass());
    }

    private void print(Object p, Class c) throws IllegalAccessException {
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.get(p));
               /* if (annotation.annotationType().equals(Print.class)) {
                    System.out.println(field.get(p));
                }*/
            }
        }

    }


}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRef {

    String message() default "mes";
}


class Print {
    @MyRef()
    String t = "ttt";
    String d = "ddd";
}