/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labgraderecord;

/**
 *
 * @author GUERRA_CPE113
 */
public class LabGradeRecordMain {
       public static void main(String[] args) {
        LabGradeRecord ana = new LabGradeRecord("Ana", 80, 90);
        showRecord(ana);

        // 2. Create Ben’s record with quiz 101 and lab 85 -> 51.0; not passing
        LabGradeRecord ben = new LabGradeRecord("Ben", 101, 85);
        showRecord(ben);

        // 3. Update Ana’s scores to 95 and 101 -> false; grade stays 86.0
        System.out.println("Update Ana to 95 and 101: " + ana.updateScores(95, 101));
        showRecord(ana);

        // 4. Update Ana’s scores to 74 and 75 -> true; 74.6; not passing
        System.out.println("Update Ana to 74 and 75: " + ana.updateScores(74, 75));
        showRecord(ana);

        // 5. Update Ana’s scores to 75 and 75 -> true; 75.0; passing
        System.out.println("Update Ana to 75 and 75: " + ana.updateScores(75, 75));
        showRecord(ana);

        // 6. Check Ben’s record again -> Still 51.0; not passing
        showRecord(ben);
    }

    private static void showRecord(LabGradeRecord record) {
        String status = record.isPassing() ? "passing" : "not passing";
        System.out.printf("%s: %.1f; %s%n",
                record.getStudentName(),
                record.getFinalGrade(),
                status);
    }
}