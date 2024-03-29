package Calculator.service;

import Calculator.model.Operation;


public class OperationService {

    public Operation calculate(Operation operation) {

        switch (operation.getOperation()) {

            case "sum":
                double result = operation.getNum1() + operation.getNum2();
                operation.setResult(result);

            case "sub":
                double result1 = operation.getNum1() - operation.getNum2();
                operation.setResult(result1);

            case "mul":
                double result2 = operation.getNum1() * operation.getNum2();
                operation.setResult(result2);

            case "div":
                double result3 = operation.getNum1() / operation.getNum2();
                operation.setResult(result3);

            case "pow":
                double result4 = Math.pow(operation.getNum1(), operation.getNum2());
                operation.setResult(result4);


        }

        return operation;

    }

}
