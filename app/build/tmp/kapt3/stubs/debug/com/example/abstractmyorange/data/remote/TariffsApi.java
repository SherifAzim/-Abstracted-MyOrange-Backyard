package com.example.abstractmyorange.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J*\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\f"}, d2 = {"Lcom/example/abstractmyorange/data/remote/TariffsApi;", "", "getOfferCost", "Lio/reactivex/Single;", "Lcom/example/abstractmyorange/domain/entities/OfferCostResponse;", "getOffersAndTariffs", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "offersAndTariffsRequestBody", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsRequestBody;", "ctv", "", "htv", "app_debug"})
public abstract interface TariffsApi {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse> getOffersAndTariffs(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.domain.entities.OffersAndTariffsRequestBody offersAndTariffsRequestBody, @org.jetbrains.annotations.Nullable()
    java.lang.String ctv, @org.jetbrains.annotations.Nullable()
    java.lang.String htv);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<com.example.abstractmyorange.domain.entities.OfferCostResponse> getOfferCost();
}