import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody
{
    private final String name;
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;


    public String getName() {
        return name;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public HeavenlyBody(String name, double orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();


    }

    public boolean addMoon(HeavenlyBody moon)
    {
        return this.satellites.add(moon);
    }
    public Set<HeavenlyBody> getSatellites()
    {
        return new HashSet<>(this.satellites);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println("o.getClass() is "+ o.getClass());
        System.out.println("this.getClass() is "+this.getClass());
        if (o == null || getClass() != o.getClass()) return false;

        String objName = ((HeavenlyBody) o).getName();
        return this.name.equals(objName);

//        HeavenlyBody that = (HeavenlyBody) o;
//        return Double.compare(that.orbitalPeriod, orbitalPeriod) == 0 && Objects.equals(name, that.name) && Objects.equals(satellites, that.satellites);
        }

    @Override
    public int hashCode() {
        //return super.hashCode();
        System.out.println("HashCode is called");
        return this.name.hashCode();
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, orbitalPeriod, satellites);
//    }
}
