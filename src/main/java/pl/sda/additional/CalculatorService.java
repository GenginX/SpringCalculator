package pl.sda.additional;

import org.springframework.stereotype.Service;

@Service //to spowoduje utworzenie Singletona w Springu
public class CalculatorService {
    public CalculatorService() {
        System.out.println("tworze nowy obiekt");
    }

    public int calculate (String text){
        String[] splitValues = text.split("\\+");
        int a = Integer.parseInt(splitValues[0].trim());
        int b = Integer.parseInt(splitValues[1].trim());
        return a+b;
    }
}
