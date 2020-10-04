package Program;

public class Main {
    public static void main(String[] args) {
        new Add(
                new Subtract(
                        new Multiply(
                                new Variable("x"),
                                new Variable("x")
                        ),
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        )
                ),
                new Const(1)
        ).evaluate(2);
    }
}
