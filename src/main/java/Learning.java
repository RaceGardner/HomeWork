/**
 * simple class to use addition and subtraction to create a UML file
 * @author Race Gardner
 * @version 0.1.0
 * @since 09/06/2026
 */
public class Learning {
    public static final int VERSION = 42;

    private int x;
    private int y;

    protected String operation;

    double output;

    public Learning(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    /**
     * Performs set operations on parameters x and y
     * @param x an integer
     * @param y an integer
     * @return output a double
     */
    public double operate(int x, int y){
        switch(operation){
            case "addition":
            case "add":
                output = x+y;
                System.out.printf("%d + %d == %f",x,y,output);
                break;
            case "subtraction":
                output = x-y;
                System.out.printf("%d + %d == %f",x,y,output);
                break;
            default:
                output = 0;
                System.out.printf("I don't know what %s is %n", operation);
        }
        return output;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


}