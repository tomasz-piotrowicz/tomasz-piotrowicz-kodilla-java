package com.kodilla.challenges.delivery;

public class OrderProcessor {
    private Producer producer;

    public OrderProcessor(Producer producer) {
        this.producer = producer;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean creatingOrder(final OrderRequest orderRequest){
        producer.process(orderRequest);
        return true;
    }



}
