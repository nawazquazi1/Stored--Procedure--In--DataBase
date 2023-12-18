package com.nawaz.store.spring.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getTickets"),
		@NamedStoredProcedureQuery(name = "secondProcedure", procedureName = "getTicketsByCatagory", parameters = {
				@StoredProcedureParameter(mode = ParameterMode.IN, name = "tcatagory", type = String.class) }) })
public class Ticket {
	@Id
	private int id;
	private int amount;
	private String catagory;
}
