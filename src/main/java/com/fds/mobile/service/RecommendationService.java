package com.fds.mobile.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import com.fds.model.Recommendation;

@Service
public class RecommendationService {
	public ArrayList<Recommendation> getRecommendation(){
		
		Recommendation re = new Recommendation();
		Recommendation re1 = new Recommendation();
		re.setId(1);
		re.setProductName("Red");

		re1.setId(2);
		re1.setProductName("Yellow");
		
		ArrayList<Recommendation> r = new ArrayList<Recommendation>();
		r.add(re);
		r.add(re1);
		
		return r;
	}
}