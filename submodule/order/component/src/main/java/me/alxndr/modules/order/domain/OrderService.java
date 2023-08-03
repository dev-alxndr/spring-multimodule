package me.alxndr.modules.order.domain;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import me.alxndr.modules.order.infrastructure.OrderRepository;
import me.alxndr.modules.payment.interfaces.PayRequest;
import me.alxndr.modules.payment.interfaces.PaymentProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

	private final PaymentProvider paymentProvider;
	private final OrderRepository orderRepository;

	public void createOrder() {

		final Order order = new Order(null, "choi", "12345");

		paymentProvider.pay(new PayRequest(BigDecimal.valueOf(20000), "CARD"));

		orderRepository.save(order);
	}

}
