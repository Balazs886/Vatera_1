package eu.devforest.VateraTool.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Entity
@Table(name = "VAT_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name = "USR_ID")
    private UUID id;

    @Column(name = "USR_NAME")
    private String name;

    @Column(name = "USR_STARS")
    private Integer stars;

    public UUID getId() {
        return id;
    }

    public User setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getStars() {
        return stars;
    }

    public User setStars(Integer stars) {
        this.stars = stars;
        return this;
    }
}
