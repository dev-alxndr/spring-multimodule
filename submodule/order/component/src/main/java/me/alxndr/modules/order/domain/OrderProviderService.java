package me.alxndr.modules.order.domain;

import lombok.RequiredArgsConstructor;
import me.alxndr.modules.order.infrastructure.OrderRepository;
import me.alxndr.modules.order.interfaces.OrderDto;
import me.alxndr.modules.order.interfaces.OrderProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderProviderService implements OrderProvider {

	private final OrderRepository orderRepository;


	@Override
	public OrderDto findByOrderId(final Long id) {
		final Order order = orderRepository.findById(id)
				.orElseThrow();
		return new OrderDto(order.getId(), order.getOrderer(), order.getZipCode());
	}

}
