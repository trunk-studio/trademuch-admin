package org.lightadmin.boot.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserFavoritePK implements Serializable {

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "post_id")
    private Integer postId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserFavoritePK that = (UserFavoritePK) o;

        if (!userId.equals(that.userId)) return false;
        return postId.equals(that.postId);

    }

    @Override
    public int hashCode() {
        int result = userId.hashCode();
        result = 31 * result + postId.hashCode();
        return result;
    }
}
