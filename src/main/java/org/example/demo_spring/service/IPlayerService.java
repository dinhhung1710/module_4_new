package org.example.demo_spring.service;

import org.example.demo_spring.entity.Player;

import java.util.List;

public interface IPlayerService {
    List<Player> findAll();
    void add(Player player);
    void delete(int id);
}