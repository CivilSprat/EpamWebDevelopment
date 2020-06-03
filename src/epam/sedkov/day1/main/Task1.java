package epam.sedkov.day1.main;

import epam.sedkov.day1.console.OrdinaryPrinter;
import epam.sedkov.day1.service.NumericService;

public class Task1 {
    public static void main(String[] args) {
        NumericService numericService = new NumericService();
        OrdinaryPrinter printer = new OrdinaryPrinter();

        // Good result
        try {
            printer.printLastDigit(numericService.receiveLastSquaredDigit(numericService.receiveLastDigit(242)));
            printer.printLastDigit(numericService.receiveLastSquaredDigit(numericService.receiveLastDigit(" 125459312423677  ")));
        } catch (Exception e) {
            printer.printException(e);
        }

        // Bad result
        try {
            printer.printLastDigit(numericService.receiveLastSquaredDigit(numericService.receiveLastDigit("Hello Java!!!")));
        } catch (Exception e) {
            printer.printException(e);
        }
    }
}
