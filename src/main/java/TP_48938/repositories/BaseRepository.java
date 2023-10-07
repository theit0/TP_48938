package TP_48938.repositories;

import TP_48938.entities.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository <E extends Base, id extends Serializable> extends JpaRepository<E,id> {

}
