package calculator;

public class LogCalculatableFactory implements ICalculableFactory{
    Logger logger;

    public LogCalculatableFactory(Logger logger) {
        this.logger = logger;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(new Calculator(primaryArg), logger);
    }
}
