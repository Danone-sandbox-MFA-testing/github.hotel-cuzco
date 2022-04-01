package com.cuzco.hotel.infrastructure.repositories;

import com.cuzco.hotel.domain.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomJpaRepository extends JpaRepository<Room, Integer> { }
