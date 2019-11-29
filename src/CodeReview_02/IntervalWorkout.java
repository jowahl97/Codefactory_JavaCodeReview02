package CodeReview_02;

public class IntervalWorkout {
    private String pushup;
    private String squat;
    private String plank;
    private int repetitions;
    private double breaktime;

    public IntervalWorkout(String pushup, String squat, String plank, int repetitions, double breaktime) {
        this.pushup = pushup;
        this.squat = squat;
        this.plank = plank;
        this.repetitions = repetitions;
        this.breaktime = breaktime;
    }

    public IntervalWorkout() {

    }

    public String getPushup() {
        return pushup;
    }

    public void setPushup(String pushup) {
        this.pushup = pushup;
    }

    public String getSquat() {
        return squat;
    }

    public void setSquat(String squat) {
        this.squat = squat;
    }

    public String getPlank() {
        return plank;
    }

    public void setPlank(String plank) {
        this.plank = plank;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public double getBreaktime() {
        return breaktime;
    }

    public void setBreaktime(double breaktime) {
        this.breaktime = breaktime;
    }

    public void printIntervalWorkout() {
        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!");
        System.out.println("*****************************");
        for(int i = 0; i < repetitions; i++) {
            System.out.println("=============================");
            System.out.println("Round: " + (i + 1));
            System.out.println(pushup);
            System.out.println(squat);
            System.out.println(plank);
            if (i < (repetitions - 1)) {
                System.out.println("=============================");
                System.out.println("DO THE BREAK: (" + breaktime + " SECONDS)");
            }
        }
        System.out.println("*****************************");
        System.out.println(" CONGRATS - YOU ARE DONE !!!");
        System.out.println("*****************************");
    }
}

