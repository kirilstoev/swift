

public class Person {

    String name;
    int age;

    Person() {
        name = "No name";
        age = -1;
    }

    Person(String name) {
        this.name = name;
        age = -1;
    }

    Person(String name, int age) {
        this.name = name;
        if (0 < age && age < 150) {
            this.age = age;
        } else {
            this.age = -1;
            System.out.format("%d is not a valid value for age.", age);
        }
    }

    void setAge(int age) {
        if (0 < age && age < 150) {
            this.age = age;
        } else {
            this.age = -1;
            System.out.format("%d is not a valid value for age.", age);
        }
    }

    public int gettAge() {
        return age;
    }

    //setter
    void setName(String name) {
        //svoistva
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    //checker
    boolean isAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    void printMsg() {
        if (name != null && age == 0) {
            System.out.format("Hello, I am %s. I am %d years old.", name, age);
        } else if (name != null) {
            System.out.format("Hello, I am %s.", name);
        } else {
            System.out.format("Hello, I am John Doe/n");
        }
    }

    String getDescription() {
        if (name == "No Name" && age == -1) {
            return "I am John Doe.";
        } else if (age == -1) {
            return "I am " + name + ".";
        } else {
            return "I am " + name + ". I am " + age + " years old.";
        }

    }

}
