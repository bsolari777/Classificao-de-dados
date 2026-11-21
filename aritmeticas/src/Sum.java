import java.util.ArrayList;

public class Sum extends Expression {
    private ArrayList<Expression> expressoes;

    public Sum(Expression primeiro, Expression segundo) {
        expressoes = new ArrayList<Expression>();
        expressoes.add(primeiro);
        expressoes.add(segundo);
    }

    public void add(Expression expressao) {
        expressoes.add(expressao);
    }

    @Override
    public double evaluate() {
        double resultado = 0;

        for (int i = 0; i < expressoes.size(); i++) {
            resultado = resultado + expressoes.get(i).evaluate();
        }

        return resultado;
    }
}
