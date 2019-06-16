package com.hotel.repository.base;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
@Transactional(readOnly = true)
public interface BaseRepository <T, ID extends Serializable> extends JpaRepository<T, ID> {

}
