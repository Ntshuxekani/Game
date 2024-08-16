package com.personal.codegame.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Challenges {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String loadName;
  private Integer loadPower;
  private  Integer opHours;
  private Integer noOfLoad;
  private  Integer effectiveSun;


  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "user_id")
  @JsonBackReference
  private User user;


}
}
