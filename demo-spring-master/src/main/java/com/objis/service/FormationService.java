package com.objis.service;

import com.objis.spring.demodao.IFormationDao;
import com.objis.spring.demodomaine.Formation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormationService {

    @Autowired
    private IFormationDao iFormationDao;

    public List<Formation> list() {
        return this.iFormationDao.findAll();
    }

    public void save(Formation formation) {
        this.iFormationDao.save(formation);
    }

    public void delete(Integer id) {
        this.iFormationDao.deleteById(id);
    }

    public Formation find(Integer id) {
        return this.iFormationDao.getOne(id);
    }
}
