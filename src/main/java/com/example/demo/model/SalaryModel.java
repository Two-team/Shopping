package com.example.demo.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SalaryModel {
	private int id;
	private String name;
	private String email;
}
