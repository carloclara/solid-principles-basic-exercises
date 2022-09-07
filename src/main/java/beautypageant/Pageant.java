package beautypageant;

import java.util.List;

public class Pageant {

    public static void main(String[] args) {
        CriteriaCalculator criteriaCalculator = new CriteriaCalculator(
            List.of(new Beauty(95), new Talent(99)));

        criteriaCalculator.printScore();
    }

}
