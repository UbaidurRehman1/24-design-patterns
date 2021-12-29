package structural.composite;

public class Client {

    public static void main(String[] args) {
        Resource company = new Team(1, "Techno-soft");

        Resource javaTeam = new Team(2, "Java Team");
        Resource ubaid = new Employee(4, "ubaid", 9);
        Resource rizwan = new Employee(5, "rizwan", 1.5);
        javaTeam.add(ubaid);
        javaTeam.add(rizwan);
        company.add(javaTeam);
        
        Resource qaTeam = new Team(3, "QA Team");
        Resource afeef = new Employee(6, "afeef", 2);
        Resource musab = new Employee(7, "musab", 3);
        qaTeam.add(afeef);
        qaTeam.add(musab);
        company.add(qaTeam);

        System.out.printf("%s\n", company.getInfo());
        
    }
}
