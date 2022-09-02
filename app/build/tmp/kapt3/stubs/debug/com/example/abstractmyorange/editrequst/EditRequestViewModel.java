package com.example.abstractmyorange.editrequst;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0015H\u0014R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/abstractmyorange/editrequst/EditRequestViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "costCalculationUseCase", "Lcom/example/abstractmyorange/domain/usecase/interfaces/ICostCalculationUseCase;", "getCostCalculationUseCase", "()Lcom/example/abstractmyorange/domain/usecase/interfaces/ICostCalculationUseCase;", "setCostCalculationUseCase", "(Lcom/example/abstractmyorange/domain/usecase/interfaces/ICostCalculationUseCase;)V", "costLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/abstractmyorange/domain/entities/Cost;", "getCostLiveData", "()Landroidx/lifecycle/MutableLiveData;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getCost", "", "onCleared", "app_debug"})
public final class EditRequestViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "EditRequestVM";
    @javax.inject.Inject()
    public com.example.abstractmyorange.domain.usecase.interfaces.ICostCalculationUseCase costCalculationUseCase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.abstractmyorange.domain.entities.Cost> costLiveData = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.abstractmyorange.domain.usecase.interfaces.ICostCalculationUseCase getCostCalculationUseCase() {
        return null;
    }
    
    public final void setCostCalculationUseCase(@org.jetbrains.annotations.NotNull()
    com.example.abstractmyorange.domain.usecase.interfaces.ICostCalculationUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.abstractmyorange.domain.entities.Cost> getCostLiveData() {
        return null;
    }
    
    public final void getCost() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public EditRequestViewModel() {
        super();
    }
}