package com.capgemini.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.capgemini.demo.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	@Qualifier("dbClient")
	private AmazonDynamoDBClient dynamoDBClient;

	@Override
	public String registerUser(UserInfo userInfo) {
		
		 DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);
		Table table = dynamoDB.getTable("UserInfo");

		/*// Build a list of related items
		List<Number> relatedItems = new ArrayList<Number>();
		relatedItems.add(341);
		relatedItems.add(472);
		relatedItems.add(649);

		// Build a map of product pictures
		Map<String, String> pictures = new HashMap<String, String>();
		pictures.put("FrontView", "http://example.com/products/123_front.jpg");
		pictures.put("RearView", "http://example.com/products/123_rear.jpg");
		pictures.put("SideView", "http://example.com/products/123_left_side.jpg");

		// Build a map of product reviews
		Map<String, List<String>> reviews = new HashMap<String, List<String>>();

		List<String> fiveStarReviews = new ArrayList<String>();
		fiveStarReviews.add("Excellent! Can't recommend it highly enough!  Buy it!");
		fiveStarReviews.add("Do yourself a favor and buy this");
		reviews.put("FiveStar", fiveStarReviews);

		List<String> oneStarReviews = new ArrayList<String>();
		oneStarReviews.add("Terrible product!  Do not buy this.");
		reviews.put("OneStar", oneStarReviews);*/

		// Build the item
		/*Item item = new Item().withPrimaryKey("Id", "123").withString("Title", "Bicycle 123")
				.withString("Description", "123 description").withString("BicycleType", "Hybrid")
				.withString("Brand", "Brand-Company C").withNumber("Price", 500)
				.withStringSet("Color", new HashSet<String>(Arrays.asList("Red", "Black")))
				.withString("ProductCategory", "Bicycle").withBoolean("InStock", true).withNull("QuantityOnHand");
		PutItemOutcome outcome = table.putItem(item);*/
		Item item1=new Item().withPrimaryKey("userId",userInfo.getUserId()).withString("userName",userInfo.getUserName())
				.withString("password", userInfo.getPassword()).withString("location", userInfo.getLocation())
				.withString("education", userInfo.getEducation()).withString("primarySkill", userInfo.getPrimarySkill())
				.withString("secondarySkill", userInfo.getSecondarySkill());	
		PutItemOutcome outcome = table.putItem(item1);

		return "sucess";

	}

	@Override
	public UserInfo getUserInfo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String UpdateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUserInfo(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	

}