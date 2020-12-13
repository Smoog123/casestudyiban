package de.stroer.iban.restservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.sroer.iban.restservice.entity.User;

@RepositoryRestResource(path = "/users")
public interface UserRepository extends JpaRepository<User, String> {

}
