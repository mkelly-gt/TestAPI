package com.mtt.service.request;

import com.mtt.validation.NotHtml;
import org.codehaus.jackson.annotate.JsonProperty;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class CreateTaskRequest {

    @NotBlank(message = "task must have a title")
    @Size(min = 1, max = 100, message = "title must be between 1 and 100 characters long")
    @NotHtml(message = "task title cannot contain html tags")
    private String title;

    @NotBlank(message = "task must have a description")
    @Size(min = 1, max = 100, message = "description must be between 1 and 100 characters long")
    @NotHtml(message = "task description cannot contain html tags")
    private String description;

    private boolean checked;

    @JsonProperty("user_id")
    private Long userId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
