package com.blo;

import java.util.ArrayList;

import com.dto.Ville;

public interface VilleBLO {

	public ArrayList<Ville> getInfoVille(String param);
	
	public boolean getInfoVillePost(Ville ville);
	
	public boolean getInfoVillePut(Ville ville);
	
	public boolean getInfoVilleDelete(Ville ville);	
}
