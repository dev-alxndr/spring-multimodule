package me.alxndr.modules.payment.domain;

import lombok.RequiredArgsConstructor;
import me.alxndr.modules.order.interfaces.OrderProvider;
import me.alxndr.modules.payment.infrastructure.PaymentRepository;
import me.alxndr.modules.payment.interfaces.PayRequest;
import me.alxndr.modules.payment.interfaces.PaymentProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentProviderService implements PaymentProvider {

	private final PaymentRepository paymentRepository;

	@Override
	public void pay(final PayRequest request) {

		final Payment payment = new Payment(null, request.getMethod(), request.getAmount());
		paymentRepository.save(payment);

	}
}
