package Computer.Display;

public class Display {
    private DisplayType type;
    private int diagonal;
    private int weight;

    public Display(DisplayType type, int diagonal, int weight) {
        this.type = type;
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public DisplayType getType() {
        return type;
    }

    public void setType(DisplayType type) {
        this.type = type;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return
                " \nТип матрицы: " + type + ";" +
                " Диагональ: " + diagonal  + " дюймов" + ";" +
                " Вес: " + weight + "гр.\n" ;

    }
}
