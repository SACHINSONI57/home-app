package com.model;

	import jakarta.persistence.Entity;
	import jakarta.persistence.Id;

	@Entity
	public class Appliance {
		
		@Id
		private long id;
		private String name;
		private String brand;
		private double price;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		

	}



