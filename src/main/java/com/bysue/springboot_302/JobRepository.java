package com.bysue.springboot_302;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository <Job, Long> {
}
