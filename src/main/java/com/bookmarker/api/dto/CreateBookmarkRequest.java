package com.bookmarker.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateBookmarkRequest {
    //white space(" ") 허용함
    @NotEmpty(message = "Title should not be empty")
    private String title;

    //white space(" ") 허용하지 않음
    @NotBlank(message = "Url should not be empty")
    private String url;
}