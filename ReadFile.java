import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

@SuppressWarnings("unchecked")

public class ReadFile {
    public void WriteObj(Vector<Animal> wo, ObjectOutputStream OOS ) throws IOException {
        Vector<Animal> ar = new Vector<>();
        ar = wo;
        ObjectOutputStream oos = OOS;
        oos.writeObject(ar);
        oos.close();
    }

    public void ReadData(ObjectInputStream Ois) throws IOException, ClassNotFoundException, ClassCastException {
        ObjectInputStream ois = Ois;
        Vector<Animal> tmpVec = new Vector<>();
        tmpVec = (Vector<Animal>) ois.readObject();
        for (Animal ani : tmpVec) {
            System.out.println("\n" + ani.getName() + " {" + "\n" + "ID : " + ani.getID() + "\n" + "Class: " + ani.getFamily()+ "\n" + "Weight : " + ani.getWeight() + "\n" + "Age : " + ani.getAge() + "\n" + "}");
        }
        ois.close();
    }

    public Vector<Animal> DeleteByID(String id, Vector<Animal> vector) throws IOException, ClassNotFoundException {
        Vector<Animal> array = vector;
        for (Animal ani : array) {
            if (ani.getID().equals(id)) {
                array.remove(ani);
            }
        }
        return array;
    }

    public Vector<Animal> EditByName(String name, Vector<Animal> vector) {
        Vector<Animal> array = vector;
        for(Animal ani:array) {
            if (ani.getName().equals(name)) {
                System.out.println("What Would you like to change?\n");
                System.out.println("type [ Name ] to change the Name\n");
                System.out.println("type [ Class ] to change the Class\n");
                System.out.println("type [ Weight ] to change the Weight\n");
                System.out.println("type [ Age ] to change the Age\n");
                System.out.println("type [ ID ] to change the ID\n");
                System.out.println("type [ All ] to change the All\n");
                Scanner scan = new Scanner(System.in);
                String ans = scan.nextLine();
                scan.close();

                if (ans.equalsIgnoreCase("Name")) {
                    System.out.println("Give the New Name\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setName(tmp);

                } else if (ans.equalsIgnoreCase("ID")) {
                    System.out.println("Give the New ID\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setID(tmp);
                } else if (ans.equalsIgnoreCase("Class")) {
                    System.out.println("Give the New Class\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setFamily(tmp);
                } else if (ans.equalsIgnoreCase("Age")) {
                    System.out.println("Give the New Age\n");
                    Scanner tmpScan = new Scanner(System.in);
                    int tmp = tmpScan.nextInt();
                    tmpScan.close();
                    ani.setAge(tmp);
                } else if (ans.equalsIgnoreCase("Weight")) {
                    System.out.println("Give the New Weight\n");
                    Scanner tmpScan = new Scanner(System.in);
                    Double tmp = tmpScan.nextDouble();
                    tmpScan.close();
                    ani.setWeight(tmp);
                } else if (ans.equalsIgnoreCase("All")) {

                    System.out.println("Give the New Name\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();

                    System.out.println("Give the New ID\n");
                    Scanner tmpScan0 = new Scanner(System.in);
                    String tmp0 = tmpScan.nextLine();

                    System.out.println("Give the New (Class/Family)"+"\n");
                    Scanner tmpScan1 = new Scanner(System.in);
                    String tmp1 = tmpScan.nextLine();

                    System.out.println("Give the New Weight\n");
                    Scanner tmpScan2 = new Scanner(System.in);
                    Double tmp2 = tmpScan.nextDouble();
                    
                    System.out.println("Give the New Age\n");
                    Scanner tmpScan3 = new Scanner(System.in);
                    int tmp3 = tmpScan.nextInt();

                    System.out.println("\n" + ani.getName() + " {" + "\n" + "ID : " + ani.getID() + "\n" + "Class: " + ani.getFamily()+ "\n" + "Weight : " + ani.getWeight() + "\n" + "Age : " + ani.getAge() + "\n" + "}"+"\n");
                    System.out.println("\n"+"Would You like to save the changes? ( Y || N )"+"\n");
                    Scanner tmpScan4 = new Scanner(System.in);
                    String tmp4 = tmpScan.nextLine();
                    if (tmp4.equals("Y")) {
                        ani.setName(tmp);
                        ani.setID(tmp0);
                        ani.setFamily(tmp1);
                        ani.setWeight(tmp2);
                        ani.setAge(tmp3);

                        tmpScan.close();
                        tmpScan0.close();
                        tmpScan1.close();
                        tmpScan2.close();
                        tmpScan3.close();
                        tmpScan4.close();
                    }   
                } else {
                    System.out.println("Error Occured\n");
                }
            }
        }
        return array;
        
    }
    public Vector<Animal> EditByID(String ID, Vector<Animal> vector) {

        Vector<Animal> array = vector;
        for(Animal ani:array) {
            if (ani.getID().equals(ID)) {
                System.out.println("What Would you like to change?\n");
                System.out.println("type [ Name ] to change the Name\n");
                System.out.println("type [ Class ] to change the Class\n");
                System.out.println("type [ Weight ] to change the Weight\n");
                System.out.println("type [ Age ] to change the Age\n");
                System.out.println("type [ ID ] to change the ID\n");
                System.out.println("type [ All ] to change the All\n");
                Scanner scan = new Scanner(System.in);
                String ans = scan.nextLine();
                scan.close();

                if (ans.equalsIgnoreCase("Name")) {
                    System.out.println("Give the New Name\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setName(tmp);

                } else if (ans.equalsIgnoreCase("ID")) {
                    System.out.println("Give the New ID\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setID(tmp);
                } else if (ans.equalsIgnoreCase("Class")) {
                    System.out.println("Give the New Class\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();
                    tmpScan.close();
                    ani.setFamily(tmp);
                } else if (ans.equalsIgnoreCase("Age")) {
                    System.out.println("Give the New Age\n");
                    Scanner tmpScan = new Scanner(System.in);
                    int tmp = tmpScan.nextInt();
                    tmpScan.close();
                    ani.setAge(tmp);
                } else if (ans.equalsIgnoreCase("Weight")) {
                    System.out.println("Give the New Weight\n");
                    Scanner tmpScan = new Scanner(System.in);
                    Double tmp = tmpScan.nextDouble();
                    tmpScan.close();
                    ani.setWeight(tmp);
                } else if (ans.equalsIgnoreCase("All")) {

                    System.out.println("Give the New Name\n");
                    Scanner tmpScan = new Scanner(System.in);
                    String tmp = tmpScan.nextLine();

                    System.out.println("Give the New ID\n");
                    Scanner tmpScan0 = new Scanner(System.in);
                    String tmp0 = tmpScan.nextLine();

                    System.out.println("Give the New (Class/Family)"+"\n");
                    Scanner tmpScan1 = new Scanner(System.in);
                    String tmp1 = tmpScan.nextLine();

                    System.out.println("Give the New Weight\n");
                    Scanner tmpScan2 = new Scanner(System.in);
                    Double tmp2 = tmpScan.nextDouble();
                    
                    System.out.println("Give the New Age\n");
                    Scanner tmpScan3 = new Scanner(System.in);
                    int tmp3 = tmpScan.nextInt();

                    System.out.println("\n" + ani.getName() + " {" + "\n" + "ID : " + ani.getID() + "\n" + "Class: " + ani.getFamily()+ "\n" + "Weight : " + ani.getWeight() + "\n" + "Age : " + ani.getAge() + "\n" + "}"+"\n");
                    System.out.println("\n"+"Would You like to save the changes? ( Y || N )"+"\n");
                    Scanner tmpScan4 = new Scanner(System.in);
                    String tmp4 = tmpScan.nextLine();
                    if (tmp4.equals("Y")) {
                        ani.setName(tmp);
                        ani.setID(tmp0);
                        ani.setFamily(tmp1);
                        ani.setWeight(tmp2);
                        ani.setAge(tmp3);

                        tmpScan.close();
                        tmpScan0.close();
                        tmpScan1.close();
                        tmpScan2.close();
                        tmpScan3.close();
                        tmpScan4.close();
                    }   
                } else {
                    System.out.println("Error Occured\n");
                }

            }
        }
        return array;
    }
}