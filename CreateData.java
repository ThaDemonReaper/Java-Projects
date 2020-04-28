
//* Here is the import of the libraries that i am using
import java.util.Scanner;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

@SuppressWarnings("unchecked")



public class CreateData {

public static void main(final String[] args) throws IOException, ClassNotFoundException, ClassCastException {
    
    File F = new File("Data.Ser");
    FileOutputStream out = new FileOutputStream(F);
    FileInputStream fin = new FileInputStream(F);
    ObjectInputStream ois = new ObjectInputStream(fin);
    ObjectOutputStream oos = new ObjectOutputStream(out);
    Vector<Animal> mainVector = (Vector<Animal>) ois.readObject();


//* Here is the variable declaration
    String animalName;
    String id;
    String animalClass;
    double Weight;
    int age; 
    String tmpAns;

    Vector<Animal> v = new Vector<>();

//* here We Get The User's Input To Choose What He/She Want To Do With Program

    Scanner start = new Scanner(System.in);
    System.out.println("Press C To Create Animals");
    System.out.println("Press D To Delete An Animal");
    System.out.println("Press R To Read All Animals");
    System.out.println("Press I To Edit An Animal By Entering The ID Of The Animal");
    System.out.println("Press N To Edit An Animal By Entering The Name Of The Animal");
    String StartAns = start.nextLine();


if (StartAns.equalsIgnoreCase("C")) {
do {
//Here We Get Users Input To Create The Animal Object
    final Scanner kb0 = new Scanner(System.in);
    System.out.println("Give the Name of the Animal");
    animalName = kb0.nextLine();

    final Scanner kb1 = new Scanner(System.in);
    System.out.println("Give the ID of the Animal");
    id = kb1.nextLine();

    final Scanner kb2 = new Scanner(System.in);
    System.out.println("Give the Weight of the Animal");
    Weight = kb2.nextDouble();

    final Scanner kb3 = new Scanner(System.in);
    System.out.println("Give the Class that the animal belongs");
    animalClass = kb3.nextLine();

    final Scanner kb4 = new Scanner(System.in);
    System.out.println("Give the Age of the Animal");
    age = kb4.nextInt();

    Animal AniObj = new Animal(animalName, id, animalClass, age, Weight);

    v.add(AniObj);

    System.out.println("\n"+animalName + " {" + "\n" + "ID : " + id + "\n" + "Class: " + animalClass + "\n" + "Weight : "+ Weight + "\n" + "Age : " + age + "\n" + "}");

    animalClass="";
    animalName="";
    id="";
    age=0;
    Weight = 0.0;

    Scanner kb5 = new Scanner(System.in);
    System.out.println("Would you Like to continue? [ Yes | yes ] || [ No | no ]");
    tmpAns = kb5.nextLine();
    
    
    

} 
while (tmpAns.equalsIgnoreCase("Yes")) ;

String tmpAns1;
Scanner kb6 = new Scanner(System.in);
System.out.println("Would you Like to Save the Animals? [ Y | y ] || [ N | n ]");
tmpAns1 = kb6.nextLine();
kb6.close();


if (tmpAns1.equalsIgnoreCase("y")) {
    ReadFile writeO = new ReadFile();
    writeO.WriteObj(v,oos);
    System.out.println("\nData has been Saved");
}
}
else if (StartAns.equalsIgnoreCase("R")) {
    ReadFile rd = new ReadFile();
    rd.ReadData(ois);
}
else if (StartAns.equalsIgnoreCase("D")) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give The ID Of The Animal That You Like To Delete");
    String tmp = scan.nextLine();
    ReadFile rd = new ReadFile();
    mainVector = rd.DeleteByID(tmp, mainVector);
    scan.close();


} else if (StartAns.equalsIgnoreCase("N")) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give The Name Of The Animal That You Like To Edit");
    String tmp = scan.nextLine();
    ReadFile rd = new ReadFile();
    mainVector = rd.EditByName(tmp,mainVector);
    scan.close();

} else if (StartAns.equalsIgnoreCase("I")) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Give The ID Of The Animal That You Like To Edit");
    String tmp = scan.nextLine();
    ReadFile rd = new ReadFile();
    rd.EditByID(tmp,mainVector);
    scan.close();
} else {
    System.out.println("Error Occured , Please Try Again"+"\n");
}
oos.writeObject(mainVector);
start.close();
oos.close();



    }
}