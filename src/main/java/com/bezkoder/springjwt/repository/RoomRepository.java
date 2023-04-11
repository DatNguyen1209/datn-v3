package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface RoomRepository extends JpaRepository<Room,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM Room WHERE room_name = ?1")
    Room findRoomCurrentByName(String roomName);

}
