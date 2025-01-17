package org.example.demodeploy.echo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DumyRepository extends JpaRepository<Dumy, Integer> {


}
