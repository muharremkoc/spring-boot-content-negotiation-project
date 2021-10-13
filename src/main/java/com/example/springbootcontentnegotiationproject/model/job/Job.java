package com.example.springbootcontentnegotiationproject.model.job;

import com.example.springbootcontentnegotiationproject.model.data.AuditData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "job_tables")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonPropertyOrder({"id","jobName","workedPerson","risky"})
public class Job extends AuditData {

  @Id
  String id;

  String jobName;

  int workedPerson;

  boolean isRisky;





}
