package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "post_place")
public class PostPlace implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    @GeneratedValue
    private PostPlacePK id;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id", insertable = false, updatable = false)
    @NotNull
    private Post postId;

    @ManyToOne
    @JoinColumn(name = "place_id", referencedColumnName = "id", insertable = false, updatable = false)
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

    public PostPlacePK getId() {
        return id;
    }

    public void setId(PostPlacePK id) {
        this.id = id;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
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
