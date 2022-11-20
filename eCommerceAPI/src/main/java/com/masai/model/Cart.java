package com.masai.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@ToString
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cardId;
    @Transient
    private Integer productId;
    @Transient
    private Integer addressId;
    @Transient
    private Integer userId;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products=new ArrayList<>();
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
    private  Address address;
    @OneToOne(cascade = CascadeType.ALL)
    private Orders orders;

}
