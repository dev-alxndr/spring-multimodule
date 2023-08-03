package me.alxndr.modules.order.interfaces;

import lombok.RequiredArgsConstructor;
import me.alxndr.modules.order.domain.OrderProviderService;
import me.alxndr.modules.order.domain.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/orders")
@RestController
@RequiredArgsConstructor
public class OrderController {

	private final OrderService orderService;


	@GetMapping
	public String createOrder() {
		orderService.createOrder();

		return "success";
	}

}
