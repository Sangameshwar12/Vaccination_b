package com.example.Dosify.dto.RequestDTO;

import com.example.Dosify.Enum.Gender;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DoctorRequestDto {

    int centerId;

    String name;

    int age;

    String contactNo;

    String emailId;

    Gender gender;


}
