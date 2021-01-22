package com.theyellowpug.meskit.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TestData {
    @GeneratedValue
    @Id
    Long id;

    String text;
}
