import java.util.ArrayList;

public class Division extends Expression {
    private ArrayList<Expression> expressoes;

    public Division(Expression primeiro, Expression segundo) {
        expressoes = new ArrayList<Expression>();
        expressoes.add(primeiro);
        expressoes.add(segundo);
    }

    @Override
    public double evaluate() {
        double primeiro = expressoes.get(0).evaluate();
        double segundo = expressoes.get(1).evaluate();

        if (segundo == 0) {
            throw new ArithmeticException("Divisao por zero");
        }

        return primeiro / segundo;
    }
}
