package mehmetberkan.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import mehmetberkan.northwind.entities.concretes.Product;


public interface ProductDao extends JpaRepository<Product,Integer>{
	
}

