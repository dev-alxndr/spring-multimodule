package me.alxndr.modules.payment.infrastructure;


import me.alxndr.modules.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
