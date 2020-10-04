package Program;

public class Multiply extends Operations{

    public Multiply(ALL first, ALL second) {
        super(first, second);
    }


    public float result(){
        return first.result() * second.result();
    }

}
