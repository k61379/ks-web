package com.kimjiyeung.app;

import com.kimjiyeung.app.entity.Interests;
import com.kimjiyeung.app.entity.Person;
import com.kimjiyeung.app.entity.Skill;
import com.kimjiyeung.app.entity.SocialMedia;
import com.kimjiyeung.app.entity.Work;
import com.kimjiyeung.app.repository.InterestsRepository;
import com.kimjiyeung.app.repository.PersonRepository;
import com.kimjiyeung.app.repository.SkillRepository;
import com.kimjiyeung.app.repository.SocialMediaRepository;
import com.kimjiyeung.app.repository.WorkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AppApplication implements CommandLineRunner {
	private PersonRepository personRepository;
	private SocialMediaRepository socialMediaRepository;
	private InterestsRepository interestsRepository;
	private SkillRepository skillRepository;
	private WorkRepository workRepository;
	
	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository){
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("김지영", "데이터 분석","hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("github","facebook"));
		interestsRepository.save(new Interests("잠","게임"));
		skillRepository.save(new Skill("김지영", 3));
		workRepository.save(new Work("학생", "대학교", "때때로다름", "."));
	}
}

