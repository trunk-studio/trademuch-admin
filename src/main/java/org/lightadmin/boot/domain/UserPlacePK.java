package org.lightadmin.boot.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPlacePK implements Serializable {

    @Column(name = "place_id")
    private Integer placeId;

    @Column(name = "user_id")
    private Integer userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPlacePK that = (UserPlacePK) o;

        if (!placeId.equals(that.placeId)) return false;
        return userId.equals(that.userId);

    }

    @Override
    public int hashCode() {
        int result = placeId.hashCode();
        result = 31 * result + userId.hashCode();
        return result;
    }
}
