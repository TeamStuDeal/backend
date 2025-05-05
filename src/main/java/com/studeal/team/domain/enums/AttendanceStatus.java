package com.studeal.team.domain.enums;

public enum AttendanceStatus {
    PRESENT,
    ABSENT,
    LATE,
    EXCUSED;

    public static AttendanceStatus fromString(String status) {
        for (AttendanceStatus attendanceStatus : AttendanceStatus.values()) {
            if (attendanceStatus.name().equalsIgnoreCase(status)) {
                return attendanceStatus;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + status);
    }
}