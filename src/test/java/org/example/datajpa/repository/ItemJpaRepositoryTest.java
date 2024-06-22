package org.example.datajpa.repository;

import org.example.datajpa.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemJpaRepositoryTest {
    @Autowired ItemJpaRepository itemJpaRepository;

    @Test
    void save() {
        Item item = new Item("A");
        itemJpaRepository.save(item);
    }
}