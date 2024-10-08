package com.rodolphog.springProject.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.rodolphog.springProject.entities.Category;
import com.rodolphog.springProject.entities.Order;
import com.rodolphog.springProject.entities.Product;
import com.rodolphog.springProject.entities.User;
import com.rodolphog.springProject.entities.enums.OrderStatus;
import com.rodolphog.springProject.repositories.CategoryRepository;
import com.rodolphog.springProject.repositories.OrderRepository;
import com.rodolphog.springProject.repositories.ProductRepository;
import com.rodolphog.springProject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category category1 = new Category(null, "Eletronics");
		Category category2 = new Category(null, "Books");
		Category category3 = new Category(null, "Computers");
		
		Product product1 = new Product(null, "The Lord of the Rings", "Loren ipsun dolor sit amet, consectetur.",90.5,"");
		Product product2 = new Product(null, "Smart TV", "Nulla eu imperdiet imperdit purus. Maecenas ante.",2190.0, "");
		Product product3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product product4 = new Product(null, "Pc Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0,"");
		Product product5 = new Product(null, "Rails for Dummies", "Cras fingilla convallis sem vel faucibus", 100.99,"");
		
		User user1 = new User(null, "Maria Brown", "maria@gmail.com", "998888888", "123456");
		User user2 = new User(null, "Alex Green", "alex@gmail.com", "99777777", "123456");
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID,user1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T19:42:10Z"), OrderStatus.WAITING_PAYMENT,user2);
		Order order3 = new Order(null, Instant.parse("2019-07-22T19:21:22Z"), OrderStatus.WAITING_PAYMENT,user1);

		
		userRepository.saveAll(Arrays.asList(user1, user2));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
		categoryRepository.saveAll(Arrays.asList(category1,category2,category3));
		productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));
		
	}
	
	
	

}
