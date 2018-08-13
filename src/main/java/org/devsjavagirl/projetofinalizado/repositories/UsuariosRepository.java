package org.devsjavagirl.projetofinalizado.repositories;

import org.devsjavagirl.projetofinalizado.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
