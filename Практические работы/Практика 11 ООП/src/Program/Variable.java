package Program;

public class Variable implements ALL{
    private String variable;
    private float newVariable;
    public Variable(String variable){
        this.variable = variable;
    }
    public float result() {
        return newVariable;
    }

    @Override
    public void evaluate(float x) {
        newVariable = x;
    }
}
