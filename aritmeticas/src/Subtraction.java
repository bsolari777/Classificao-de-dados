import java.util.ArrayList;

public class Subtraction extends Expression {
    private ArrayList<Expression> expressoes;

    public Subtraction(Expression primeiro, Expression segundo) {
        expressoes = new ArrayList<Expression>();
        expressoes.add(primeiro);
        expressoes.add(segundo);
    }

    @Override
    public double evaluate() {
        double primeiro = expressoes.get(0).evaluate();
        double segundo = expressoes.get(1).evaluate();
        return primeiro - segundo;
    }
}
