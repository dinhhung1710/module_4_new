package org.example.demo_spring.service;

import org.example.demo_spring.entity.Player;
import org.example.demo_spring.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService implements IPlayerService {

    @Autowired
    private IPlayerRepository playerRepository;

    @Override
    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    @Override
    public void add(Player player) {
        playerRepository.add(player);
    }

    @Override
    public void delete(int id) {
        playerRepository.delete(id);
    }
}
