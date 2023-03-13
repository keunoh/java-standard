package collectionsframework;

import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));

        Person2 p = new Person2("Kaltz", 20);
        int hashCode1 = p.hashCode();
        int hashCode2 = p.hashCode();

        p.age = 30;
        int hashCode3 = p.hashCode();

        System.out.println("hashCode1 = " + hashCode1);
        System.out.println("hashCode2 = " + hashCode2);
        System.out.println("hashCode3 = " + hashCode3);

        System.out.println(set);
    }
}

class Person2 {
    String name;
    int age;

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person2) {
            Person2 tmp = (Person2) obj;
            return name.equals(tmp.name) && age == tmp.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name + age).hashCode();
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
