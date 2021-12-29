package structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team  extends Resource {

    private final List<Resource> resources = new ArrayList<>();
    private final String name;

    public Team(long id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getExpenditure() {
        return resources
            .stream()
            .map(Resource::getExpenditure)
            .reduce(Double::sum)
            .orElse(-1D);
    }

    @Override
    public String getInfo() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n----------------------------%s-----------------------------\n".formatted(getName()));
        String info = resources
            .stream()
            .map(Resource::getInfo)
            .collect(Collectors.joining());
        double expenditureSum = resources
            .stream()
            .map(Resource::getExpenditure)
            .reduce(0D, Double::sum);
        builder.append("Total Expenditure: %.2f\n".formatted(expenditureSum));
        builder.append(info).append("\n");
        return builder.toString();
    }

    @Override
    public void add(Resource resource) {
        resources.add(resource);
    }

    @Override
    public void remove(Resource resource) {
        resources.remove(resource);
    }
}
