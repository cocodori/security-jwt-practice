package com.jwttutorial.entity;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor @NoArgsConstructor
@Builder
@Getter @Setter
@Entity
public class Authority {
    @Id @Column(name = "authority_name", length = 50)
    private String authorityName;
}
