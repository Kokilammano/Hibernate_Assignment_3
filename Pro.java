//Hibernate Project Using Criteria API

package com.abc.hiberapp3;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pro 
{
	@Id
	private Integer id;
	private String name;
	private Integer price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pro [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
