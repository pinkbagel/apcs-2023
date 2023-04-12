package unit11;

// 2019 FRQ #2
// https://apcentral.collegeboard.org/media/pdf/ap19-frq-computer-science-a.pdf#page=7
public class StepTracker {
    
    private int days; //to store # of days
    private int activeDays; //store # active days
    private int totalSteps; //store # total steps
    private int minActive; //minimum number of steps that must be taken for a day to be considered active

    public StepTracker(int minActive){
        this.minActive = minActive;
        days= 0;
        activeDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int steps){ //"accumulates info about steps"
        if (steps>=minActive){
            activeDays++;
        }
        days++;
        totalSteps += steps;
    }  
    public int activeDays(){ //accessor
        return activeDays;
        }

    public double averageSteps(){
        if (days==0){
            return 0;
        }
        return (totalSteps/(double)days);
    }

    public static void check(boolean test) throws AssertionError {
        if (!test)
            throw new AssertionError("bad panda");
    }

    public static void main(String[] args) {
        //uncomment the following lines to test your code
        StepTracker tr = new StepTracker(10000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 0.0);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        check(tr.activeDays() == 0);
        check(tr.averageSteps() == 7000.0);
        tr.addDailySteps(13000);
        check(tr.activeDays() == 1);
        check(tr.averageSteps() == 9000.0);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        check(tr.activeDays() == 2);
        check(tr.averageSteps() == 10222.2);
        System.out.println("Happy Panda! \uD83D\uDC3C");
    }
}
