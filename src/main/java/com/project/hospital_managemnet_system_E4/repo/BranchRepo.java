package com.project.hospital_managemnet_system_E4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;

import com.project.hospital_managemnet_system_E4.dto.Branch;

public interface BranchRepo extends JpaRepository<Branch, Integer> {

}
