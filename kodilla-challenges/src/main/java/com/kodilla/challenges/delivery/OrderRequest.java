package com.kodilla.challenges.delivery;

public class OrderRequest {
    public final Vendor vendor;
    public final Product product;

    public OrderRequest(final Vendor vendor, final Product product) {
        this.vendor = vendor;
        this.product = product;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public Product getProduct() {
        return product;
    }

}
