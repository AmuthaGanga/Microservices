package com.intern.customerorderservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intern.customerorderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	List<Order> findByCustomerId(int customerId);
	
	@Query(value="SELECT COALESCE(SUM(quantity * unit_price), 0.0) FROM orders o, order_items oi WHERE customer_id = :customerId	AND o.order_id = oi.order_id;", nativeQuery = true)
	double getCustomerOrderDetails(@Param("customerId") int customerId);

}
