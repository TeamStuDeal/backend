package com.studeal.team.domain.user.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TokenDTO {
    private String grantType;   // Bearer
    private String accessToken;
    private String refreshToken;
    private Long accessTokenExpiresIn;
}
