package org.anefdev.demo.service;

import org.anefdev.demo.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodMateService {

    @Autowired
    private Repo repo;

}
