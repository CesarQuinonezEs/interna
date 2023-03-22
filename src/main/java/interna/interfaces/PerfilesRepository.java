package interna.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import interna.entity.PerfilesEntity;

@Repository
public interface PerfilesRepository extends JpaRepository<PerfilesEntity, Integer>{

}
