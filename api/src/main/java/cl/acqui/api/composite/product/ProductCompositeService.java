package cl.acqui.api.composite.product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@Tag(name = "ProductComposite", description = "REST API of composite product information.")
public interface ProductCompositeService {

  @Operation(
          summary = "${api.product-composite.delete-composite-product.description}",
          description = "${api.product-composite.delete-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @ResponseStatus(HttpStatus.ACCEPTED)
  @DeleteMapping(value = "/product-composite/{productId}")
  Mono<Void> deleteProduct(@PathVariable int productId);

  @Operation(
          summary = "${api.product-composite.get-composite-product.description}",
          description = "${api.product-composite.get-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "${api.responseCodes.ok.description}"),
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "404", description = "${api.responseCodes.notFound.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @GetMapping(
          value = "/product-composite/{productId}",
          produces = "application/json")
  Mono<ProductAggregate> getProduct(@PathVariable int productId);

  @Operation(
          summary = "${api.product-composite.create-composite-product.description}",
          description = "${api.product-composite.create-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @ResponseStatus(HttpStatus.ACCEPTED)
  @PostMapping(
          value    = "/product-composite",
          consumes = "application/json")
  Mono<Void> createProduct(@RequestBody ProductAggregate body);


  /* Note: This code is before the integration of WebFlux
  @Operation(
          summary = "${api.product-composite.create-composite-product.description}",
          description = "${api.product-composite.create-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @PostMapping(
          value    = "/product-composite",
          consumes = "application/json")
  void createProduct(@RequestBody ProductAggregate body);


  @Operation(
          summary = "${api.product-composite.get-composite-product.description}",
          description = "${api.product-composite.get-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "200", description = "${api.responseCodes.ok.description}"),
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "404", description = "${api.responseCodes.notFound.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @GetMapping(
          value = "/product-composite/{productId}",
          produces = "application/json")
  ProductAggregate getProduct(@PathVariable int productId);


  @Operation(
          summary = "${api.product-composite.delete-composite-product.description}",
          description = "${api.product-composite.delete-composite-product.notes}")
  @ApiResponses(value = {
          @ApiResponse(responseCode = "400", description = "${api.responseCodes.badRequest.description}"),
          @ApiResponse(responseCode = "422", description = "${api.responseCodes.unprocessableEntity.description}")
  })
  @DeleteMapping(value = "/product-composite/{productId}")
  void deleteProduct(@PathVariable int productId);

   */
}
