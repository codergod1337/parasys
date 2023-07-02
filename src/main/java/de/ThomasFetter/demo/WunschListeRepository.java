package repository;

import db.WunschListe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WunschListeRepository extends JpaRepository<WunschListe, Long> {

        }
