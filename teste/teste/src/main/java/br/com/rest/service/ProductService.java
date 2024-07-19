package br.com.rest.service;

import br.com.rest.mapper.ProductMapper;
import br.com.rest.model.dto.ProductDto;
import br.com.rest.model.entity.ProductEntity;
import br.com.rest.repository.ProductRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    @Inject
    private ProductMapper productMapper;


    public List<ProductDto> findAll() {

        List<ProductEntity> products = productRepository.findAll().list();
        List<ProductDto> dtos;
        dtos =  productMapper.toDTOList(products);

        return dtos;
    }

    public ProductDto create(ProductDto product) {

        ProductEntity productEntity = productMapper.toEntity(product);
        productRepository.persist(productEntity);

        if (productRepository.isPersistent(productEntity)) {
            return productMapper.toDTO(productEntity);
        } else {
            return null;
        }

    }



}
