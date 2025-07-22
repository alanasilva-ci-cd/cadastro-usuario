package com.javasilva.cadastro_usuario.infraestruture.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import com.javasilva.cadastro_usuario.infraestruture.entitys.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    @Transactional
    void deleteByEmail(String email);
}
