import java.util.Scanner;

interface Resume {
    // TODO: Declare method void biodata();
    void biodata();
}

class Teacher implements Resume {
    // Attributes
    String name;
    String qualification;
    int experience;

    // TODO: Implement biodata() method to print details in the required format
    @Override
    public void biodata() {
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
    }
}

public class InterfaceResume {
    public static void main(String[] args) {
        // TODO: Read input (Name, Qualification, Experience)
        // Assign to teacher object attributes
        
        // TODO: Call teacher.biodata()
    
        Scanner sc = new Scanner(System.in);
        Teacher teacher = new Teacher();
        
        teacher.name = sc.nextLine();
        teacher.qualification = sc.nextLine();
        teacher.experience = sc.nextInt();
        
        teacher.biodata();
        sc.close();
    }
}
