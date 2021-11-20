package com.javatechie.tx;

import com.javatechie.tx.dto.FlightBookingAcknowledgement;
import com.javatechie.tx.dto.FlightBookingRequest;
import com.javatechie.tx.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class FlightServiceExampleApplication {

	@Autowired
	private FlightBookingService service;


	@PostMapping("/bookFlightTicket")
	public ResponseEntity<?> bookFlightTicket(@RequestBody FlightBookingRequest request){
		FlightBookingAcknowledgement flightBookingAcknowledgement = service.bookFlightTicket(request);
		return new ResponseEntity<>(flightBookingAcknowledgement, HttpStatus.OK);
	}

	public static void main(String[] args) {
		SpringApplication.run(FlightServiceExampleApplication.class, args);
	}

}
