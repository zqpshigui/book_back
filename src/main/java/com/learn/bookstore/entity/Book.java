package com.learn.bookstore.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Data
@Getter
@Setter
@Table(name = "book_info")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String  name;
    private String  author;
    private String  isbn;
    private Float  price;
    private String  img;
    private String  intro;
    private Integer stock;

}
