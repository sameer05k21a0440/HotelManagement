package com.hotel.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.hotel.entity.Registration;
import com.hotel.repository.base.BaseRepository;

 

public interface RegistrationRepository extends BaseRepository<Registration, Integer>,RegistrationRepositoryCustom, JpaSpecificationExecutor<Registration> {

	
}
