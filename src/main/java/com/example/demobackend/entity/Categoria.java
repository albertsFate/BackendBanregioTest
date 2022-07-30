package com.example.demobackend.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Data
@Entity
@Table(name = "T_Categoria", schema = "public")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "I_idCat")
    private int cat_idcate;

    @Column(name = "V_nombreCat")
    private String cat_nombre;

    @Column(name = "V_descriCat")
    private String cat_descri;
}
