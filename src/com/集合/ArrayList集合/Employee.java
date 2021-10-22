package com.集合.ArrayList集合;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author LuoBin
 * @version 1.0
 * @date 2021/7/30 5:25 下午
 */
/*
    Java 提供了一种对象序列化的机制，该机制中，一个对象可以被表示为一个字节序列，该字节序列包括该对象的数据、有关对象的类型的信息和存储在对象中数据的类型；
    将序列化对象写入文件之后，可以从文件中读取出来，并且对它进行反序列化，也就是说，对象的类型信息、对象的数据，还有对象中的数据类型可以用来在内存中新建对象；
    整个过程都是 Java 虚拟机（JVM）独立的，也就是说，在一个平台上序列化的对象可以在另一个完全不同的平台上反序列化该对象；

    类 ObjectInputStream 和 ObjectOutputStream 是高层次的数据流，它们包含反序列化和序列化对象的方法；

 */
public class Employee implements java.io.Serializable{
    /*
        一个类的对象要想序列化成功，必须满足两个条件：

        1、该类必须实现 java.io.Serializable 接口;

        2、该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的;
     */
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCHeck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }

    /*
        序列化对象:
            ObjectOutputStream 类用来序列化一个对象，如下的 SerializeDemo 例子实例化了一个 Employee 对象，并将该对象序列化到一个文件中;
            该程序执行后，就创建了一个名为 employee.ser 文件。该程序没有任何输出，但是你可以通过代码研读来理解程序的作用;
     */

    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Jack";
        e.address = "Bei Jin";
        e.SSN = 12345678;
        e.number = 101;

        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(e);

            out.close();

            fileOut.close();

            System.out.println("Serialized data is saved in /tmp/employee.ser");

        }catch (IOException i){
            i.printStackTrace();
        }
    }

}
