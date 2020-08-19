public class Calculator {
    public Integer addition(Integer x, Integer y){
        return x+y;
    }
    public Integer subtraction(Integer x, Integer y) {
        return x - y;
    }
    public Integer division(Integer x, Integer y) {
        if (y == 0) {
            System.out.println("Ошибка! Нельзя делить на '0'.");
            //System.exit(0);
        }
        return y;
    }
    public Integer multiplication(Integer x, Integer y) {
        return x * y;
    }
    public Integer action(Integer x, Integer y, String operator){
        return switch (operator) {
            case "+" -> this.addition(x, y);
            case "-" -> this.subtraction(x, y);
            case "*" -> this.multiplication(x, y);
            case "/" -> this.division(x, y);
            default -> throw new IllegalArgumentException("Неверный знак оператора!");
        };
    }
}
