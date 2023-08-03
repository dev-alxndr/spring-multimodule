package me.alxndr.modules.order.interfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

	private Long id;

	private String orderer;

	private String zipCode;


}
