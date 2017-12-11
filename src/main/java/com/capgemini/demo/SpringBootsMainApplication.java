package com.capgemini.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableAsync;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.RegionUtils;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@SpringBootApplication
@ComponentScan
@EnableAsync
@Configuration
@EnableSwagger2
public class SpringBootsMainApplication {
	@Autowired 
	
	@Value("${aws.accessKeyId}")
	private String accessKeyId;
	
	@Value("${aws.secretAccessKey}")
	private String secretAccessKey;
	
	@Value("${aws.regionName}")
	private String regionName;
	
	@Value("${aws.endPoint}")
	private String endPoint;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootsMainApplication.class, args);
	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.capgemini.demo")).paths(PathSelectors.any()).build();

	}
	
	@Bean(name = "dbClient")
	public AmazonDynamoDBClient getAmazonClient() {
		AWSCredentials awsCredentials = new BasicAWSCredentials(accessKeyId, secretAccessKey);
		AmazonDynamoDBClient dynamoDBClient = new AmazonDynamoDBClient(awsCredentials);
		dynamoDBClient.withRegion(RegionUtils.getRegion(regionName));
		dynamoDBClient.withEndpoint(endPoint);

		return dynamoDBClient;
	}
}
