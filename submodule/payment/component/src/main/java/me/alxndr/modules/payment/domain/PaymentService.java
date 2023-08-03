package me.alxndr.modules.payment.domain;

import lombok.RequiredArgsConstructor;
import me.alxndr.modules.order.interfaces.OrderProvider;
import me.alxndr.modules.payment.infrastructure.PaymentRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

	private final PaymentRepository paymentRepository;

	private final OrderProvider orderProvider;

	public Payment getPayment(final Long id) {
		return paymentRepository.findById(id).orElseThrow();
	}
}
