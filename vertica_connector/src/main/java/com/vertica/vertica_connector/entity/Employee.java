package com.vertica.vertica_connector.entity;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "employees")
// @Data
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    // Other employee fields, getters, setters
}