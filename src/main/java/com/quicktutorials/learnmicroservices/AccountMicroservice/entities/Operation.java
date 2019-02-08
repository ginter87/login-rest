package com.quicktutorials.learnmicroservices.AccountMicroservice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="operations")
public class Operation {

    //String ID, Date DATE, Double VALUE, String DESCRIPTION, String FK_ACCOUNT1, String FK_ACCOUNT2

    @Id
    @Column(name="ID")
    @NotBlank @NotNull @NotEmpty
    private String id;

    @Column(name="DATE")
    private Date date;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="VALUE")
    @NotNull
    private Double value;

    @Column(name="FK_ACCOUNT1")
    @NotNull @NotBlank @NotEmpty
    private String fkAccount1;

    @Column(name="FK_ACCOUNT2")
    private String fkAccount2;

    @PrePersist
    void getTimeOperation() {
        this.date = new Date();
    }

    public Operation() {
    }

    public Operation(String id, Date date, String description, Double value, String fkAccount1, String fkAccount2) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.value = value;
        this.fkAccount1 = fkAccount1;
        this.fkAccount2 = fkAccount2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getFkAccount1() {
        return fkAccount1;
    }

    public void setFkAccount1(String fkAccount1) {
        this.fkAccount1 = fkAccount1;
    }

    public String getFkAccount2() {
        return fkAccount2;
    }

    public void setFkAccount2(String fkAccount2) {
        this.fkAccount2 = fkAccount2;
    }
}
