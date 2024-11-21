package br.com.kesyodev.login_auth_api.repositories;

import br.com.kesyodev.login_auth_api.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

}
