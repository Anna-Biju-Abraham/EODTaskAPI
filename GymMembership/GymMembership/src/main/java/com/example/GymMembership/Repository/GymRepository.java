package com.example.GymMembership.Repository;

import com.example.GymMembership.Models.GymMembers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GymRepository extends JpaRepository <GymMembers, Long> {
}
