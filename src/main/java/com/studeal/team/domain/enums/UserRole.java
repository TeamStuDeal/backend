package com.studeal.team.domain.enums;

public enum UserRole {
    STUDENT,
    TEACHER,
    ADMIN;

    public static UserRole fromString(String role) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.name().equalsIgnoreCase(role)) {
                return userRole;
            }
        }
        throw new IllegalArgumentException("Unknown role: " + role);
    }
}
