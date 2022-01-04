package com.example.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Equipe;

import com.example.project.repository.equipeRepository;
@Service
public class EquipeServiceImpl implements EquipeService {
	 @Autowired 
		private equipeRepository eRepository;

	@Override
	public List<Equipe> getEquipe() {
		return eRepository.findAll();
	}

	@Override
	public Equipe saveEquipe(Equipe equipe) {
		return eRepository.save(equipe);
	}

	@Override
	public Equipe getSingleEquipe(Long id_eq) {
		Optional<Equipe> equipe = eRepository.findById(id_eq);
		if(equipe.isPresent()) {
			return  equipe.get();
		}
		 throw new RuntimeException(" user not found for id"+ id_eq);
				
	}

	@Override
	public void deleteEquipe(Long id_eq) {
		eRepository.deleteById(id_eq);

	}

	@Override
	public Equipe updateEquipe(Equipe equipe) {
		return eRepository.save(equipe) ;
	}

	/* public List<Equipe> getMemberOfEquipe(Long id_eq) {
		
		return null;
	}*/

	/*@Override
	public List<Equipe> getUserByNameEq(String NameEq) {
		return null;
	}*/

}
