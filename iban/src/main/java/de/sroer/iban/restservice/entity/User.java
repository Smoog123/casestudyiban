package de.sroer.iban.restservice.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "User")
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IBAN> IBAN = new ArrayList<de.sroer.iban.restservice.entity.IBAN>();

    public List<IBAN> getIBAN() {
	return IBAN;
    }

    public void setIBAN(List<IBAN> iBAN) {
	IBAN = iBAN;
    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getFirstname() {
	return firstname;
    }

    public void setFirstname(String firstname) {
	this.firstname = firstname;
    }

    public String getLastname() {
	return lastname;
    }

    public void setLastname(String lastname) {
	this.lastname = lastname;
    }

}
