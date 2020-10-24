package com.ram.lara.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ram.lara.project.entities.Skill;
import com.ram.lara.project.entities.Trainer;
import com.ram.lara.project.repositories.OrganizationRepository;
import com.ram.lara.project.services.SkillService;
import com.ram.lara.project.services.TrainerService;

@SpringBootApplication
public class LaraProjectApplication implements CommandLineRunner{

	@Autowired
	private TrainerService trainerSer;
	@Autowired
	private SkillService skillSer;
	@Autowired
	private OrganizationRepository orgRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(LaraProjectApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		/*Trainer t=trainerSer.getTrainer(2);
		System.out.println("trainer ");
		System.out.println(t.getFirstName());
		System.out.println(t.getSkills().get(0).getSkillName());*/
        
		/*Trainer t=(Trainer)trainerSer.getTrainer(1);
		System.out.println(t);*/
        
		
		/*Trainer t=trainerSer.getTrainer(1);
		System.out.println("the trainer skill is");
		System.out.println(t.getSkills().get(1));*/
		
		/*Organization o1=new Organization();
		
		o1.setOrganizationName("oracle");
		o1.setAddress("diary circle bengaluru");
		o1.setLandLineNumber(478484);
		o1.setWebsite("www.oracle.india.in");
		o1.setContactPersonName("stephen");
		o1.setContactPersonDesignation("senior manager");
		o1.setContactPersonEmailId("stephen@oracle.com");
		o1.setContactPersonMobileNumber(74883838);
		o1.setOrganizationProfile("software devlopment company");
		o1.setUsername("stephen");
		o1.setPassword(passwordEncoder().encode("stephen"));
		
		orgRepo.save(o1);
		System.out.println("organization saved successfully");
		/*
    private Integer id;
	private String organizationName;
	private String address;
	private Integer landLineNumber;
	private String website;
	private String contactPersonName;
	private String contactPersonDesignation;
	private String contactPersonEmailId;
	private Integer contactPersonMobileNumber;
	private String organizationProfile;
	private String username;
	private String password;
		 */
		/*Skill s1=new Skill();
		s1.setId(1);
        s1.setSkillName("C");
        s1.setSkillDesc("C programming language");
        
        Skill s2=new Skill();
        s2.setId(2);
        s2.setSkillName("C++");
        s2.setSkillDesc("C++ programming language");
        
        skillSer.saveSkill(s1);
        skillSer.saveSkill(s2);
		Skill s3=new Skill();
        s3.setId(3);
        s3.setSkillName("JAVA");
        s3.setSkillDesc("JAVA programming language");
        
        Skill s4=new Skill();
        s4.setId(4);
        s4.setSkillName("PYTHON");
        s4.setSkillDesc("PYTHON programming language");
        
        Skill s5=new Skill();
        s5.setId(5);
        s5.setSkillName("MANUAL TESTING");
        s5.setSkillDesc("testing");
        
        Skill s6=new Skill();
        s6.setId(6);
        s6.setSkillName("AUTOMATIC TESTING");
        s6.setSkillDesc("testing");
        
        Skill s7=new Skill();
        s7.setId(7);
        s7.setSkillName("CLOUD COMPUTING");
        s7.setSkillDesc("JAVA programming language");
        
        Skill s8=new Skill();
        s8.setId(8);
        s8.setSkillName("NETWORKING");
        s8.setSkillDesc("NETWORKING");
        
        skillSer.saveSkill(s3);
        skillSer.saveSkill(s4);
        skillSer.saveSkill(s5);
        skillSer.saveSkill(s6);
        skillSer.saveSkill(s7);
        skillSer.saveSkill(s8);
        
        System.out.println("skill saved Successfully");*/
        
        
        
        
        
       
		/*Skill s1=new Skill();
        s1.setId(1);
        s1.setSkillName("C");
        s1.setSkillDesc("C programming language");
        
        Skill s2=new Skill();
        s2.setId(2);
        s2.setSkillName("C++");
        s2.setSkillDesc("C++ programming language");
        
        skillSer.saveSkill(s1);
        skillSer.saveSkill(s2);
        
        Trainer t1=new Trainer();
        t1.setFirstName("rama");
        t1.setLastName("chandiran");
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String dt="01/01/2011";
        t1.setDob(sdf.parse(dt));
        t1.setEmail("ram@gmail.com");
        t1.setMobileNum(1234567890);
        t1.setHighestDegree("ME computer science");
        t1.setTotalExperience(6);
        t1.setTrainingExperice(3);
        t1.setAddress("btm layout");
        t1.setUsername("ram");
        t1.setPassword(passwordEncoder().encode("ramdev"));
        t1.setRoles("ROLE_TRAINER");
        t1.setSkills(Arrays.asList(s1,s2));
        
        trainerSer.saveTrainer(t1);
        System.out.println("trainer saved successfully");
        
        /*
         Id: number	=> PK
First_name: varchar2
Last_name: varchar2
Dob: Date
Email: varchar2 => unique
Mobile_number: number
Highest_degree: varchar2
Total_experiance: number
Training_experiance: number
Address: varchar2
Username:varchar2
Password: varchar2
Role: varchar2 (ROLE_TRAINER)
         */
        
		
	}
	/*
	@Bean
	public PasswordEncoder passwordEncoder() {
	   return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
	*/


}
