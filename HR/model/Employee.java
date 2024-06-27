package com.example.HR.model;
//Bu benim model sınıfım
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //bu anotasyon, bu sınıfın bir veritabanı tablosuna karşılık geldiğini belirtir
public class Employee {


    @Id //bu anotasyon "id" alanının birincil anahtar olduğunu belirtir
    @GeneratedValue(strategy = GenerationType.IDENTITY) //bu "id" alanının otomatik olarak artıtılacağını belirtir.

    private Long Id; //çalışanın benzersiz kimliği
    private String name; //çalışanın adı
    private String position; //çalışanın pozisyonu

    //Getter ve Setter metotları
    //Getter özel alanların değerini okumak için kullanılır
    //Setter özel alanların değerini ayarlamak için kullanılır


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

