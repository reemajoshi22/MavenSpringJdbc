package com.example.maven.hibernate.MavenSpringJdbc;

public interface CustomerDAO
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}