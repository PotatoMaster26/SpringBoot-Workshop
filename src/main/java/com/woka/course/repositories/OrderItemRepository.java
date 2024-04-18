package com.woka.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.woka.course.entities.OrderItem;
import com.woka.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
		
	}

