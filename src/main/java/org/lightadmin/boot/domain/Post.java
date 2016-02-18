package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NotBlank
    private String title;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private Integer price;

    @Column
    private String content;

    @Column
    private String mode;

    @NotNull
    @ManyToOne
    private User user;

    @Column(insertable=false, updatable=false, columnDefinition="datetime")
    @org.hibernate.annotations.Generated(value= GenerationTime.INSERT)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(insertable=false, updatable=false, columnDefinition="datetime")
    @org.hibernate.annotations.Generated(value=GenerationTime.ALWAYS)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date updatedAt;



    public Long getId() {
        return id;
    }

}
