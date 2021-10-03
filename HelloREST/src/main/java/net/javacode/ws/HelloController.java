package net.javacode.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProduct(@PathVariable int id){
		if( id == 3) {
			Product product = new Product (3,"orange",100);
			return new ResponseEntity<Product>(product,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<Product>(HttpStatus.BAD_REQUEST);
		}
	}
	/*@GetMapping(
			value = "/getproduct",
			consumes = {MediaType.TEXT_HTML_VALUE},
			produces = {MediaType.TEXT_XML_VALUE}
			)
	public String getProduct() {
		return "Hello";
		
	}
	
	@PostMapping("/addproduct")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product);
	}
	
	@GetMapping( "/getProducts")
	public List<Product> getProducts(){
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(2,"Mango",5f));
		products.add(new Product(3,"Mango",5f));
		products.add(new Product(4,"Mango",5f));
		products.add(new Product(5,"Mango",5f));
		
		return products;
	}
	
	 
/*	
	@PostMapping("/hello")
	public String doPost() {
		return "you have sent Post";
	}

	@PutMapping("/hello") 
	public String add() {
		return "you have sent PUT request";
	}
	
	@DeleteMapping("/hello")
	public String delete() {
		return "you have sent DELETE request";
	}
*/
	}
