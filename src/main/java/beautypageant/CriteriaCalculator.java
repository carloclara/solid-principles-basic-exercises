package beautypageant;

import java.util.List;

public class CriteriaCalculator {

    private final List<Object> criteria;

    public CriteriaCalculator(List<Object> criteria) {
        this.criteria = criteria;
    }

    public double calculate() {
        double totalScore = 0;
        for (Object cr : criteria) {
            if (cr instanceof Beauty) {
                totalScore += ((Beauty) cr).getScore() * .6;
            } else if (cr instanceof Talent) {
                totalScore += ((Talent) cr).getScore() * .4;
            }
        }
        return totalScore;
    }

    public void printScore() {
        System.out.println("The final score is: " + calculate());
    }

}
