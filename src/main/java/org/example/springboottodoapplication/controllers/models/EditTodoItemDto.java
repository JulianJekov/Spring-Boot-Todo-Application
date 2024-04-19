package org.example.springboottodoapplication.controllers.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EditTodoItemDto {

    private String description;

    private Boolean isComplete;
}
