package interna.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import interna.interfaces.PerfilesRepository;

@Service
public class PerfilesServices {
	@Autowired PerfilesRepository perfilesDao;
	
}
