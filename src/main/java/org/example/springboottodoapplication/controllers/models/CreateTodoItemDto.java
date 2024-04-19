package org.example.springboottodoapplication.controllers.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
public class CreateTodoItemDto {

    private String description;

}
