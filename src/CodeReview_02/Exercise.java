package CodeReview_02;

public class Exercise {
    private String exerciseName;
    private String exerciseDescription;
    private double exerciseDuration;
    private String exercisePosition;

    public Exercise(String exerciseName, String exerciseDescription, double exerciseDuration, String exercisePosition) {
        this.exerciseName = exerciseName;
        this.exerciseDescription = exerciseDescription;
        this.exerciseDuration = exerciseDuration;
        this.exercisePosition = exercisePosition;
    }

    public Exercise() {}

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }

    public double getExerciseDuration() {
        return exerciseDuration;
    }

    public void setExerciseDuration(double exerciseDuration) {
        this.exerciseDuration = exerciseDuration;
    }

    public String getExercisePosition() {
        return exercisePosition;
    }

    public void setExercisePosition(String exercisePosition) {
        this.exercisePosition = exercisePosition;
    }

    public void printExercise() {
        System.out.println(exerciseName + "\t" + "DURATION: " + exerciseDuration + " seconds.");
        System.out.println("--------------------------------------------------");
        System.out.println("DESCRIPTION: " + exerciseDescription);
    }
}
