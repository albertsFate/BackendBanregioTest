package com.example.demobackend.entity;


import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;

@Component
@Entity
@Data
@Table(name = "T_producto", schema = "public")
public class Producto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "I_idPro")
    private int idprod;

    @Column(name = "V_nombrePro")
    private String pro_nombre;


    @Column(name = "I_precioPro")
    private double pro_precio;
}
