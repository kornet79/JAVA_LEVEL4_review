package Object.Object_toString.실습3;

public class Dog {

    public String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public String dogInfo() {
        return "Dog{" +
                "dogName='"+ dogName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName= '" + dogName + '\''+
                ", age= " + age +
                '}';
    }
}
