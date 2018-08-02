package design_patterns_2.memento;

import java.time.Instant;
import java.util.Date;

public class Test {

    public static void main(String[] args) {

        Historic historic = new Historic();

        Contract contract = new Contract(Date.from(Instant.now()), "Mark", Types.NEW);
        historic.add(contract.saveState());

        contract.advance();
        historic.add(contract.saveState());

        contract.advance();
        historic.add(contract.saveState());

        contract.advance();
        historic.add(contract.saveState());

        System.out.println(contract.getType());
        contract.restoreState(historic.get(1));
        System.out.println(contract.getType());

    }

}
