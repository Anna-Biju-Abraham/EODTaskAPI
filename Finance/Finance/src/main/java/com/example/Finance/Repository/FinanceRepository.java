package com.example.Finance.Repository;

import com.example.Finance.Models.Finances;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanceRepository extends JpaRepository <Finances, Long> {
}
