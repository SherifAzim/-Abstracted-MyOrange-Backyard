package com.example.abstractmyorange.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/abstractmyorange/data/repositories/DataSource;", "Lcom/example/abstractmyorange/data/remote/TariffsApi;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "tariffCostJsonFile", "", "tariffsJsonFile", "getOfferCost", "Lio/reactivex/Single;", "Lcom/example/abstractmyorange/domain/entities/OfferCostResponse;", "getOffersAndTariffs", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "offersAndTariffsRequestBody", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsRequestBody;", "ctv", "htv", "app_debug"})
public final class DataSource implements com.example.abstractmyorange.data.remote.TariffsApi {
    private final java.lang.String tariffsJsonFile = "tariffs.json";
    private final java.lang.String tariffCostJsonFile = "tariffcost.json";
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse> getOffersAndTariffs(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.domain.entities.OffersAndTariffsRequestBody offersAndTariffsRequestBody, @org.jetbrains.annotations.Nullable()
    java.lang.String ctv, @org.jetbrains.annotations.Nullable()
    java.lang.String htv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.abstractmyorange.domain.entities.OfferCostResponse> getOfferCost() {
        return null;
    }
    
    @javax.inject.Inject()
    public DataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}