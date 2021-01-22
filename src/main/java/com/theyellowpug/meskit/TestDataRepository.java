package com.theyellowpug.meskit;

import com.theyellowpug.meskit.entity.TestData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestDataRepository extends JpaRepository<TestData,Long> {

}
