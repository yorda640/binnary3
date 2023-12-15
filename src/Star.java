import java.util.Arrays;

class Star implements Comparable<Star> {
    private String name;
    private double magnitude;
    private double distance;

    public Star(String name, double magnitude, double distance) {
        this.name = name;
        this.magnitude = magnitude;
        this.distance = distance;
    }

    public double getMagnitude() {
        return magnitude;
    }

    // Implement Comparable interface based on magnitude
    public int compareTo(Star other) {
        return Double.compare(this.magnitude, other.getMagnitude());
    }

    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", magnitude=" + magnitude +
                ", distance=" + distance +
                '}';
    }
}

