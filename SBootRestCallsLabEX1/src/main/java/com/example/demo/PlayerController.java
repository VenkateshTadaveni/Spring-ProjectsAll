package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	 @PostMapping("/post")
	public Player OneObject(@RequestBody Player player) {
		 return  playerService.save(player);
		
	 }
	 @PostMapping("/listPost")
	 public List<Player> listOfPlayer(@RequestBody Player player){
		 return playerService.getList(player);
	 }
	 
	 @GetMapping("/get/{country}")
	 public Player getPlayer(@PathVariable String country,Player player) {
		 return playerService.getPlayerByCountry(country,player);
		 
	 }
	 @GetMapping("/getAll")
	 public List<Player> getAll(){
		 return playerService.getAllData();
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public String deleteBYId(@PathVariable Integer id) {
		 return playerService.deleteBYId(id); 
	 }
	 
	 @PutMapping("/update/{id}")
	 public String UpdateBy(@PathVariable Integer id ,@RequestBody Player player) {
		 return playerService.UpdateById(id ,player);
	 }
	 
	 @PatchMapping("/partial/{id}")
	 public String PartialUpdate(@PathVariable Integer id) {
		   return playerService.partialUpdateById(id);
	 }
	
	 
}
