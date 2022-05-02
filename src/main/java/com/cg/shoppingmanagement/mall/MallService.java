package com.cg.shoppingmanagement.mall;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;


@Service
@Transactional
public class MallService {
	@Autowired
	public MallRepository repo;
	
	public List<MallEntities> listAll(){
		return repo.findAll();
	}

	public MallEntities get(Integer id) {
		return repo.findById(id).get();
	}

	public void save(MallEntities mallEntities) {
		repo.save(mallEntities);
		
	}

	public void delete(Integer id) {
		repo.deleteById(id);
		
	}

	
		
	}

	


