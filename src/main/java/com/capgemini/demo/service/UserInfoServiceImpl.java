package com.capgemini.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.document.DeleteItemOutcome;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.DeleteItemSpec;
import com.capgemini.demo.UserInfo;
import com.capgemini.demo.page.PagiNamtion;

/**
 * @author dimehta
 *
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	@Qualifier("dbClient")
	private AmazonDynamoDBClient dynamoDBClient;

	 /* user Registration based on userId*/
	@Override
	public String registerUser(UserInfo userInfo) {
		DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);
		Table table = dynamoDB.getTable("UserInfo");
		Item item1 = new Item().withPrimaryKey("userId", userInfo.getUserId())
				.withString("userName", userInfo.getUserName()).withString("password", userInfo.getPassword())
				.withString("location", userInfo.getLocation()).withString("education", userInfo.getEducation())
				.withString("primarySkill", userInfo.getPrimarySkill())
				.withString("secondarySkill", userInfo.getSecondarySkill());
		PutItemOutcome outcome = table.putItem(item1);
		return "sucess";

	}

	@Override
	public UserInfo getUserInfo(String id) {
		System.out.println(id);
		DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);
		Table table = dynamoDB.getTable("UserInfo");
		DeleteItemSpec deleteItemSpec = new DeleteItemSpec().withPrimaryKey("Id", 120);
		DeleteItemOutcome outcome = table.deleteItem(deleteItemSpec);
		return null;
	}

	/* if you are sending with same userId then it will update the record */
	@Override
	public String UpdateUserInfo(UserInfo userInfo) {
		//
		DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);
		Table table = dynamoDB.getTable("UserInfo");
		Item item1 = new Item().withPrimaryKey("userId", userInfo.getUserId())
				.withString("userName", userInfo.getUserName()).withString("password", userInfo.getPassword())
				.withString("location", userInfo.getLocation()).withString("education", userInfo.getEducation())
				.withString("primarySkill", userInfo.getPrimarySkill())
				.withString("secondarySkill", userInfo.getSecondarySkill());
		PutItemOutcome outcome = table.putItem(item1);
		return "sucess";
	}

	@Override
	public String deleteUserInfo(String userId) {
		DynamoDB dynamoDB = new DynamoDB(dynamoDBClient);
		Table table = dynamoDB.getTable("UserInfo");
		DeleteItemSpec deleteItemSpec = new DeleteItemSpec().withPrimaryKey("Id", 120);
		DeleteItemOutcome outcome = table.deleteItem(deleteItemSpec);
		return outcome.toString();
	}

	@Override
	public List<UserInfo> getAllUserInfo(String id, PagiNamtion pagiNamtion) {
		// TODO Auto-generated method stub
		return null;
	}

}