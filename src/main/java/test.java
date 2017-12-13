/*import java.util.Arrays;
import java.util.HashSet;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

Table table = dynamoDB.getTable("ProductCatalog");

		// Build a list of related items
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
		reviews.put("OneStar", oneStarReviews);

		// Build the item
		Item item = new Item().withPrimaryKey("Id", "123").withString("Title", "Bicycle 123")
				.withString("Description", "123 description").withString("BicycleType", "Hybrid")
				.withString("Brand", "Brand-Company C").withNumber("Price", 500)
				.withStringSet("Color", new HashSet<String>(Arrays.asList("Red", "Black")))
				.withString("ProductCategory", "Bicycle").withBoolean("InStock", true).withNull("QuantityOnHand")
				.withList("RelatedItems", relatedItems).withMap("Pictures", pictures).withMap("Reviews", reviews);
		// Write the item to the table
		PutItemOutcome outcome = table.putItem(item);

		return "sucess";*/