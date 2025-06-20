package com.example.gym;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private Float weight;
    private Float height;
    private String phone;
    private String email;
    @Column(length = 1000)
    private String address;
}