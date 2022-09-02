package com.example.abstractmyorange.onboarding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u0017"}, d2 = {"Lcom/example/abstractmyorange/onboarding/OrderVM;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "offerLoadingUseCase", "Lcom/example/abstractmyorange/domain/usecase/interfaces/IOffersLoadingUseCase;", "getOfferLoadingUseCase", "()Lcom/example/abstractmyorange/domain/usecase/interfaces/IOffersLoadingUseCase;", "setOfferLoadingUseCase", "(Lcom/example/abstractmyorange/domain/usecase/interfaces/IOffersLoadingUseCase;)V", "tariffLiveDate", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/abstractmyorange/domain/entities/Tariff;", "getTariffLiveDate", "()Landroidx/lifecycle/MutableLiveData;", "getTariff", "", "onCleared", "app_debug"})
public final class OrderVM extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "OrderVM";
    @javax.inject.Inject()
    public com.example.abstractmyorange.domain.usecase.interfaces.IOffersLoadingUseCase offerLoadingUseCase;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.abstractmyorange.domain.entities.Tariff> tariffLiveDate = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.abstractmyorange.domain.usecase.interfaces.IOffersLoadingUseCase getOfferLoadingUseCase() {
        return null;
    }
    
    public final void setOfferLoadingUseCase(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.domain.usecase.interfaces.IOffersLoadingUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.abstractmyorange.domain.entities.Tariff> getTariffLiveDate() {
        return null;
    }
    
    public final void getTariff() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public OrderVM() {
        super();
    }
}