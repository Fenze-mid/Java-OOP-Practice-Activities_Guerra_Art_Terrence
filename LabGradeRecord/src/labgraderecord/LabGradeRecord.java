/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author GUERRA_CPE113
 */
public class LabGradeRecord {

   private final String studentName;
    private int quizScore;
    private int labScore;

   
    public LabGradeRecord(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;
        this.quizScore = isValid(quizScore) ? quizScore : 0;
        this.labScore = isValid(labScore) ? labScore : 0;
        
    }public boolean updateScores(int quizScore, int labScore) {
        if (isValid(quizScore) && isValid(labScore)) {
            this.quizScore = quizScore;
            this.labScore = labScore;
            return true;
        }
        return false;
    }

   
    public double getFinalGrade() {
        return (this.quizScore * 0.40) + (this.labScore * 0.60);
        
    }  public boolean isPassing() {
        return getFinalGrade() >= 75.0;
        
    }   public String getStudentName() {
        return studentName;
        
    }   private boolean isValid(int score) {
        return score >= 0 && score <= 100;
    }
}
