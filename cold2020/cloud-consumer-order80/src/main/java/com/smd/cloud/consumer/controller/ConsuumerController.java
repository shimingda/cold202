package com.smd.cloud.consumer.controller;

import com.smd.cloud.common.entities.CommonResult;
import com.smd.cloud.common.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ConsuumerController
{
	private static final String URL="http://localhost:8001";
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("consumer/payment/create")
	public CommonResult<Payment> create(@RequestBody Payment payment){
		return restTemplate.postForObject(URL+"/payment/create",payment,CommonResult.class);
	}
	
	@GetMapping("consumer/payment/get/{id}")
	public CommonResult<Payment> create( @PathVariable Long id){
		return restTemplate.getForObject(URL+"/payment/get/"+id,CommonResult.class);
	}
}
