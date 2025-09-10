package com.shrii.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shrii.request.Passenger;
import com.shrii.response.Ticket;

@RestController
public class ErailRestController {
	
	private Map<Integer, Ticket> tickets = new HashMap<>();

	private int ticketId = 100;
	@PostMapping(
			value = "/ticket",
			consumes = {"application/xml" , "application/json"},
			produces = {"application/xml" , "application/json"}
	)
	public Ticket bookTicket(@RequestBody Passenger passenger) {
		
		//logic to book a ticket
		
		Ticket t = new Ticket();
		
//		Random r = new Random();
//		int ticketId = r.nextInt();
		
		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passenger.getTrainNum());
		t.setTktCost("1500.00 INR");
		
		tickets.put(ticketId, t);
		
		ticketId++;
		
		return t;
		
	}
	
	@GetMapping(
			value="/ticket/{ticketId}",
			produces = {"application/xml" , "application/json"}
	)
	public Ticket getTicket(@PathVariable Integer ticketId) {
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		return null;
	}
} // In Postman // localhost:8080/ticket AND // localhost:8080/ticket/ticketId

