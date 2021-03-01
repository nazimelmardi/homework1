package logic;

import logic.tipcreator.TipCreator;
import util.ConsoleReader;
import util.FileHandler;
import util.XmlFileProcess;
import util.XmlValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TipCreatorService {

    public static void createQuickTip() {
        String filename = ConsoleReader.getFilename();
        List<Integer> paramNumbers = ConsoleReader.getParamNumbers();

        String text = FileHandler.read2(filename);
        XmlValidator xmlValidator = new XmlValidator();
        //boolean isValid = xmlValidator.isValid(text);
        List<Integer> numbers = new ArrayList<>();
            XmlFileProcess xmlFileProcess = new XmlFileProcess();
            List<Integer> x = xmlFileProcess.getParamNumbers(text);
            numbers.add(x.get(0));
            numbers.add(x.get(1));
            if (x.get(2) == null) {
                numbers.add(0);
            } else {
                numbers.add(x.get(2));
            }

        TipCreator tipCreator = TipCreatorFactory.getTipCreator(paramNumbers.get(1));
        for (int i = 0; i < paramNumbers.get(0); i++) {
            Map<Integer, List<Integer>> tickets = tipCreator.createTip(numbers.get(0),numbers.get(1),numbers.get(2));
            for (int j = 0; j < tickets.size(); j++) {
                System.out.println("The ticket number: " + j);
                System.out.println("Numbers: " + tickets.values());
            }
        }
    }

}
