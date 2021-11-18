package com.baeldung.um.persistence.dao;

import com.baeldung.common.interfaces.IByNameApi;
import com.baeldung.um.persistence.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface IPatientJpaDao extends JpaRepository<Patient, Long>, JpaSpecificationExecutor<Patient>, IByNameApi<Patient> {
    //
}