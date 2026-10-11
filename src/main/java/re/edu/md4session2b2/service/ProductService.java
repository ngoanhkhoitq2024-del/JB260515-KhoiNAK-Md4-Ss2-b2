package re.edu.md4session2b2.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import re.edu.md4session2b2.dto.ProductResponseDto;
import re.edu.md4session2b2.entity.Product;
import re.edu.md4session2b2.exception.ProductNotFoundException;
import re.edu.md4session2b2.repository.ProductRepository;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ProductResponseDto getProductById(Long id) {
        Product product = productRepository.findById(id).orElseThrow(() ->
                        new ProductNotFoundException(
                                "Không tìm thấy sản phẩm có id: " + id)
                );

        return new ProductResponseDto(
                product.getId(),
                product.getName(),
                product.getSellPrice()
        );
    }
}
