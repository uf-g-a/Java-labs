package Program;

public class Const implements ALL{
    float cst;
    public Const(float cst){
        this.cst = cst;
    }

    public float result() {
        return cst;
    }

    @Override
    public void evaluate(float x) {

    }
}
