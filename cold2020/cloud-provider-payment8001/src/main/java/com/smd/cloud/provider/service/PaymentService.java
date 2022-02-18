package com.smd.cloud.provider.service;

import com.smd.cloud.common.entities.Payment;

public interface PaymentService
{
	public int create(Payment payment);
	 
	public Payment getPaymentById( Long id); 
}
