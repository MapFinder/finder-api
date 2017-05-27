package com.finder.model;

import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="APP_ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name="NAME", nullable = false)
    private String description;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
