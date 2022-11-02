package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	
	void add(ProgrammingLanguage programmingLanguage) ;
	
	void update(ProgrammingLanguage programmingLanguage) ;
	
	void delete(ProgrammingLanguage programmingLanguage) ;
	
	ProgrammingLanguage getOneById(int id);
}
