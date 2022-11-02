package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}
	
	@Override
	public List<ProgrammingLanguage> getAll(){
		return programmingLanguageRepository.getAll();
	}
	
	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage programmingLanguages : this.programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getName() == programmingLanguages.getName()) {
				throw new Exception("Sistemde bu kurs mevcut");
			}
			else if(programmingLanguage.getName() == null){
				throw new Exception("Programlama dili boş geçilemez");
			}
		}
	}
	
	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		for(ProgrammingLanguage programmingLanguages : this.programmingLanguageRepository.getAll()) {
			if(programmingLanguage.getName() == programmingLanguages.getName()) {
				throw new Exception("Sistemde bu kurs mevcut");
			}
			else if(programmingLanguage.getName() == null){
				throw new Exception("Programlama dili boş geçilemez");
			}
		}
	}
	
	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		programmingLanguageRepository.delete(programmingLanguage);
	}
	
	@Override 
	public ProgrammingLanguage getOneById(int id) {
		return programmingLanguageRepository.getOneById(id);
	}
}
