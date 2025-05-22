package com.store.store_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.store_app.model.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
    
}
