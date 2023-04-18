package com.hb.springboot.crud.k8s.example.repository;

import com.hb.springboot.crud.k8s.example.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Integer>
{

}
