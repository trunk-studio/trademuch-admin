package org.lightadmin.boot.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserPlacePK implements Serializable {

    @Column(name = "user_id", columnDefinition = "int(11)")
    private Integer id1;

    @Column(name = "place_id", columnDefinition = "int(11)")
    private Integer id2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserPlacePK that = (UserPlacePK) o;

        if (id1 != null ? !id1.equals(that.id1) : that.id1 != null) return false;
        return id2 != null ? id2.equals(that.id2) : that.id2 == null;

    }

    @Override
    public int hashCode() {
        int result = id1 != null ? id1.hashCode() : 0;
        result = 31 * result + (id2 != null ? id2.hashCode() : 0);
        return result;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }
}
