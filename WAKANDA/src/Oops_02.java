public class Oops_02 {
    public static void main(String[] args) {
        Friends f1 = new Friends();
        Friends f2 = new Friends();
        Friends f3 = new Friends();
        Friends f4 = new Friends();
        f1.name = "Debabrata Pasayata";
        f1.age = 23;
        f1.favTeam = "RCB";
        f1.crush = "Rashmika Mandhana";
        f1.favSports = "Cricket";
        f1.getInfo();
        f2.name = "Satyabrata Swain";
        f2.age = 22;
        f2.favSports = "Cricket";
        f2.crush = "MS Dhoni";
        f2.favTeam = "CSK";
        f2.getInfo();
        f3.name = "Abinash Sathpathy";
        f3.age = 24;
        f3.favTeam = "MI";
        f3.crush = "Jacquline";
        f3.favSports = "football";
        f3.getInfo();
        f4.name = "Rashmi Ranjan Nayak";
        f4.age = 25;
        f4.favTeam = "KKR";
        f4.crush = "Alexender Dardario";
        f4.favSports = "PUBG";
        f4.getInfo();
    }
}
class Friends{
    String name;
    int age;
    String favSports;
    String crush;
    String favTeam;
    public void getInfo(){
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
        System.out.println("favourite sports is " + this.favSports);
        System.out.println("Crush is " + this.crush);
        System.out.println("Favourite team is " + this.favTeam);
    }
}
