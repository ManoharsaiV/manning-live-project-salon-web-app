package com.salon.api.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepo extends CrudRepository<Slot, Long> {


}
