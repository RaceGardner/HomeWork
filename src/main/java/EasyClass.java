/**
 * simple class taking in 3 attributes with setters and getters to generate a UML file
 * @author Race Gardner
 * @version 0.1.0
 * @since 09/06/2026
 */

public class EasyClass {

    private Double score;
    private int count;
    private String name;

    /**
     * Base constructor taking 3 attributes
     * @param name a string
     * @param count an int
     * @param score a double
     */
    public EasyClass(String name, int count, Double score) {
        this.score = score;
        this.count = count;
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
