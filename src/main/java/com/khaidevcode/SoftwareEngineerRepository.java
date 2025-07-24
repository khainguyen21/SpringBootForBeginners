package com.khaidevcode;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<SoftwareEngineer, Integer> Because the data type for the primary key is Integer
public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {

}
