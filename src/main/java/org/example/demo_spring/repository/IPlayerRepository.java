package org.example.demo_spring.repository;

import org.example.demo_spring.entity.Player;

import java.util.List;

public interface IPlayerRepository {
    List<Player> findAll();
    void add(Player player);
    void delete(int id);
}
