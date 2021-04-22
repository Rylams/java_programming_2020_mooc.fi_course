
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("First Name: ");
            String fName = scanner.nextLine();
            if (fName.isEmpty()){
                break;
            }
            
            System.out.print("Last Name: ");
            String lName = scanner.nextLine();
            
            System.out.print("Identification number: ");
            String id = scanner.nextLine();
            infoCollection.add(new PersonalInformation(fName, lName, id));
        }
        
        System.out.println("");
        for (PersonalInformation infoCollection1 : infoCollection) {
            System.out.println(infoCollection1.getFirstName() + " " + infoCollection1.getLastName());
        }
    }
}
