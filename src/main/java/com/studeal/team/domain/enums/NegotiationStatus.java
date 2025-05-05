package com.studeal.team.domain.enums;

public enum NegotiationStatus {
    PENDING,
    ACCEPTED,
    REJECTED,
    COMPLETED,
    CANCELLED;

    public static NegotiationStatus fromString(String status) {
        for (NegotiationStatus negotiationStatus : NegotiationStatus.values()) {
            if (negotiationStatus.name().equalsIgnoreCase(status)) {
                return negotiationStatus;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + status);
    }
}