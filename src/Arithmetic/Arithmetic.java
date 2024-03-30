package Arithmetic;

public class Arithmetic <N extends Number, M extends Number>{

    private N num1;
    private M num2;

    public Arithmetic(N num1, M num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add(){
        return num1.doubleValue() + num2.doubleValue();
    }

    public Number subtract(){
        return num1.doubleValue() - num2.doubleValue();
    }

    public Number multiply(){
        return num1.doubleValue() * num2.doubleValue();
    }

    public Number divide(){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Divisor cannot be zero!");

        }
        return num1.doubleValue() / num2.doubleValue();
    }

    public Number getMin(){
        return Math.min(num1.doubleValue(), num2.doubleValue());
    }

    public Number getMax(){
        return Math.max(num1.doubleValue(), num2.doubleValue());
    }
}
