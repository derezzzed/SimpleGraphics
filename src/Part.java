import java.awt.*;

public class Part {

    private int score;
    private Color color;
    private int count;

    Part(int score, Color color, int count) {
        this.score = score;
        this.color = color;
        this.count = count;
    }

    public int getScore() {
        return score;
    }

    public Color getColor() {
        return color;
    }

    public int getCount() {
        return count;
    }
}
