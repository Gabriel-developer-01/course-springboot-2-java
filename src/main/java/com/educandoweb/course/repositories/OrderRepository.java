package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{ // O UserRepository é responsável por fazer operações com a entidade Order
      
}
