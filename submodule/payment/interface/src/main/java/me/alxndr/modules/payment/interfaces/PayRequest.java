package me.alxndr.modules.payment.interfaces;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PayRequest {

	private BigDecimal amount;

	private String method;

}
