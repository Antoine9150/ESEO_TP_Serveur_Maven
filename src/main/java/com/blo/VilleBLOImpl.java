package com.blo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.VilleDAO;
import com.dto.Ville;

@Service
public class VilleBLOImpl implements VilleBLO {

	@Autowired
	private VilleDAO villeDAO;
	
	public ArrayList<Ville> getInfoVille(String param) {
		
		
		
		
		return villeDAO.findAllVilles(param);
	}
	
	public boolean getInfoVillePost(Ville ville) {
		
		
		return villeDAO.postVille(ville);
	}
	
	public boolean getInfoVillePut(Ville ville) {
		
		
		return villeDAO.putVille(ville);
	}
	
	public boolean getInfoVilleDelete(Ville ville) {
		
		
		return  villeDAO.deleteVille(ville);
	}
}
