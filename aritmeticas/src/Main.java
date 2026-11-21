public class Main {
    public static void main(String[] args) {
        // 10 + 20 + 30
        Sum expressao1 = new Sum(new Number(10), new Number(20));
        expressao1.add(new Number(30));
        System.out.println("10 + 20 + 30 = " + expressao1.evaluate());

        // (10 + 20) * 5
        Sum soma2 = new Sum(new Number(10), new Number(20));
        Multiplication expressao2 = new Multiplication(soma2, new Number(5));
        System.out.println("(10 + 20) * 5 = " + expressao2.evaluate());

        // (100 - 20) / (5 + 3)
        Subtraction subtracao3 = new Subtraction(new Number(100), new Number(20));
        Sum soma3 = new Sum(new Number(5), new Number(3));
        Division expressao3 = new Division(subtracao3, soma3);
        System.out.println("(100 - 20) / (5 + 3) = " + expressao3.evaluate());

        // ((10 + 20) * 5) - ((100 / 4) + 7)
        Sum soma4 = new Sum(new Number(10), new Number(20));
        Multiplication multiplicacao4 = new Multiplication(soma4, new Number(5));
        Division divisao4 = new Division(new Number(100), new Number(4));
        Sum outraSoma4 = new Sum(divisao4, new Number(7));
        Subtraction expressao4 = new Subtraction(multiplicacao4, outraSoma4);
        System.out.println("((10 + 20) * 5) - ((100 / 4) + 7) = " + expressao4.evaluate());

        // (10 + 20) * (50 - 5)
        Sum soma5 = new Sum(new Number(10), new Number(20));
        Subtraction subtracao5 = new Subtraction(new Number(50), new Number(5));
        Multiplication expressao5 = new Multiplication(soma5, subtracao5);
        System.out.println("(10 + 20) * (50 - 5) = " + expressao5.evaluate());
    }
}
