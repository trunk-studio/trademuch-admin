package org.lightadmin.boot.domain;


import org.hibernate.annotations.GenerationTime;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name = "post")
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(columnDefinition = "int(11)")
    private Integer id;

    @Column(columnDefinition="char(36) BINARY CHARACTER SET utf8 COLLATE utf8_bin")
    private UUID uuid;

    @Column
    @NotBlank
    private String title;

    @Column(name = "start_date", columnDefinition = "datetime")
    @NotNull
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "end_date", columnDefinition = "datetime")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "cover_image")
    private String coverImage;

    @Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "datetime")
    @org.hibernate.annotations.Generated(value = GenerationTime.INSERT)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false, columnDefinition = "datetime")
    @org.hibernate.annotations.Generated(value = GenerationTime.ALWAYS)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "post_ibfk_1"))

    private User userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage;
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

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }
}
