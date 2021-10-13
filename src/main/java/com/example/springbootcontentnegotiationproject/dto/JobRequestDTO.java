package com.example.springbootcontentnegotiationproject.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class JobRequestDTO {


    String jobName;

    int workedPerson;

    boolean isRisky;

}
