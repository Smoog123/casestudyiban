package de.stroer.iban.restservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "IBAN")
@Table(name = "IBAN")
public class IBAN {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 22, max = 34)
    @Column(name = "IBAN", length = 34, nullable = false)
    private String IBAN;

    @ManyToOne
    @JoinColumn(name = "id_user", insertable = false, updatable = false)
    private User user;

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getIBAN() {
	return IBAN;
    }

    public void setIBAN(String iBAN) {
	IBAN = iBAN;
    }

}
