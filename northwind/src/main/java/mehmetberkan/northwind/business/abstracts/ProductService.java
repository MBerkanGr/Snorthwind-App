package mehmetberkan.northwind.business.abstracts;

import java.util.List;

import mehmetberkan.northwind.core.utilities.results.DataResult;
import mehmetberkan.northwind.core.utilities.results.Result;
import mehmetberkan.northwind.entities.concretes.Product;
import mehmetberkan.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductService {
	DataResult<List<Product>> getAll();
	DataResult<List<Product>> getAllSorted();
	DataResult<List<Product>> getAll(int pageNo , int pageSize);
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName , int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategoryId(String productName , int categoryId);
	
	DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories);
	
	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
	
}
