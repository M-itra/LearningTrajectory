package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Menu menu = context.getBean("menu", Menu.class);
        menu.run(context);
        context.close();
    }
}