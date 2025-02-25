package com.example.GymMembership.Controller;

import com.example.GymMembership.Models.GymMembers;
import com.example.GymMembership.Repository.GymRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class GymAppController {

    @Autowired
    private GymRepository gymRepo;

    @PostMapping("/addMember")
    public ResponseEntity <Map <String,String>> addMember(@RequestBody GymMembers member){
        GymMembers members = gymRepo.save(member);

        Map<String,String> response = new HashMap<>();

        response.put("Status","New gym member added successfully");

        return ResponseEntity.ok(response);
    }
    @GetMapping("/viewAllMembers")
    public ResponseEntity <List <GymMembers>> viewMemberList(){
        List <GymMembers> members = gymRepo.findAll();

        return ResponseEntity.ok(members);

    }

}
