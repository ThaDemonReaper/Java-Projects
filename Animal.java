import java.io.Serializable;

public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    String Name;
        String ID;
        String Family;
        int Age;
        double weight;
    
    Animal() {

    }

    Animal(String name ,String id , String family , int age , double wght) {
        setName(name);
        setID(id);
        setFamily(family);
        setAge(age);
        setWeight(wght);
    }

    public void setName(String name) {
        this.Name = name;
    }

    public  String getName() {
        return Name;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getID() {
        return ID;
    }

    public void setFamily(String family) {
        this.Family = family;
    }

    public String getFamily() {
        return Family;
    }

    public void setAge(int age) {
        this.Age = age;
    }
    
    public int getAge() {
        return Age;
    }
    public void setWeight(double wght) {
        this.weight = wght;
    }
    public double getWeight() {
        return weight;
    }
    }   