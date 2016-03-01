package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "user_favorite")
public class UserFavorite implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private UserFavoritePK id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "user_favorite_ibfk_1"), insertable = false, updatable = false)
    @NotNull
    private User userId;

    @ManyToOne
    @JoinColumn(name = "post_id", referencedColumnName = "id",
            foreignKey = @ForeignKey(name = "user_favorite_ibfk_2"), insertable = false, updatable = false)
    @NotNull
    private Post postId;

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

    public UserFavoritePK getId() {
        return id;
    }

    public void setId(UserFavoritePK id) {
        this.id = id;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Post getPostId() {
        return postId;
    }

    public void setPostId(Post postId) {
        this.postId = postId;
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
