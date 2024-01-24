package Calculator.console;

import Calculator.model.Operation;
import Calculator.service.OperationService;

public class ConsoleApplication {

    private final OperationService operationService = new OperationService();
    private final ConsoleReader consoleReader = new ConsoleReader();
    private final ConsoleWriter consoleWriter = new ConsoleWriter();

    public void run() {

        consoleWriter.write("Enter num 1");
        double num1 = consoleReader.readNum();
        consoleWriter.write("Enter num 2");
        double num2 = consoleReader.readNum();
        consoleWriter.write("Enter operation");
        String type = consoleReader.readOperationType();
        Operation operation = new Operation(num1, num2, type);
        Operation calculate = operationService.calculate(operation);
        consoleWriter.write("Result = " + calculate.getResult());

    }

}
