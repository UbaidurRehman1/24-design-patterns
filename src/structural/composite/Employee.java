package structural.composite;

public class Employee extends Resource {

    private final String name;
    private final double salary;

    public Employee(long id, String name, double salary) {
        super(id);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getExpenditure() {
        return salary;
    }

    @Override
    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", salary=" + salary +
            "}\n";
    }

    @Override
    public void add(Resource resource) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void remove(Resource resource) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
    
}
