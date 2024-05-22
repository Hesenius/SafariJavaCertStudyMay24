package com.dancingcloudservices;

import service.MyServiceIf;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Main {
  public static void main(String[] args) throws Throwable {
    System.out.println("Hello world!");
    System.out.println(service.Implementation.message);
    // no, modular code cannot split a package, so "default/protected" are "hard" encapsulation now
//    System.out.println(protstuff.HackIt.getDefaultMessage());
    Class<?> cl = Class.forName("service.Implementation");
    Field field = cl.getDeclaredField("secretMessage");
    field.setAccessible(true);
    String secret = (String)field.get(null);
    //    System.out.println(service.Implementation.secretMessage);
    System.out.println("Secret message is " + secret);

    ServiceLoader<MyServiceIf> loader = ServiceLoader.load(MyServiceIf.class);
    for (MyServiceIf service : loader) {
      System.out.println("found an implementation " + service.getClass().getName());
      System.out.println("message is: " + service.getServiceMessage());
    }
  }
}
// 2000  javac -d modules/ --source-path "./*/src/main/java" --module my.srv
// 2001  javac -d modules/ --module-source-path "./*/src/main/java" --module my.srv
//     2002  tree modules
//     2003  javac -d modules/ --module-path ./modules --module-source-path "./*/src/main/java" --module my.cli
//     2004  javac -d modules/ --module-path ./modules --module-source-path "./*/src/main/java" --module my.client
//     2005  tree modules
//     2006  javac -d modules/ --module-path ./modules --module-source-path "./*/src/main/java" --module my.client,my.srv
//     2007  java --module-path modules --module my.client/com.dancingcloudservices.Main
//     2008  history
