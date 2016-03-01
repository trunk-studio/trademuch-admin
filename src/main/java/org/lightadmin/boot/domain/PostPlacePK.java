package org.lightadmin.boot.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PostPlacePK implements Serializable {

    @Column(name = "place_id")
    private Integer placeId;

    @Column(name = "post_id")
    private Integer postId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostPlacePK that = (PostPlacePK) o;

        if (!placeId.equals(that.placeId)) return false;
        return postId.equals(that.postId);

    }

    @Override
    public int hashCode() {
        int result = placeId.hashCode();
        result = 31 * result + postId.hashCode();
        return result;
    }

}
