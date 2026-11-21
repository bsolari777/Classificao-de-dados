import java.util.ArrayList;

public class Multiplication extends Expression {
    private ArrayList<Expression> expressoes;

    public Multiplication(Expression primeiro, Expression segundo) {
        expressoes = new ArrayList<Expression>();
        expressoes.add(primeiro);
        expressoes.add(segundo);
    }

    public void add(Expression expressao) {
        expressoes.add(expressao);
    }

    @Override
    public double evaluate() {
        double resultado = 1;

        for (int i = 0; i < expressoes.size(); i++) {
            resultado = resultado * expressoes.get(i).evaluate();
        }

        return resultado;
    }
}
