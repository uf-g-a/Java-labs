package Program;

public class Add extends Operations{
    public Add(ALL first, ALL second) {
        super(first, second);
    }

    @Override
    public float result() {
        return first.result() + second.result();
    }

}
