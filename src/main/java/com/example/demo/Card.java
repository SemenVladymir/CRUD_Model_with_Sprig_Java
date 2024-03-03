package com.example.demo;


import jakarta.persistence.*;

@Entity
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Title;
    private String Text;
    private String CreateDate;
    private String Phone;

    public Card() {
        this.Title = "";
        this.Text = "";
        this.CreateDate = "";
        this.Phone = "";
    }

    public Card(String Title, String Text, String CreateDate, String Phone) {
        this.Title = Title;
        this.Text = Text;
        this.CreateDate = CreateDate;
        this.Phone = Phone;
    }

    public String getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(String createDate) {
        CreateDate = createDate;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
