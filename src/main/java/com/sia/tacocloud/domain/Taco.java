package com.sia.tacocloud.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Taco {

    private Long id;

    private Date createAt;

    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @NotNull(message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}
