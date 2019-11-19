package com.swapnil.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface productDao extends JpaRepository<Product, Integer> 
{

}
