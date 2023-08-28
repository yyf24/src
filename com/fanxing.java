package com;

import java.util.ArrayList;

public class fanxing {
    /*
    *泛型对arrayList的数据类型进行规范
    * 1)泛型又称参数化类型，解决数据类型安全性问题
    * 2）在类声明或实例化时，指定好所需要的具体类型
    * 3）java泛型可以保证如果在程序编译时没有发生警告，运行时就不会产生
    * 4）数据类型的数据类型
     */
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();

        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("wd",5));
        for(Dog dog:arrayList){
            System.out.println(dog.getName());
        }
    }
}
class cat<E>{
    private E s;

}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}