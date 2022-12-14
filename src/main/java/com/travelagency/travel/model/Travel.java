package com.travelagency.travel.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "\"travel\"")
@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Travel implements Serializable {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id_travel;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String place_departure;

    @Column(nullable = false)
    private String place_return;

    @Column(nullable = false)
    private LocalDateTime date_departure;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private int nbr_place;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private double tarif;

    private String activities;

}
