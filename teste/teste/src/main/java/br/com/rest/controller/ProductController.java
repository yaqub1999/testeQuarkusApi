package br.com.rest.controller;

import br.com.rest.model.dto.ProductDto;
import br.com.rest.service.ProductService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/product")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductController {

    @Inject
    private ProductService productService;

    @Transactional
    @POST
    public ProductDto create(ProductDto product) {
        return productService.create(product);
    }

    @RequestScoped
    @Transactional
    @GET
    @RolesAllowed("VIEWER")
    public List<ProductDto> findAll() {
        return productService.findAll();
    }
}
