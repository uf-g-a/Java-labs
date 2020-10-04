package Program;

public class Subtract extends Operations{
    public Subtract(ALL first, ALL second) {
        super(first, second);
    }

    @Override
    public float result() {
        return first.result() - second.result();
    }

}
