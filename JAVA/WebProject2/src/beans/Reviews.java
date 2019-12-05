package beans;

import java.util.ArrayList;
import java.util.List;

public class Reviews {
	private List<String> reviewList;
	
	public Reviews() {
		reviewList = new ArrayList<>();
	}
	
	 public void addReview(String review) {
		 reviewList.add(review);
	 }
	 
	 public List<String> getReviewList() {
		 return reviewList;
	 }

}
