package Calculator.service;

import Calculator.model.Operation;

public class OperationService {

    public Operation calculate(Operation operation) {

        switch (operation.getOperation()) {

            case "sum":
                double result = operation.getNum1() + operation.getNum2();
                operation.setResult(result);
                return operation;

        }

        throw new IllegalArgumentException();

    }

}
