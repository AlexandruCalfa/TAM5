package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
    private String id;
    private String fullName;
    private String cnp;
    private String address;
    private Date birthDate;
    private Date employmentDate;
    private String email;
    private String phone;
    private boolean activityStatus;

    private Position position;
    private Department department;
}
