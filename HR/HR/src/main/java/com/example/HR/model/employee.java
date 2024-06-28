package com.example.HR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity//Bu anatasyon
public class employee {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id; //primary /benzersiz kimliği


        private String firstName;

        private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String iban;

        private String position;

        // Getter ve Setter metotları
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }


    }


