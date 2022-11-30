package com.example.nbpdownloader.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "cena_zlota")
public class CenaZlota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "data_wstawienia")
    Date data;

    @Column(name = "cena")
    Float cena;
}

