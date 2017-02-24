package task0_classes;

public class Task0_Classes {

    public static void main(String[] args) {
        Person kiril = new Person();
        Person georgi = new Person();

        Person kiril1 = new Person("Kiril");
        Person georgi1 = new Person("Georgi");

        Person kiril2 = new Person("Kiril", 35);
        Person georgi2 = new Person("Georgi", 151);

        System.out.println(kiril.name);
        System.out.println(kiril.age);

        System.out.println(georgi.name);
        System.out.println(georgi.age);

        System.out.println(kiril1.name);
        System.out.println(kiril1.age);

        System.out.println(georgi1.name);
        System.out.println(georgi1.age);

        System.out.println(kiril2.name);
        System.out.println(kiril2.age);

        System.out.println(georgi2.name);
        System.out.println(georgi2.age);

        kiril.setAge(18);
        kiril.setName("KGS");

        georgi.setAge(0);
        georgi.setName("GKS");

        String kName = "";
        String gName = "";

        kiril.getName();
        georgi.getName();

        int kAge=0;
        int gAge=0;
        kiril.gettAge();
        georgi.gettAge();

        kiril.printMsg();
        
        System.out.println(kiril.getDescription());
    }

}
