package com.sarikaya.security.jwt_token.dto;

import com.sarikaya.security.jwt_token.model.Role;
import lombok.Builder;

import java.util.Set;

@Builder
public record CreateUserRequest(
        String name,
        String username,
        String password,
        Set<Role> authorities
) {
}
