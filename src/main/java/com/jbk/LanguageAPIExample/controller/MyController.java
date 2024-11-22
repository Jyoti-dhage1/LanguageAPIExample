package com.jbk.LanguageAPIExample.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/langaugeConverter")
public class MyController {
	
	@GetMapping("/hindi")
	public String hindi(){
		
		return "हमारी साइट पर आपका स्वागत है, \n\n\n1. बिना रुके, एक लक्ष्य का पालन करना: यही सफलता का रहस्य है। ~अन्ना पावलोवा\n\n"
				+ "2. मनुष्य कर्म से महान होता है, जन्म से नहीं। ~आचार्य चाणक्य \n\n"
				+ "3. सपने वे नहीं, जो आप नींद में देखते हैं, सपने तो वे है, जो आपको सोने नहीं देते। ~डॉ. एपीजे अब्दुल कलाम ";
		
	}
	
	@PostMapping("/marathi")
	public String marathi(){
		
		return "आमच्या साइटवर आपले स्वागत आहे, \n\n\n1. आजचा संघर्ष उद्याचे सामर्थ्य निर्माण करतो, विचार बदला आयुष्य बदलेल.\n\n"
				+ "2. माणसाने समोर बघायचं की मागे,  यावरच पुढचं सुखदुःख अवलंबून असतं – व. पु.  काळे\n\n"
				+ "3. जोपर्यंत आपण हरण्याचा विचार करत नाही तोपर्यंत आपल्याला कोणीही हरवू शकत नाही. हे एकदा मनाशी पक्के केले की आपण जिंकणार हे नक्की ";
		
	}

	@PutMapping("/english")
	public String english(){
	
		return "Welcome to our site,\n\n\n1. \"Life is not a problem to be solved, but a reality to be experienced.\" – Soren Kierkegaard\n"
				+ "2. \"Accept no one's definition of your life, define yourself.\" – Harvey Fierstein\n"
				+ "3. \"If everything was perfect, you would never learn and you would never grow.\" – Beyoncé\n"
				+ "4. \"Life is very interesting in the end, some of your greatest pains, become your greatest strengths.\" – Drew Barrymore";
	}
	
	@DeleteMapping("/french")
	public String french(){
	
		return "Bienvenue sur notre site Internet,\n\n\n1. \"La simplicité est la sophistication suprême.\" \n"
				+ "2. \"Dans la vie on ne fait pas ce que l’on veut mais on est responsable de ce que l’on est. – Jean-Paul Sartre.\n"
				+ "3. \"Un sourire coûte moins cher que l’électricité, mais donne autant de lumière. – L’abbé Pierre\n"
				+ "4. \"Fais toujours de ton mieux même si personne ne regarde.\"";
	}
	
	@RequestMapping("/chinese")
	public String chinese(){
	
		return "歡迎來到我們的網站,\n\n\n1. 锲而不舍，金石可镂 \n"
				+ "2. 孤举者难起，众行者易趋 \n"
				+ "3. 姜还是老的辣 \n"
				+ "4. 熟能生巧 ";
	}
	
	
}
