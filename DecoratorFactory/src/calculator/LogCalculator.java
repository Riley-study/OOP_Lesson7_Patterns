package calculator;

public class LogCalculator implements Calculable{
    private Calculable calculable;
    Logger logger;

    public LogCalculator(Calculable calculable, Logger logger) {
        this.calculable = calculable;
        this.logger = logger;
        logger.writeLog("Calculable primary arg: " + calculable.getResult());
    }

    @Override
    public Calculable sum(int arg) {
        logger.writeLog("Sum with arg: " + arg);
        return calculable.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logger.writeLog("Multi with args: " + arg);
        return null;
    }

    @Override
    public int getResult() {
        int result = calculable.getResult();
        logger.writeLog("Result: " + result);
        return result;
    }
}
