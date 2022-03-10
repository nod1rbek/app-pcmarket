package uz.pcmarket.app_pcmarket.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@MappedSuperclass
@Entity
public abstract class AbsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String model;

    private Double price;
}
