package io.dongsuk.dbatch.common.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="billionairs")
@Getter
@Setter
public class Bilionair {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column(name = "id") int id;
    private @Column(name = "first_name") String first_name;
    private @Column(name = "last_name") String last_name;
    private @Column(name = "career") String career;
}
