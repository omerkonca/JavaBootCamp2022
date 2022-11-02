package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception ;
	
	void update(ProgrammingLanguage programmingLanguage) throws Exception ;
	
	void delete(ProgrammingLanguage programmingLanguage) ;
	
	ProgrammingLanguage getOneById(int id);
}
