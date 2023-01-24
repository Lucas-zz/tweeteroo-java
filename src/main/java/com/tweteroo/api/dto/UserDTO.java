package com.tweteroo.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record UserDTO(
        @NotBlank String username,

        @Pattern(regexp = "/(http(s?):)([/|.|\\w|\\s|-])*\\.(?:jpg|gif|png)/g") String avatar) {
}