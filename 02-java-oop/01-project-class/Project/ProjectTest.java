public class ProjectTest  {

public static void main(String[] args) {
    Project myFirstProject = new Project("Home", "House planning and construction");
    Project mySecondProject = new Project("Parking Lot");
    Project myThirdProject = new Project();
    Project myFourthProject = new Project("Painting","Paint the entire customers home exterior",20000);

    System.out.println(myFirstProject.getDescription());
    System.out.println(myFirstProject.getName());
    System.out.println(mySecondProject.getName()); 
    System.out.println(mySecondProject.getDescription());
    System.out.println(myThirdProject.getName());
    System.out.println(myThirdProject.getDescription());

    myThirdProject.setDescription("Paint lines in customer's Parking lot");
    System.out.println(mySecondProject.getDescription());

    myThirdProject.setName("drive way");
    System.out.println(myThirdProject.getName());

    myThirdProject.setDescription("pour concrete and make new drive way");
    System.out.println(myThirdProject.getDescription());

    myFourthProject.elevatorPitch();
    myFirstProject.elevatorPitch();


}
}