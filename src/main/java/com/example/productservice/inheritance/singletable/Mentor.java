package com.example.productservice.inheritance.singletable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter
@Setter
@Entity(name="st_mentor")
@DiscriminatorValue(value = "2")
public class Mentor extends User {
    String company;
    int avgRatings;
}
