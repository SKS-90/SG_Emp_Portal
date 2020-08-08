package com.employee.portal.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
@Data
public class Employee {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
	private String lastName;

    @Column(name="gender")
	private String gender;

    @Column(name="dateOfBirth")
	private String dateOfBirth;

    @Column(name="department")
	private String department;
}
