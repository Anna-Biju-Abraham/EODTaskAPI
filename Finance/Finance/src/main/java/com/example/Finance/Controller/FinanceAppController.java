package com.example.Finance.Controller;

import com.example.Finance.Models.Finances;
import com.example.Finance.Repository.FinanceRepository;
import jakarta.transaction.Transactional;
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
public class FinanceAppController {

    @Autowired
    private FinanceRepository financeRepo;

    @Transactional
    @PostMapping("/addTransaction")
    public ResponseEntity <Map<String,String>> addTransaction(@RequestBody Finances transaction){
        Finances financeObj = financeRepo.save(transaction);

        Map<String,String> response = new HashMap<>();

        response.put("Status","Transaction added successfully");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewTransactionHistory")
    public ResponseEntity <List <Finances>> viewTransactions(){
        List <Finances> transactions = financeRepo.findAll();

        return ResponseEntity.ok(transactions);
    }
}
