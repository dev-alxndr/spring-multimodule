package me.alxndr.modules.payment.interfaces;

import lombok.RequiredArgsConstructor;
import me.alxndr.modules.payment.domain.Payment;
import me.alxndr.modules.payment.domain.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
@RequiredArgsConstructor
public class PaymentController {

	private final PaymentService paymentService;


	@GetMapping("/{id}")
	public ResponseEntity getPayment(final Long id) {
		final Payment payment = paymentService.getPayment(id);

		return ResponseEntity.ok(payment);
	}

}
