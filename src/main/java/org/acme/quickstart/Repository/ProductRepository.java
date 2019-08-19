package org.acme.quickstart.Repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.acme.quickstart.entity.Product;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductRepository implements PanacheRepository<Product> {
}
