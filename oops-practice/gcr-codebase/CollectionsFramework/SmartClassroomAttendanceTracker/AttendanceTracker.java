package GcrCodeBase.CollectionsFramework.SmartClassroomAttendanceTracker;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class AttendanceTracker {

    private HashMap<String, ArrayList<String>> attendanceMap;

    public AttendanceTracker() {
        attendanceMap = new HashMap<>();
    }

    public void markAttendance(String subject, String student) {
        String normalizedSubject = subject.trim().toUpperCase();
        String normalizedStudent = student.trim();

        if (!attendanceMap.containsKey(normalizedSubject)) {
            attendanceMap.put(normalizedSubject, new ArrayList<>());
        }

        ArrayList<String> students = attendanceMap.get(normalizedSubject);

        if (students.contains(normalizedStudent)) {
            System.out.println("REJECTED: Attendance already marked for " + normalizedStudent + " in " + normalizedSubject);
        } else {
            students.add(normalizedStudent);
            System.out.println("SUCCESS: Attendance marked for " + normalizedStudent + " in " + normalizedSubject);
        }
    }

    public void displayAttendanceRecords() {
        System.out.println("\n--- Classroom Attendance Records ---");
        if (attendanceMap.isEmpty()) {
            System.out.println("No attendance records found.");
            return;
        }

        for (Map.Entry<String, ArrayList<String>> entry : attendanceMap.entrySet()) {
            System.out.println("Subject: " + entry.getKey());
            ArrayList<String> students = entry.getValue();

            if (students.isEmpty()) {
                System.out.println("  No students present.");
            } else {
                for (String student : students) {
                    System.out.println("  - " + student);
                }
            }
            System.out.println("  Total Present: " + students.size());
            System.out.println();
        }
        System.out.println("------------------------------------");
    }
}