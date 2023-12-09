package com.bilibili.juc.atomics;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author tanjezh
 * @create 2023-12-09 10:57
 */
class User {
    private String name;
    private Integer age;
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class AtomicReferenceDemo {
    public static void main(String[] args) {
        AtomicReference<User> atomicReference = new AtomicReference<>();

        User user = new User("tanjezh", 18);
        User user1 = new User("tanjezh1", 18);
        atomicReference.set(user);

        System.out.println(atomicReference.compareAndSet(user,user1)+"\t"+atomicReference.get());
    }
}
