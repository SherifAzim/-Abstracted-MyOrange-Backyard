package com.example.abstractmyorange.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/abstractmyorange/data/repositories/TariffsRepo;", "Lcom/example/abstractmyorange/domain/repositories/ITariffsRepo;", "tariffsApi", "Lcom/example/abstractmyorange/data/remote/TariffsApi;", "(Lcom/example/abstractmyorange/data/remote/TariffsApi;)V", "fetchAvailableOffers", "Lio/reactivex/Single;", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "header", "", "fetchOfferCost", "Lcom/example/abstractmyorange/domain/entities/OfferCostResponse;", "app_debug"})
public final class TariffsRepo implements com.example.abstractmyorange.domain.repositories.ITariffsRepo {
    private final com.example.abstractmyorange.data.remote.TariffsApi tariffsApi = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse> fetchAvailableOffers(@org.jetbrains.annotations.NotNull()
    java.lang.String header) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.abstractmyorange.domain.entities.OfferCostResponse> fetchOfferCost() {
        return null;
    }
    
    @javax.inject.Inject()
    public TariffsRepo(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.data.remote.TariffsApi tariffsApi) {
        super();
    }
}