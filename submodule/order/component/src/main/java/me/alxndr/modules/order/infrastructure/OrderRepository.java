package me.alxndr.modules.order.infrastructure;


import me.alxndr.modules.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
