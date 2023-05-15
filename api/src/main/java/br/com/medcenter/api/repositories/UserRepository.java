package br.com.medcenter.api.repositories;

import br.com.medcenter.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
