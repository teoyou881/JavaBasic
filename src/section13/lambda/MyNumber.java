package section13.lambda;

@FunctionalInterface
//functional interface for lambda should have only one method.
//to avoid compiling error, we can add @FunctionalInterface.
//in that case, we can see an error easily if we add any method to function interface.
public interface MyNumber {
    int getMaxNumber(int num1, int num2);
}
