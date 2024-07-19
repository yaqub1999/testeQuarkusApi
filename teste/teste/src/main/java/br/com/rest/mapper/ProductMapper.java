package br.com.rest.mapper;

import br.com.rest.model.dto.ProductDto;
import br.com.rest.model.entity.ProductEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "jakarta")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto toDTO(ProductEntity product);

    ProductEntity toEntity(ProductDto productDTO);

    List<ProductDto> toDTOList(List<ProductEntity> products);

    List<ProductEntity> toEntityList(List<ProductDto> productDTOs);



}
