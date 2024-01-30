package courseinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CourseInformation {
    public static void main(String args[]) throws IOException {
        Admission newAdmission = new Admission();
        System.out.println("enter the course you are trying to admit in: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String courseName = br.readLine();
        Course obj = newAdmission.admittingCourse(courseName);

        System.out.println("for " + courseName + " the required feee is: ");
        obj.getFeePerSemester();
        System.out.println("for " + courseName + " the duration is: ");
        obj.getDuration();
        System.out.println("the total fee is: ");
        obj.calculateTotalFee();

    }
}
