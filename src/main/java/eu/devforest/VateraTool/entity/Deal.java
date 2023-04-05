package eu.devforest.VateraTool.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.util.UUID;

@Entity
@Table(name = "VAT_DEAL")
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @JdbcTypeCode(java.sql.Types.VARCHAR)
    @Column(name = "VDL_ID")
    private UUID id;


    @Column(name = "VDL_SELLER")
    private String seller;
    @Column(name = "VDL_BUYER")
    private String buyer;
    @Column(name = "VDL_DETAILS")
    private String details;

    public UUID getId() {
        return id;
    }

    public Deal setId(UUID id) {
        this.id = id;
        return this;
    }

    public String getSeller() {
        return seller;
    }

    public Deal setSeller(String seller) {
        this.seller = seller;
        return this;
    }

    public String getBuyer() {
        return buyer;
    }

    public Deal setBuyer(String buyer) {
        this.buyer = buyer;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public Deal setDetails(String details) {
        this.details = details;
        return this;
    }
}
