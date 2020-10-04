package Program;

public class Divide extends Operations{

    public Divide(ALL first, ALL second) {
        super(first, second);
    }

    @Override
    public float result() {
        return first.result() / second.result();
    }


}
