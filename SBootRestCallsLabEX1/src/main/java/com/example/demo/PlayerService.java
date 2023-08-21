package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;

	List<Player> players = new ArrayList<Player>(Arrays.asList(new Player(11, "bangladesh", 20, "Bangladesh", 2300),
			new Player(12, "NewZelend", 18, "NewZelend", 3000)));

	public Player save(Player player) {
		players.add(player);
		return playerRepository.save(player);

	}

	public List<Player> getList(Player player) {

		return players;

	}

	public Player getPlayerByCountry(String country, Player player) {
		return players.stream().filter(n -> n.getCountry().equalsIgnoreCase(country)).findAny().get();

	}

	public List<Player> getAllData() {

		return players;
	}

	public String deleteBYId(Integer id) {
		Player p = players.stream().filter(n -> n.getId() == id).findAny().get();

		return players.remove(p) ? "Deleted" : "Not deleted";
	}

	public String UpdateById(Integer id, Player player) {
		Player player2 = players.stream().filter(u -> u.getId() == id).findFirst().get();

		player2.setId(player.getId());
		player2.setName(player.getName());
		player2.setNumberOfMatches(player.getNumberOfMatches());
		player2.setCountry(player.getCountry());
		player2.setTotalRuns(player.getTotalRuns());
		return "data updated";
	}

	public String partialUpdateById(Integer id) {
		Player player=players.stream().filter(u->u.getId()==id).findFirst().get();
		player.
		
	}

	

}
