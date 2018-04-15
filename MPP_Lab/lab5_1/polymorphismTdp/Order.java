package polymorphismTdp;

import java.time.LocalDate;

public class Order {
	private String orderNo;
	private LocalDate orderDate;
	private double orderAmount;

	private Commisioned commisioned;

	public Order(String orderNo, LocalDate orderDate, double orderAmount) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.orderAmount = orderAmount;
	}

	public double getOrderAmount() {
		return orderAmount;
	}
}
