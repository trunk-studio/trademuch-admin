package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "user_place")
public class UserPlace implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserPlacePK id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "user_place_ibfk_1"), insertable = false, updatable = false)
    @NotNull
    private User userId;

    @ManyToOne
    @JoinColumn(name = "place_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "user_place_ibfk_2"), insertable = false, updatable = false)
    @NotNull
    private Place placeId;

    @Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "datetime")
    @org.hibernate.annotations.Generated(value = GenerationTime.INSERT)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @NotNull
    private Date createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false, columnDefinition = "datetime")
    @org.hibernate.annotations.Generated(value = GenerationTime.ALWAYS)
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date updatedAt;

    public UserPlacePK getId() {
        return id;
    }

    public void setId(UserPlacePK id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Place getPlaceId() {
        return placeId;
    }

    public void setPlaceId(Place placeId) {
        this.placeId = placeId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
