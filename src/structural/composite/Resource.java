package structural.composite;

import java.util.Objects;

public abstract class Resource {
    
    private final long id;
    
    public Resource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    
    public abstract String getName();
    public abstract double getExpenditure();
    public abstract String getInfo();

    public abstract void add(Resource resource);
    public abstract void remove(Resource resource);
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resource resource = (Resource) o;
        return id == resource.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
