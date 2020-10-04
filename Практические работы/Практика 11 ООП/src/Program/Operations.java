package Program;

abstract class  Operations implements ALL{
    protected ALL first;
    protected ALL second;
    public Operations(ALL first, ALL second){
        this.first = first;
        this.second = second;

    }
    public void evaluate(float x){
        first.evaluate(x);
        second.evaluate(x);
        System.out.println(result());
    }

}
