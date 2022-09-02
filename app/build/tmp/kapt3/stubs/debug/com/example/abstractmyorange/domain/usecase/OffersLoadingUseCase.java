package com.example.abstractmyorange.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/abstractmyorange/domain/usecase/OffersLoadingUseCase;", "Lcom/example/abstractmyorange/domain/usecase/interfaces/IOffersLoadingUseCase;", "tariffRepo", "Lcom/example/abstractmyorange/domain/repositories/ITariffsRepo;", "(Lcom/example/abstractmyorange/domain/repositories/ITariffsRepo;)V", "loadOffers", "Lio/reactivex/Single;", "Lcom/example/abstractmyorange/domain/usecase/OffersLoadingResponseCode;", "mapToResponseCode", "offersResponse", "Lcom/example/abstractmyorange/domain/entities/OffersAndTariffsResponse;", "app_debug"})
public final class OffersLoadingUseCase implements com.example.abstractmyorange.domain.usecase.interfaces.IOffersLoadingUseCase {
    private final com.example.abstractmyorange.domain.repositories.ITariffsRepo tariffRepo = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.abstractmyorange.domain.usecase.OffersLoadingResponseCode> loadOffers() {
        return null;
    }
    
    private final com.example.abstractmyorange.domain.usecase.OffersLoadingResponseCode mapToResponseCode(com.example.abstractmyorange.domain.entities.OffersAndTariffsResponse offersResponse) {
        return null;
    }
    
    @javax.inject.Inject()
    public OffersLoadingUseCase(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.domain.repositories.ITariffsRepo tariffRepo) {
        super();
    }
}